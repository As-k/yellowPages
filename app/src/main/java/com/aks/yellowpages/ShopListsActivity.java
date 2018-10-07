package com.aks.yellowpages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

public class ShopListsActivity extends AppCompatActivity {

    private RecyclerView shopListRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_lists);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        shopListRecycler = findViewById(R.id.shop_list_recycler_view);
        shopListRecycler.setLayoutManager(new LinearLayoutManager(this));
        ShopListRecyclerAdapter adapter = new ShopListRecyclerAdapter(this);
        shopListRecycler.setAdapter(adapter);
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

}
