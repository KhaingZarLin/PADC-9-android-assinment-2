package com.example.carapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.carapplication.adapter.CarDetailImageAdapter;

public class CarDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        ViewPager vp=findViewById(R.id.vpdetailimages);

        CarDetailImageAdapter adapter=new CarDetailImageAdapter();
        vp.setAdapter(adapter);
    }
}
