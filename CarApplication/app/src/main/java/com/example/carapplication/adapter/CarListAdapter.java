package com.example.carapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carapplication.R;
import com.example.carapplication.delegates.CarDelegate;
import com.example.carapplication.view.holder.CarItemViewHolder;


public class CarListAdapter extends RecyclerView.Adapter {

    private CarDelegate carDelegate;

    public CarListAdapter(CarDelegate carDelegate1) {
        this.carDelegate = carDelegate1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_view,viewGroup,false);
        return new CarItemViewHolder(itemview,carDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
