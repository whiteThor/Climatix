package org.vilchezruben.climatix.weather;

/**
 * Created by Vilchez Ruben on 14/03/2018.
 */


public class Hour {

    private long time;
    private String summary;
    private String icon;
    private double precipIntensity;
    private double precipProbability;
    private String precipType;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private double windBearing;
    private double cloudCover;
    private long uvIndex;
    private double visibility;
    private double ozone;
    private String mTimeZone;

    public Hour() {

    }

    public Hour(String timeZone) {
        mTimeZone = timeZone;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(long uvIndex) {
        this.uvIndex = uvIndex;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hour)) return false;

        Hour hour = (Hour) o;

        if (getTime() != hour.getTime()) return false;
        if (Double.compare(hour.getPrecipIntensity(), getPrecipIntensity()) != 0) return false;
        if (Double.compare(hour.getPrecipProbability(), getPrecipProbability()) != 0) return false;
        if (Double.compare(hour.getTemperature(), getTemperature()) != 0) return false;
        if (Double.compare(hour.getApparentTemperature(), getApparentTemperature()) != 0)
            return false;
        if (Double.compare(hour.getDewPoint(), getDewPoint()) != 0) return false;
        if (Double.compare(hour.getHumidity(), getHumidity()) != 0) return false;
        if (Double.compare(hour.getPressure(), getPressure()) != 0) return false;
        if (Double.compare(hour.getWindSpeed(), getWindSpeed()) != 0) return false;
        if (Double.compare(hour.getWindGust(), getWindGust()) != 0) return false;
        if (Double.compare(hour.getWindBearing(), getWindBearing()) != 0) return false;
        if (Double.compare(hour.getCloudCover(), getCloudCover()) != 0) return false;
        if (getUvIndex() != hour.getUvIndex()) return false;
        if (Double.compare(hour.getVisibility(), getVisibility()) != 0) return false;
        if (Double.compare(hour.getOzone(), getOzone()) != 0) return false;
        if (getSummary() != null ? !getSummary().equals(hour.getSummary()) : hour.getSummary() != null)
            return false;
        if (getIcon() != null ? !getIcon().equals(hour.getIcon()) : hour.getIcon() != null)
            return false;
        return getPrecipType() != null ? getPrecipType().equals(hour.getPrecipType()) : hour.getPrecipType() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getTime() ^ (getTime() >>> 32));
        result = 31 * result + (getSummary() != null ? getSummary().hashCode() : 0);
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
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
        return result;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "time=" + time +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", precipProbability=" + precipProbability +
                ", precipType='" + precipType + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}