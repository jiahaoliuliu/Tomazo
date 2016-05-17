package com.jiahaoliuliu.tomazo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantsListActivity extends AppCompatActivity {

    // List of restaurants
    private String[] mRestaurants = {"The big circle", "Al Soor", "Avec...", "Vapiano", "Khan Chacha", "Abu Shagara",
                                     "Nayaab Haandi", "Rajasthan Al Malaki", "Grub Shack", "Orient grill", "Makani Restuarant"};

    // List of images
    private int[] mRestaurantsImage = {R.drawable.the_big_circle, R.drawable.al_soor, R.drawable.avec, R.drawable.vapiano, R.drawable.khan_chacha, R.drawable.abu_shagara,
                                       R.drawable.nayaab_haandi, R.drawable.rajasthan_al_malaki, R.drawable.grub_shack, R.drawable.orient_grill, R.drawable.makani_restaurant};

    private ListView mRestaurantsList;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_list);

        mContext = this;

        mRestaurantsList = (ListView) findViewById(R.id.restaurants_list);

        // Defines a new adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mRestaurants);

        mRestaurantsList.setAdapter(adapter);
        mRestaurantsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent startRestaurantDetailsIntent = new Intent(mContext, MyRestaurantActivity.class);
                startRestaurantDetailsIntent.putExtra("restaurantName",mRestaurants[position]);
                startRestaurantDetailsIntent.putExtra("restaurantImage", mRestaurantsImage[position]);
                startActivity(startRestaurantDetailsIntent);
            }
        });
    }
}