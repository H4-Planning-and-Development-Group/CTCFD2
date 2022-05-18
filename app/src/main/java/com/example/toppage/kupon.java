package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class kupon extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kupon);

        ((ImageButton)findViewById(R.id.back)).setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case(R.id.back):
                Intent intentback= new Intent(getApplication(),MainActivity.class);
                startActivity(intentback);
                break;

        }
    }
}
