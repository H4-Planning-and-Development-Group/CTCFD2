package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MapTest extends AppCompatActivity implements View.OnClickListener, OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_test);

        ((Button)findViewById(R.id.button21)).setOnClickListener(this);

        // MapFragmentの生成
        MapFragment mapFragment = MapFragment.newInstance();

        // MapViewをMapFragmentに変更する
        FragmentTransaction fragmentTransaction =
                getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.mapView2, mapFragment);
        fragmentTransaction.commit();

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button21):
                Intent intentStart = new Intent(getApplication(),cyuumondesu.class);
                startActivity(intentStart);
                break;
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
    }
}