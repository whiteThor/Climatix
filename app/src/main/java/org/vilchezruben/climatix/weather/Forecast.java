package org.vilchezruben.climatix.weather;

import org.vilchezruben.climatix.R;

/**
 * Created by Vilchez Ruben on 14/03/2018.
 */

public class Forecast {

    private Current mCurrent;
    private Day[] mDays;
    private Hour[] mHours;

    public static int getIconId(String iconString) {

        int iconId = 0;

        if (iconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        } else if (iconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        } else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        } else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        } else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        } else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        } else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        } else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        } else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        } else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }
        return iconId;
    }

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Day[] getDays() {
        return mDays;
    }

    public void setDays(Day[] days) {
        mDays = days;
    }

    public Hour[] getHours() {
        return mHours;
    }

    public void setHours(Hour[] hours) {
        mHours = hours;
    }
}
