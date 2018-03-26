package org.vilchezruben.climatix.ui;

import android.app.ListActivity;
import android.os.Bundle;

import org.vilchezruben.climatix.R;

public class HourlyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
    }
}
