package org.vilchezruben.climatix.weather;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Vilchez Ruben on 13/03/2018.
 */


public class Day implements Parcelable {

    public static final Creator<Day> CREATOR = new Creator<Day>() {
        @Override
        public Day createFromParcel(Parcel in) {
            return new Day(in);
        }

        @Override
        public Day[] newArray(int size) {
            return new Day[size];
        }
    };
    private long mTime;
    private String mSummary;
    private String mIcon;
    private long mSunriseTime;
    private long mSunsetTime;
    private double mMoonPhase;
    private double mPrecipIntensity;
    private double mPrecipIntensityMax;
    private long mPrecipIntensityMaxTime;
    private double mPrecipProbability;
    private String mPrecipType;
    private double mTemperatureHigh;
    private long mTemperatureHighTime;
    private double mTemperatureLow;
    private long mTemperatureLowTime;
    private double mApparentTemperatureHigh;
    private long mApparentTemperatureHighTime;
    private double mApparentTemperatureLow;
    private long mApparentTemperatureLowTime;
    private double mDewPoint;
    private double mHumidity;
    private double mPressure;
    private double mWindSpeed;
    private double mWindGust;
    private long mWindGustTime;
    private long mWindBearing;
    private double mCloudCover;
    private int mUvIndex;
    private long mUvIndexTime;
    private double mVisibility;
    private double mOzone;
    private double mTemperatureMin;
    private long mTemperatureMinTime;
    private double mTemperatureMax;
    private long mTemperatureMaxTime;
    private double mApparentTemperatureMin;
    private long mApparentTemperatureMinTime;
    private double mApparentTemperatureMax;
    private long mApparentTemperatureMaxTime;
    private String mTimeZone;

    public Day() {
    }

    public Day(String timeZone) {
        mTimeZone = timeZone;
    }

