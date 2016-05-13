package com.jiahaoliuliu.tomazo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jiahaoliuliu.tomazo.model.Restaurant;

import java.util.List;

/**
 * Created by jiahaoliuliu on 5/13/16.
 */
public class RestaurantsAdapter extends ArrayAdapter<Restaurant> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<Restaurant> mRestaurantsList;

    public RestaurantsAdapter(Context context, int resource, List<Restaurant> restaurantsList) {
        super(context, resource);
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mRestaurantsList = restaurantsList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.restaurant_row, parent, false);
        }

        TextView restaurantNameTextView = (TextView) convertView.findViewById(R.id.restaurant_name_text_view);

        Restaurant restaurant = mRestaurantsList.get(position);
        restaurantNameTextView.setText(restaurant.getRestaurantName());
        return convertView;
    }

    @Override
    public int getCount() {
        return mRestaurantsList.size();
    }
}
