package org.vilchezruben.climatix.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import org.vilchezruben.climatix.R;
import org.vilchezruben.climatix.adapters.HourAdapter;
import org.vilchezruben.climatix.weather.Hour;

import java.util.Arrays;

public class HourlyForecastActivity extends ListActivity {

    Hour[] mHours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
        Intent intent = getIntent();

        Parcelable[] parcelable = intent.getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelable, parcelable.length, Hour[].class);

        HourAdapter hourAdapter = new HourAdapter(this, mHours);

        setListAdapter(hourAdapter);


    }
}
