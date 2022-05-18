package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class banngou extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banngou);

        ((Button)findViewById(R.id.receive)).setOnClickListener(this);
    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.receive):
                Intent intentreceive = new Intent(getApplication(),MainActivity.class);
                startActivity(intentreceive);
                break;


        }
    }
}