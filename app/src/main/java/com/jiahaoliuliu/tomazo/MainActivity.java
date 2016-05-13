package com.jiahaoliuliu.tomazo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jiahaoliuliu.tomazo.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // List of restaurants
    private String[] mRestaurants = {"The big circle", "Al Soor", "Avec...", "Vapiano", "Khan Chacha", "Abu Shagara", "Nayaab Haandi", "Rajasthan Al Malaki",
                                    "Grub Shack", "Orient grill", "Makani Restuarant"};

    private ListView mRestaurantsList;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        mRestaurantsList = (ListView) findViewById(R.id.restaurants_list);

        // Defines a new adapter
        RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(mContext, R.layout.restaurant_row, generateRestaurantsList());
        mRestaurantsList.setAdapter(restaurantsAdapter);

        mRestaurantsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent startRestaurantDetailsIntent = new Intent(mContext, RestaurantDetailsActivity.class);
                startActivity(startRestaurantDetailsIntent);
            }
        });
    }

    private List<Restaurant> generateRestaurantsList() {
        List<Restaurant> restaurantsList = new ArrayList<>();
        for (String restaurantName : mRestaurants) {
            Restaurant restaurant = new Restaurant(restaurantName, 0);
            restaurantsList.add(restaurant);
        }

        return restaurantsList;
    }
}