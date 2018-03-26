package org.vilchezruben.climatix.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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

    /**
     * This method will be called when an item in the list is selected.
     * Subclasses should override. Subclasses can call
     * getListView().getItemAtPosition(position) if they need to access the
     * data associated with the selected item.
     *
     * @param l        The ListView where the click happened
     * @param v        The view that was clicked within the ListView
     * @param position The position of the view in the list
     * @param id       The row id of the item that was clicked
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String hourOfTheDay = mHours[position].getHour();
        String condition = mHours[position].getSummary();
        String highTemperature = mHours[position].getTemperature() + "";

        String message = String.format("On %s the high will be %s and it will be %s", hourOfTheDay, highTemperature, condition);

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