    protected Day(Parcel in) {
        mTime = in.readLong();
        mSummary = in.readString();
        mIcon = in.readString();
        mSunriseTime = in.readLong();
        mSunsetTime = in.readLong();
        mMoonPhase = in.readDouble();
        mPrecipIntensity = in.readDouble();
        mPrecipIntensityMax = in.readDouble();
        mPrecipIntensityMaxTime = in.readLong();
        mPrecipProbability = in.readDouble();
        mPrecipType = in.readString();
        mTemperatureHigh = in.readDouble();
        mTemperatureHighTime = in.readLong();
        mTemperatureLow = in.readDouble();
        mTemperatureLowTime = in.readLong();
        mApparentTemperatureHigh = in.readDouble();
        mApparentTemperatureHighTime = in.readLong();
        mApparentTemperatureLow = in.readDouble();
        mApparentTemperatureLowTime = in.readLong();
        mDewPoint = in.readDouble();
        mHumidity = in.readDouble();
        mPressure = in.readDouble();
        mWindSpeed = in.readDouble();
        mWindGust = in.readDouble();
        mWindGustTime = in.readLong();
        mWindBearing = in.readLong();
        mCloudCover = in.readDouble();
        mUvIndex = in.readInt();
        mUvIndexTime = in.readLong();
        mVisibility = in.readDouble();
        mOzone = in.readDouble();
        mTemperatureMin = in.readDouble();
        mTemperatureMinTime = in.readLong();
        mTemperatureMax = in.readDouble();
        mTemperatureMaxTime = in.readLong();
        mApparentTemperatureMin = in.readDouble();
        mApparentTemperatureMinTime = in.readLong();
        mApparentTemperatureMax = in.readDouble();
        mApparentTemperatureMaxTime = in.readLong();
        mTimeZone = in.readString();
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

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getSunriseTime() {
        return mSunriseTime;
    }

    public void setSunriseTime(long sunriseTime) {
        mSunriseTime = sunriseTime;
    }

    public long getSunsetTime() {
        return mSunsetTime;
    }

    public void setSunsetTime(long sunsetTime) {
        mSunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return mMoonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        mMoonPhase = moonPhase;
    }

    public double getPrecipIntensity() {
        return mPrecipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        mPrecipIntensity = precipIntensity;
    }

    public double getPrecipIntensityMax() {
        return mPrecipIntensityMax;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        mPrecipIntensityMax = precipIntensityMax;
    }

    public long getPrecipIntensityMaxTime() {
        return mPrecipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(long precipIntensityMaxTime) {
        mPrecipIntensityMaxTime = precipIntensityMaxTime;
    }

    public double getPrecipProbability() {
        return mPrecipProbability;
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

    public double getTemperatureHigh() {
        return mTemperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        mTemperatureHigh = temperatureHigh;
    }

    public long getTemperatureHighTime() {
        return mTemperatureHighTime;
    }

    public void setTemperatureHighTime(long temperatureHighTime) {
        mTemperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return mTemperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        mTemperatureLow = temperatureLow;
    }

    public long getTemperatureLowTime() {
        return mTemperatureLowTime;
    }

    public void setTemperatureLowTime(long temperatureLowTime) {
        mTemperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return mApparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        mApparentTemperatureHigh = apparentTemperatureHigh;
    }

    public long getApparentTemperatureHighTime() {
        return mApparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(long apparentTemperatureHighTime) {
        mApparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return mApparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        mApparentTemperatureLow = apparentTemperatureLow;
    }

    public long getApparentTemperatureLowTime() {
        return mApparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(long apparentTemperatureLowTime) {
        mApparentTemperatureLowTime = apparentTemperatureLowTime;
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

    public long getWindGustTime() {
        return mWindGustTime;
    }

    public void setWindGustTime(long windGustTime) {
        mWindGustTime = windGustTime;
    }

    public long getWindBearing() {
        return mWindBearing;
    }

    public void setWindBearing(long windBearing) {
        mWindBearing = windBearing;
    }

    public double getCloudCover() {
        return mCloudCover;
    }

    public void setCloudCover(double cloudCover) {
        mCloudCover = cloudCover;
    }

    public int getUvIndex() {
        return mUvIndex;
    }

    public void setUvIndex(int uvIndex) {
        mUvIndex = uvIndex;
    }

    public long getUvIndexTime() {
        return mUvIndexTime;
    }

    public void setUvIndexTime(long uvIndexTime) {
        mUvIndexTime = uvIndexTime;
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

    public double getTemperatureMin() {
        return mTemperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        mTemperatureMin = temperatureMin;
    }

    public long getTemperatureMinTime() {
        return mTemperatureMinTime;
    }

    public void setTemperatureMinTime(long temperatureMinTime) {
        mTemperatureMinTime = temperatureMinTime;
    }

    public int getTemperatureMax() {
        int temperatureCentigrade = (int) Math.round((mTemperatureMax - 32) * 5 / 9);
        return (int) Math.round(temperatureCentigrade);
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public long getTemperatureMaxTime() {
        return mTemperatureMaxTime;
    }

    public void setTemperatureMaxTime(long temperatureMaxTime) {
        mTemperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return mApparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        mApparentTemperatureMin = apparentTemperatureMin;
    }

    public long getApparentTemperatureMinTime() {
        return mApparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
        mApparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return mApparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        mApparentTemperatureMax = apparentTemperatureMax;
    }

    public long getApparentTemperatureMaxTime() {
        return mApparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
        mApparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public int getIconId() {

        return Forecast.getIconId(mIcon);
    }

    public String getDayOfTheWeek() {
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        format.setTimeZone(TimeZone.getTimeZone(mTimeZone));
        Date date = new Date(mTime * 1000);

        return format.format(date);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Day)) return false;

        Day day = (Day) o;

        if (getTime() != day.getTime()) return false;
        if (getSunriseTime() != day.getSunriseTime()) return false;
        if (getSunsetTime() != day.getSunsetTime()) return false;
        if (Double.compare(day.getMoonPhase(), getMoonPhase()) != 0) return false;
        if (Double.compare(day.getPrecipIntensity(), getPrecipIntensity()) != 0) return false;
        if (Double.compare(day.getPrecipIntensityMax(), getPrecipIntensityMax()) != 0) return false;
        if (getPrecipIntensityMaxTime() != day.getPrecipIntensityMaxTime()) return false;
        if (Double.compare(day.getPrecipProbability(), getPrecipProbability()) != 0) return false;
        if (Double.compare(day.getTemperatureHigh(), getTemperatureHigh()) != 0) return false;
        if (getTemperatureHighTime() != day.getTemperatureHighTime()) return false;
        if (Double.compare(day.getTemperatureLow(), getTemperatureLow()) != 0) return false;
        if (getTemperatureLowTime() != day.getTemperatureLowTime()) return false;
        if (Double.compare(day.getApparentTemperatureHigh(), getApparentTemperatureHigh()) != 0)
            return false;
        if (getApparentTemperatureHighTime() != day.getApparentTemperatureHighTime()) return false;
        if (Double.compare(day.getApparentTemperatureLow(), getApparentTemperatureLow()) != 0)
            return false;
        if (getApparentTemperatureLowTime() != day.getApparentTemperatureLowTime()) return false;
        if (Double.compare(day.getDewPoint(), getDewPoint()) != 0) return false;
        if (Double.compare(day.getHumidity(), getHumidity()) != 0) return false;
        if (Double.compare(day.getPressure(), getPressure()) != 0) return false;
        if (Double.compare(day.getWindSpeed(), getWindSpeed()) != 0) return false;
        if (Double.compare(day.getWindGust(), getWindGust()) != 0) return false;
        if (getWindGustTime() != day.getWindGustTime()) return false;
        if (getWindBearing() != day.getWindBearing()) return false;
        if (Double.compare(day.getCloudCover(), getCloudCover()) != 0) return false;
        if (getUvIndex() != day.getUvIndex()) return false;
        if (getUvIndexTime() != day.getUvIndexTime()) return false;
        if (Double.compare(day.getVisibility(), getVisibility()) != 0) return false;
        if (Double.compare(day.getOzone(), getOzone()) != 0) return false;
        if (Double.compare(day.getTemperatureMin(), getTemperatureMin()) != 0) return false;
        if (getTemperatureMinTime() != day.getTemperatureMinTime()) return false;
        if (Double.compare(day.getTemperatureMax(), getTemperatureMax()) != 0) return false;
        if (getTemperatureMaxTime() != day.getTemperatureMaxTime()) return false;
        if (Double.compare(day.getApparentTemperatureMin(), getApparentTemperatureMin()) != 0)
            return false;
        if (getApparentTemperatureMinTime() != day.getApparentTemperatureMinTime()) return false;
        if (Double.compare(day.getApparentTemperatureMax(), getApparentTemperatureMax()) != 0)
            return false;
        if (getApparentTemperatureMaxTime() != day.getApparentTemperatureMaxTime()) return false;
        if (getSummary() != null ? !getSummary().equals(day.getSummary()) : day.getSummary() != null)
            return false;
        if (getIcon() != null ? !getIcon().equals(day.getIcon()) : day.getIcon() != null)
            return false;
        if (getPrecipType() != null ? !getPrecipType().equals(day.getPrecipType()) : day.getPrecipType() != null)
            return false;
        return getTimeZone() != null ? getTimeZone().equals(day.getTimeZone()) : day.getTimeZone() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getTime() ^ (getTime() >>> 32));
        result = 31 * result + (getSummary() != null ? getSummary().hashCode() : 0);
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
        result = 31 * result + (int) (getSunriseTime() ^ (getSunriseTime() >>> 32));
        result = 31 * result + (int) (getSunsetTime() ^ (getSunsetTime() >>> 32));
        temp = Double.doubleToLongBits(getMoonPhase());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrecipIntensity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrecipIntensityMax());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getPrecipIntensityMaxTime() ^ (getPrecipIntensityMaxTime() >>> 32));
        temp = Double.doubleToLongBits(getPrecipProbability());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getPrecipType() != null ? getPrecipType().hashCode() : 0);
        temp = Double.doubleToLongBits(getTemperatureHigh());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getTemperatureHighTime() ^ (getTemperatureHighTime() >>> 32));
        temp = Double.doubleToLongBits(getTemperatureLow());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getTemperatureLowTime() ^ (getTemperatureLowTime() >>> 32));
        temp = Double.doubleToLongBits(getApparentTemperatureHigh());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getApparentTemperatureHighTime() ^ (getApparentTemperatureHighTime() >>> 32));
        temp = Double.doubleToLongBits(getApparentTemperatureLow());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getApparentTemperatureLowTime() ^ (getApparentTemperatureLowTime() >>> 32));
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
        result = 31 * result + (int) (getWindGustTime() ^ (getWindGustTime() >>> 32));
        result = 31 * result + (int) (getWindBearing() ^ (getWindBearing() >>> 32));
        temp = Double.doubleToLongBits(getCloudCover());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getUvIndex();
        result = 31 * result + (int) (getUvIndexTime() ^ (getUvIndexTime() >>> 32));
        temp = Double.doubleToLongBits(getVisibility());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getOzone());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getTemperatureMin());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getTemperatureMinTime() ^ (getTemperatureMinTime() >>> 32));
        temp = Double.doubleToLongBits(getTemperatureMax());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getTemperatureMaxTime() ^ (getTemperatureMaxTime() >>> 32));
        temp = Double.doubleToLongBits(getApparentTemperatureMin());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getApparentTemperatureMinTime() ^ (getApparentTemperatureMinTime() >>> 32));
        temp = Double.doubleToLongBits(getApparentTemperatureMax());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getApparentTemperatureMaxTime() ^ (getApparentTemperatureMaxTime() >>> 32));
        result = 31 * result + (getTimeZone() != null ? getTimeZone().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Day{" +
                "mTime=" + mTime +
                ", mSummary='" + mSummary + '\'' +
                ", mIcon='" + mIcon + '\'' +
                ", mPrecipProbability=" + mPrecipProbability +
                ", mPrecipType='" + mPrecipType + '\'' +
                ", mHumidity=" + mHumidity +
                ", mPressure=" + mPressure +
                ", mTemperatureMin=" + mTemperatureMin +
                ", mTemperatureMax=" + mTemperatureMax +
                '}';
    }

    /**
     * Describe the kinds of special objects contained in this Parcelable
     * instance's marshaled representation. For example, if the object will
     * include a file descriptor in the output of {@link #writeToParcel(Parcel, int)},
     * the return value of this method must include the
     * {@link #CONTENTS_FILE_DESCRIPTOR} bit.
     *
     * @return a bitmask indicating the set of special object types marshaled
     * by this Parcelable object instance.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param dest  The Parcel in which the object should be written.
     * @param flags Additional flags about how the object should be written.
     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mSummary);
        dest.writeString(mIcon);
        dest.writeLong(mSunriseTime);
        dest.writeLong(mSunsetTime);
        dest.writeDouble(mMoonPhase);
        dest.writeDouble(mPrecipIntensity);
        dest.writeDouble(mPrecipIntensityMax);
        dest.writeLong(mPrecipIntensityMaxTime);
        dest.writeDouble(mPrecipProbability);
        dest.writeString(mPrecipType);
        dest.writeDouble(mTemperatureHigh);
        dest.writeLong(mTemperatureHighTime);
        dest.writeDouble(mTemperatureLow);
        dest.writeLong(mTemperatureLowTime);
        dest.writeDouble(mApparentTemperatureHigh);
        dest.writeLong(mApparentTemperatureHighTime);
        dest.writeDouble(mApparentTemperatureLow);
        dest.writeLong(mApparentTemperatureLowTime);
        dest.writeDouble(mDewPoint);
        dest.writeDouble(mHumidity);
        dest.writeDouble(mPressure);
        dest.writeDouble(mWindSpeed);
        dest.writeDouble(mWindGust);
        dest.writeLong(mWindGustTime);
        dest.writeLong(mWindBearing);
        dest.writeDouble(mCloudCover);
        dest.writeInt(mUvIndex);
        dest.writeLong(mUvIndexTime);
        dest.writeDouble(mVisibility);
        dest.writeDouble(mOzone);
        dest.writeDouble(mTemperatureMin);
        dest.writeLong(mTemperatureMinTime);
        dest.writeDouble(mTemperatureMax);
        dest.writeLong(mTemperatureMaxTime);
        dest.writeDouble(mApparentTemperatureMin);
        dest.writeLong(mApparentTemperatureMinTime);
        dest.writeDouble(mApparentTemperatureMax);
        dest.writeLong(mApparentTemperatureMaxTime);
        dest.writeString(mTimeZone);
    }
}
