package com.jiahaoliuliu.tomazo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // List of restaurants
    private String[] mRestaurants = {"Al Soor", "Avec...", "Vapiano", "Khan Chacha", "Abu Shagara", "Nayaab Haandi", "Rajasthan Al Malaki",
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mRestaurants);

        mRestaurantsList.setAdapter(adapter);
        mRestaurantsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent startRestaurantDetailsIntent = new Intent(mContext, RestaurantDetailsActivity.class);
                startActivity(startRestaurantDetailsIntent);
            }
        });
    }
}