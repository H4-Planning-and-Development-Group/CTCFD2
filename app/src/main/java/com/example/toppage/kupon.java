package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kupon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kupon);

        ((Button)findViewById(R.id.back)).setOnClickListener(this)

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case(R.id.back):
                Intent intentStart= new Intent(getApplication(),MainActivity.class);
                startActivity(intentStart);
                break;

        }
    }
}
    }
}