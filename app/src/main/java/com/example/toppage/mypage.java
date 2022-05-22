package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mypage extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        ((ImageButton)findViewById(R.id.back2)).setOnClickListener(this);
        ((Button)findViewById(R.id.logout)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case(R.id.back2):
                Intent intentback2= new Intent(getApplication(),MainActivity.class);
                startActivity(intentback2);
                break;
            case(R.id.logout):
                Intent intentlogout= new Intent(getApplication(),SignUp.class);
                startActivity(intentlogout);
                break;
        }
    }
}