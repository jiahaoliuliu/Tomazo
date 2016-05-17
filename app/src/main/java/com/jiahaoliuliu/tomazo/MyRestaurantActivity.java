package com.jiahaoliuliu.tomazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MyRestaurantActivity extends AppCompatActivity {

    // Views
    private TextView mTitle;
    private ImageView mImage;
    private TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_restaurant);

        // Displaying the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Link the view
        mTitle = (TextView) findViewById(R.id.title);
        mImage = (ImageView) findViewById(R.id.image);

        // Change the values
        Intent intent = getIntent();

        String restaurantName = intent.getStringExtra("restaurantName");
        mTitle.setText(restaurantName);

        int imageId = intent.getIntExtra("restaurantImage", 0);
        mImage.setImageDrawable(getResources().getDrawable(imageId));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Capture the back action
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}