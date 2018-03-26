package org.vilchezruben.climatix.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.vilchezruben.climatix.R;
import org.vilchezruben.climatix.weather.Hour;

/**
 * Created by Vilchez Ruben on 21/03/2018.
 */

public class HourAdapter extends BaseAdapter {
    private Context mContext;
    private Hour[] mHours;

    public HourAdapter() {
    }

    public HourAdapter(Context context, Hour[] hours) {
        mContext = context;
        mHours = hours;
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return mHours.length;
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return mHours[position];
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HourAdapter.ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.hourly_list_item, null);
            holder = new HourAdapter.ViewHolder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) convertView.findViewById(R.id.temperatureLabel);
            holder.timeLabel = (TextView) convertView.findViewById(R.id.timeLabel);
            holder.summaryLabel = (TextView) convertView.findViewById(R.id.summaryLabel);
            convertView.setTag(holder);
        } else {
            holder = (HourAdapter.ViewHolder) convertView.getTag();
        }

        Hour hour = mHours[position];
        if (position == 0) {
            holder.timeLabel.setText("Now");
        } else {
            holder.timeLabel.setText(hour.getHour());
        }
        holder.iconImageView.setImageResource(hour.getIconId());
        holder.temperatureLabel.setText(hour.getTemperature() + "");
        holder.summaryLabel.setText(hour.getSummary());
        return convertView;
    }

    private static class ViewHolder {
        ImageView iconImageView;
        TextView timeLabel;
        TextView summaryLabel;
        TextView temperatureLabel;


    }
}
