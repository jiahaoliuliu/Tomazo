package com.jiahaoliuliu.tomazo;

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
        mDescription = (TextView) findViewById(R.id.description);

        // Change the values
        mTitle.setText("The fish hut");
        mImage.setImageDrawable(getResources().getDrawable(R.drawable.fish_hut));
        mDescription.setText("The fish hut is a really good restaurant");
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