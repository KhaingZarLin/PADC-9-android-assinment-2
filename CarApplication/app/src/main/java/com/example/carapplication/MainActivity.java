package com.example.carapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.carapplication.adapter.CarListAdapter;
import com.example.carapplication.delegates.CarDelegate;

public class MainActivity extends AppCompatActivity implements CarDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        CarListAdapter adapter=new CarListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onTapEventItem() {
        startActivity(new Intent(this,CarDetailActivity.class));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
