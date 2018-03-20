package org.vilchezruben.climatix.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.vilchezruben.climatix.R;
import org.vilchezruben.climatix.weather.Current;
import org.vilchezruben.climatix.weather.Day;
import org.vilchezruben.climatix.weather.Forecast;
import org.vilchezruben.climatix.weather.Hour;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private final String apikey = "4c34a5e97de8707b362a05691b22f49b";
    @BindView(R.id.temperatureLabel)
    TextView mTemperatureLabel;
    @BindView(R.id.timeLabel)
    TextView mTimeLabel;
    @BindView(R.id.iconImageView)
    ImageView mIconImageView;
    @BindView(R.id.humidityValue)
    TextView mHumidityValue;
    @BindView(R.id.precipValue)
    TextView mPrecipValue;
    @BindView(R.id.summaryLabel)
    TextView mSummaryLabel;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    @BindView(R.id.refreshImageView)
    ImageView mImageRefress;
    private double mLatitude = 4.598889;
    private double mLongitude = -74.080833;
    String foreCastUrl = "https://api.darksky.net/forecast/" + apikey + "/" + mLatitude + "," + mLongitude;
    private OkHttpClient clientHttp;
    private Forecast mForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        clientHttp = new OkHttpClient();

        getForecast(mLatitude, mLongitude);


    }

    private void getForecast(final double latitude, double longitude) {

        Request request = new Request.Builder().url(foreCastUrl).build();
        if (isNetWorkAvailable()) {
            toogleRefresh();
            clientHttp.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                    e.getStackTrace();
                    alertUserAboutError(e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            toogleRefresh();
                        }
                    });
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {


                        String jsonData = response.body().string();

                        if (response.isSuccessful()) {
                            Log.v(TAG, jsonData);
                            mForecast = parseForecastDetail(jsonData);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    toogleRefresh();
                                    updateDisplay();
                                }
                            });
                        } else {
                            alertUserAboutError(getString(R.string.error_no_conectado));

                        }

                    } catch (JSONException e) {
                        alertUserAboutError(e.getMessage());
                        Log.e(TAG, e.getMessage(), e);
                    }


                }
            });


        }
    }

    private void toogleRefresh() {
        if (mProgressBar.getVisibility() == View.INVISIBLE) {
            mProgressBar.setVisibility(View.VISIBLE);
            mImageRefress.setVisibility(View.INVISIBLE);
        } else {
            mProgressBar.setVisibility(View.INVISIBLE);
            mImageRefress.setVisibility(View.VISIBLE);
        }
    }

    private void updateDisplay() {
        Current current = mForecast.getCurrent();
        mTemperatureLabel.setText(current.getTemperature() + "");
        mTimeLabel.setText(("At " + current.getFormattedTime() + " it will be"));
        Drawable drawable = getDrawable(current.getIcon());
        mIconImageView.setImageDrawable(drawable);
        mHumidityValue.setText(current.getHumidity() + "");
        mPrecipValue.setText(current.getPrecipProbability() + "");
        mSummaryLabel.setText(current.getSummary());

    }

    private void alertUserAboutError(String message) {
        AlertDialogFragmen alertDialogFragmen = new AlertDialogFragmen();
        Bundle param = new Bundle();
        param.putString("message", message);
        alertDialogFragmen.setArguments(param);
        alertDialogFragmen.show(getFragmentManager(), TAG);
    }

    private boolean isNetWorkAvailable() {
        boolean isAvailable = false;
        NetworkInfo info = null;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            info = connectivityManager.getActiveNetworkInfo();
        }
        if (info != null) {
            isAvailable = info.isConnected();
        }

        return isAvailable;
    }


    private Forecast parseForecastDetail(String jsonData) throws JSONException {
        JSONObject jsonObject = new JSONObject(jsonData);
        Forecast forecast = new Forecast();
        forecast.setCurrent(getCurrentForecast(jsonObject));
        forecast.setDays(getDailyForecast(jsonObject));
        forecast.setHours(getHourlyForecaste(jsonObject));

        return forecast;
    }

    private Hour[] getHourlyForecaste(JSONObject jsonObject) throws JSONException {
        JSONObject hourly = jsonObject.getJSONObject("hourly");
        JSONArray arrayHours = hourly.getJSONArray("data");
        Hour[] hours = new Hour[arrayHours.length()];
        for (int i = 0; i < arrayHours.length(); i++) {
            JSONObject jsonHour = arrayHours.getJSONObject(i);
            Hour hour = new Hour(jsonObject.getString("timezone"));

            hour.setTime(jsonHour.getLong("time"));
            hour.setSummary(jsonHour.getString("summary"));
            hour.setIcon(jsonHour.getString("icon"));
            hour.setPrecipIntensity(jsonHour.getDouble("precipIntensity"));
            hour.setPrecipProbability(jsonHour.getDouble("precipProbability"));
            hour.setPrecipType(jsonHour.getString("precipType"));
            hour.setTemperature(jsonHour.getDouble("temperature"));
            hour.setApparentTemperature(jsonHour.getDouble("apparentTemperature"));
            hour.setDewPoint(jsonHour.getDouble("dewPoint"));
            hour.setHumidity(jsonHour.getDouble("humidity"));
            hour.setPressure(jsonHour.getDouble("pressure"));
            hour.setWindSpeed(jsonHour.getDouble("windSpeed"));
            hour.setWindGust(jsonHour.getDouble("windGust"));
            hour.setWindBearing(jsonHour.getDouble("windBearing"));
            hour.setCloudCover(jsonHour.getDouble("cloudCover"));
            hour.setUvIndex(jsonHour.getInt("uvIndex"));
            hour.setVisibility(jsonHour.getDouble("visibility"));
            hour.setOzone(jsonHour.getDouble("ozone"));
            hours[i] = hour;
        }

        return hours;
    }

    private Day[] getDailyForecast(JSONObject jsonObject) throws JSONException {
        JSONObject daily = jsonObject.getJSONObject("daily");
        JSONArray jsonArrayDaily = daily.getJSONArray("data");
        Day[] days = new Day[jsonArrayDaily.length()];
        for (int i = 0; i < jsonArrayDaily.length(); i++) {
            JSONObject jsonDay = jsonArrayDaily.getJSONObject(i);
            Day day = new Day(jsonObject.getString("timezone"));
            day.setTime(jsonDay.getLong("time"));
            day.setSummary(jsonDay.getString("summary"));
            day.setIcon(jsonDay.getString("icon"));
            day.setSunriseTime(jsonDay.getLong("sunriseTime"));
            day.setSunsetTime(jsonDay.getLong("sunsetTime"));
            day.setMoonPhase(jsonDay.getDouble("moonPhase"));
            day.setPrecipIntensity(jsonDay.getDouble("precipIntensity"));
            day.setPrecipIntensityMax(jsonDay.getDouble("precipIntensityMax"));
            day.setPrecipIntensityMaxTime(jsonDay.getLong("precipIntensityMaxTime"));
            day.setPrecipProbability(jsonDay.getDouble("precipProbability"));
            day.setPrecipType(jsonDay.getString("precipType"));
            day.setTemperatureHigh(jsonDay.getLong("temperatureHigh"));
            day.setTemperatureHighTime(jsonDay.getLong("temperatureHighTime"));
            day.setTemperatureLow(jsonDay.getDouble("temperatureLow"));
            day.setTemperatureLowTime(jsonDay.getLong("temperatureLowTime"));
            day.setApparentTemperatureHigh(jsonDay.getDouble("apparentTemperatureHigh"));
            day.setApparentTemperatureHighTime(jsonDay.getLong("apparentTemperatureHighTime"));
            day.setApparentTemperatureLow(jsonDay.getDouble("apparentTemperatureLow"));
            day.setApparentTemperatureLowTime(jsonDay.getLong("apparentTemperatureLowTime"));
            day.setDewPoint(jsonDay.getDouble("dewPoint"));
            day.setHumidity(jsonDay.getDouble("humidity"));
            day.setPressure(jsonDay.getDouble("pressure"));
            day.setWindSpeed(jsonDay.getDouble("windSpeed"));
            day.setWindGust(jsonDay.getDouble("windGust"));
            day.setWindGustTime(jsonDay.getLong("windGustTime"));
            day.setWindBearing(jsonDay.getLong("windBearing"));
            day.setCloudCover(jsonDay.getDouble("cloudCover"));
            day.setUvIndex(jsonDay.getInt("uvIndex"));
            day.setUvIndexTime(jsonDay.getLong("uvIndexTime"));
            if (!jsonDay.isNull("visibility"))
                day.setVisibility(jsonDay.getDouble("visibility"));
            day.setOzone(jsonDay.getDouble("ozone"));
            day.setTemperatureMin(jsonDay.getDouble("temperatureMin"));
            day.setTemperatureMinTime(jsonDay.getLong("temperatureMinTime"));
            day.setTemperatureMax(jsonDay.getDouble("temperatureMax"));
            day.setTemperatureMaxTime(jsonDay.getLong("temperatureMaxTime"));
            day.setApparentTemperatureMin(jsonDay.getDouble("apparentTemperatureMin"));
            day.setApparentTemperatureMinTime(jsonDay.getLong("apparentTemperatureMinTime"));
            day.setApparentTemperatureMax(jsonDay.getDouble("apparentTemperatureMax"));
            day.setApparentTemperatureMaxTime(jsonDay.getLong("apparentTemperatureMaxTime"));
            days[i] = day;
        }
        return days;
    }

    private Current getCurrentForecast(JSONObject jsonObject) throws JSONException {

        Current current = new Current(jsonObject.getString("timezone"));
        JSONObject currently = jsonObject.getJSONObject("currently");
        current.setTime(currently.getLong("time"));
        current.setSummary(currently.getString("summary"));
        current.setIcon(currently.getString("icon"));
        current.setPrecipIntensity(currently.getDouble("precipIntensity"));
        current.setPrecipProbability(currently.getDouble("precipProbability"));
        current.setPrecipType(currently.getString("precipType"));
        current.setTemperature(currently.getDouble("temperature"));
        current.setApparentTemperature(currently.getDouble("apparentTemperature"));
        current.setDewPoint(currently.getDouble("dewPoint"));
        current.setHumidity(currently.getDouble("humidity"));
        current.setPressure(currently.getDouble("pressure"));
        current.setWindSpeed(currently.getDouble("windSpeed"));
        current.setWindGust(currently.getDouble("windGust"));
        current.setWindBearing(currently.getDouble("windBearing"));
        current.setCloudCover(currently.getDouble("cloudCover"));
        current.setUvIndex(currently.getLong("uvIndex"));
        current.setVisibility(currently.getDouble("visibility"));
        current.setOzone(currently.getDouble("ozone"));

        return current;

    }

    @OnClick(R.id.refreshImageView)
    public void onClickRefreshImageView(View view) {
        getForecast(mLatitude, mLongitude);
    }

    @OnClick(R.id.dailyButton)
    public void startDailyActivity(View view) {

    }

    @OnClick(R.id.horlyButton)
    public void startHourlyActivity(View view) {

    }

}
