package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Button)findViewById(R.id.mobileorder)).setOnClickListener(this);
        ((Button)findViewById(R.id.kupon)).setOnClickListener(this);
        ((Button)findViewById(R.id.comunity)).setOnClickListener(this);
        ((Button)findViewById(R.id.mypage)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.HOME)).setOnClickListener(this);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.comunity):
                Intent intentcommunity = new Intent(getApplication(), community.class);
                startActivity(intentcommunity);
                break;
            case (R.id.HOME):
                Intent intentHOME = new Intent(getApplication(),MainActivity.class);
                startActivity(intentHOME);
                break;
            case(R.id.kupon):
                Intent intentkupon= new Intent(getApplication(),kupon.class);
                startActivity(intentkupon);
                break;
            case (R.id.mypage):
                Intent intentmypage = new Intent(getApplication(),mypage.class);
                startActivity(intentmypage);
                break;
            case (R.id.mobileorder):
                Intent intentmobileorder = new Intent(getApplication(),syokudo.class);
                startActivity(intentmobileorder);
                break;
        }
    }

}

