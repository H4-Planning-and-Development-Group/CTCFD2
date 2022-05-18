package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

public class cyuumondesu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyuumondesu);

        ((ImageButton) findViewById(R.id.imageButton1)).setOnClickListener((View.OnClickListener) this);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.imageButton1):
                Intent intentStart = new Intent(getApplication(),teisyoku.class);
                startActivity(intentStart);
                break;


        }
    }
}