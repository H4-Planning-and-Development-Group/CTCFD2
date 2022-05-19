package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

public class MapTest extends AppCompatActivity implements View.OnClickListener, OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng location;
    private LatLng location2;
    private LatLng location3;

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

        // 皇居辺りの緯度経度
        location = new LatLng(35.68, 139.76);
        location2 = new LatLng(35.63, 139.80);
        // marker 追加
        mMap.addMarker(new MarkerOptions().position(location).title("CTCFD_1号店"));
        mMap.addMarker(new MarkerOptions().position(location2).title("CTCFD_2号店"));
        // camera 移動
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location2, 11));

        // タップした時のリスナーをセット
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng tapLocation) {
                // tapされた位置の緯度経度
                location = new LatLng(tapLocation.latitude, tapLocation.longitude);
                String str = String.format(Locale.US, "%f, %f", tapLocation.latitude, tapLocation.longitude);
                mMap.addMarker(new MarkerOptions().position(location).title(str));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 14));
            }
        });

        // 長押しのリスナーをセット
        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng longpushLocation) {
                LatLng newlocation = new LatLng(longpushLocation.latitude, longpushLocation.longitude);
                mMap.addMarker(new MarkerOptions().position(newlocation).title(""+longpushLocation.latitude+" :"+ longpushLocation.longitude));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(newlocation, 14));
            }
        });
    }
}