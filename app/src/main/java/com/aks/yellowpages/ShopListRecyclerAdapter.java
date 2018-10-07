package com.aks.yellowpages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShopListRecyclerAdapter extends RecyclerView.Adapter<ShopListRecyclerAdapter.ShopViewHolder> {

    Context mContext;

    public ShopListRecyclerAdapter(Context context){
        this.mContext = context;
    }


    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.shop_list_layout, viewGroup, false);
        return new ShopViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder shopViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
