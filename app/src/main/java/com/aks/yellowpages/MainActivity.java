package com.aks.yellowpages;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout restaurantLayout, hotelLayout, doctorLayout, salonLayout,
            autoMechanicLayout, movieTheaterLayout, schoolLayout, travelLayout, plumberLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void init() {
        restaurantLayout = findViewById(R.id.restaurant_layout);
        hotelLayout = findViewById(R.id.hotel_layout);
        doctorLayout = findViewById(R.id.doctor_layout);
        salonLayout = findViewById(R.id.salon_layout);
        autoMechanicLayout = findViewById(R.id.auto_mechanic_layout);
        movieTheaterLayout = findViewById(R.id.theater_layout);
        schoolLayout = findViewById(R.id.school_layout);
        travelLayout = findViewById(R.id.travel_layout);
        plumberLayout = findViewById(R.id.plumber_layout);
        restaurantLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, ShopListsActivity.class));
            }
                        });
        hotelLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hotel", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, ShopListsActivity.class));
            }
        });
        doctorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, ShopListsActivity.class));
            }
        });
        salonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShopListsActivity.class));
                Toast.makeText(context, "Salon", Toast.LENGTH_SHORT).show();
            }
        });
        autoMechanicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShopListsActivity.class));
                Toast.makeText(context, "Auto Mechanic", Toast.LENGTH_SHORT).show();
            }
        });
        movieTheaterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShopListsActivity.class));
                Toast.makeText(context, "Movie Theater", Toast.LENGTH_SHORT).show();
            }
        });
        schoolLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShopListsActivity.class));
                Toast.makeText(context, "School", Toast.LENGTH_SHORT).show();
            }
        });
        travelLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Travel", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, ShopListsActivity.class));
            }
        });
        plumberLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ShopListsActivity.class));
                Toast.makeText(context, "Plumber", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
