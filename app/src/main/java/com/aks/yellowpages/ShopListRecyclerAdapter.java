package com.aks.yellowpages;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int i) {
        holder.shopCardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, ShopProfileActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        LinearLayout shopCardLayout;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            shopCardLayout = itemView.findViewById(R.id.shop_layout);
        }
    }
}
