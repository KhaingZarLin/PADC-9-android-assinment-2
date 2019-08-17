package com.example.carapplication.view.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.carapplication.delegates.CarDelegate;

public class CarItemViewHolder extends RecyclerView.ViewHolder {
    private CarDelegate carDelegate;

    public CarItemViewHolder(@NonNull View itemView, final CarDelegate eventDelegate) {
        super(itemView);
        carDelegate=eventDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventDelegate.onTapEventItem();
            }
        });
    }
}
