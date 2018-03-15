package org.vilchezruben.climatix.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Vilchez Ruben on 13/03/2018.
 */

public class Current {

    private long mTime;
    private String mSummary;
    private String mIcon;
    private double mPrecipIntensity;
    private double mPrecipProbability;
    private String mPrecipType;
    private double mTemperature;
    private double mApparentTemperature;
    private double mDewPoint;
    private double mHumidity;
    private double mPressure;
    private double mWindSpeed;
    private double mWindGust;
    private double mWindBearing;
    private double mCloudCover;
    private long mUvIndex;
    private double mVisibility;
    private double mOzone;
    private String mTimeZone;


    public Current() {
    }

    public Current(String timeZone) {
        mTimeZone = timeZone;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public int getIcon() {

        return Forecast.getIconId(mIcon);

    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public double getPrecipIntensity() {
        return mPrecipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        mPrecipIntensity = precipIntensity;
    }

    public int getPrecipProbability() {
        double precipPercentage = mPrecipProbability * 100;

        return (int) Math.round(precipPercentage);
    }

    public void setPrecipProbability(double precipProbability) {
        mPrecipProbability = precipProbability;
    }

    public String getPrecipType() {
        return mPrecipType;
    }

    public void setPrecipType(String precipType) {
        mPrecipType = precipType;
    }

    public int getTemperature() {
        int temperatureCentigrade = (int) Math.round((mTemperature - 32) * 5 / 9);

        return temperatureCentigrade;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public int getApparentTemperature() {
        int temperatureCentigrade = (int) Math.round((mTemperature - 32) * 5 / 9);

        return temperatureCentigrade;
    }

    public void setApparentTemperature(double apparentTemperature) {
        mApparentTemperature = apparentTemperature;
    }

    public double getDewPoint() {
        return mDewPoint;
    }

    public void setDewPoint(double dewPoint) {
        mDewPoint = dewPoint;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPressure() {
        return mPressure;
    }

    public void setPressure(double pressure) {
        mPressure = pressure;
    }

    public double getWindSpeed() {
        return mWindSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        mWindSpeed = windSpeed;
    }

    public double getWindGust() {
        return mWindGust;
    }

    public void setWindGust(double windGust) {
        mWindGust = windGust;
    }

    public double getWindBearing() {
        return mWindBearing;
    }

    public void setWindBearing(double windBearing) {
        mWindBearing = windBearing;
    }

    public double getCloudCover() {
        return mCloudCover;
    }

    public void setCloudCover(double cloudCover) {
        mCloudCover = cloudCover;
    }

    public long getUvIndex() {
        return mUvIndex;
    }

    public void setUvIndex(long uvIndex) {
        mUvIndex = uvIndex;
    }

    public double getVisibility() {
        return mVisibility;
    }

    public void setVisibility(double visibility) {
        mVisibility = visibility;
    }

    public double getOzone() {
        return mOzone;
    }

    public void setOzone(double ozone) {
        mOzone = ozone;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Current)) return false;

        Current current = (Current) o;

        if (getTime() != current.getTime()) return false;
        if (Double.compare(current.getPrecipIntensity(), getPrecipIntensity()) != 0) return false;
        if (Double.compare(current.getPrecipProbability(), getPrecipProbability()) != 0)
            return false;
        if (Double.compare(current.getTemperature(), getTemperature()) != 0) return false;
        if (Double.compare(current.getApparentTemperature(), getApparentTemperature()) != 0)
            return false;
        if (Double.compare(current.getDewPoint(), getDewPoint()) != 0) return false;
        if (Double.compare(current.getHumidity(), getHumidity()) != 0) return false;
        if (Double.compare(current.getPressure(), getPressure()) != 0) return false;
        if (Double.compare(current.getWindSpeed(), getWindSpeed()) != 0) return false;
        if (Double.compare(current.getWindGust(), getWindGust()) != 0) return false;
        if (Double.compare(current.getWindBearing(), getWindBearing()) != 0) return false;
        if (Double.compare(current.getCloudCover(), getCloudCover()) != 0) return false;
        if (getUvIndex() != current.getUvIndex()) return false;
        if (Double.compare(current.getVisibility(), getVisibility()) != 0) return false;
        if (Double.compare(current.getOzone(), getOzone()) != 0) return false;
        if (getSummary() != null ? !getSummary().equals(current.getSummary()) : current.getSummary() != null)
            return false;

        if (getPrecipType() != null ? !getPrecipType().equals(current.getPrecipType()) : current.getPrecipType() != null)
            return false;
        return getTimeZone() != null ? getTimeZone().equals(current.getTimeZone()) : current.getTimeZone() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getTime() ^ (getTime() >>> 32));
        result = 31 * result + (getSummary() != null ? getSummary().hashCode() : 0);

        temp = Double.doubleToLongBits(getPrecipIntensity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrecipProbability());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getPrecipType() != null ? getPrecipType().hashCode() : 0);
        temp = Double.doubleToLongBits(getTemperature());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getApparentTemperature());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDewPoint());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHumidity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPressure());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWindSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWindGust());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWindBearing());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCloudCover());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getUvIndex() ^ (getUvIndex() >>> 32));
        temp = Double.doubleToLongBits(getVisibility());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getOzone());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getTimeZone() != null ? getTimeZone().hashCode() : 0);
        return result;
    }

    public String getFormattedTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date date = new Date(getTime() * 1000);
        String timeString = simpleDateFormat.format(date);

        return timeString;
    }

    @Override
    public String toString() {
        return "Current{" +
                "mTime=" + mTime +
                ", mSummary='" + mSummary + '\'' +
                ", mIcon='" + mIcon + '\'' +
                ", mPrecipProbability=" + mPrecipProbability +
                ", mPrecipType='" + mPrecipType + '\'' +
                ", mTemperature=" + mTemperature +
                ", mApparentTemperature=" + mApparentTemperature +
                ", mHumidity=" + mHumidity +
                '}';
    }
}
