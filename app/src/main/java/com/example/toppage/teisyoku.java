package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class teisyoku extends AppCompatActivity implements View.OnClickListener {

    Spinner number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teisyoku);

        ((Button) findViewById(R.id.button5)).setOnClickListener(this);

        number = findViewById(R.id.spinner);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button5):
                Intent intentStart = new Intent(getApplication(),kakuninn.class);
                intentStart.putExtra("result", number.getSelectedItem().toString());
                startActivity(intentStart);
                break;


        }
    }
}