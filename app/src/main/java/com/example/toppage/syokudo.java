package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syokudo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syokudo);

        ((Button)findViewById(R.id.button21)).setOnClickListener(this);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button21):
                Intent intentStart = new Intent(getApplication(),cyuumondesu.class);
                startActivity(intentStart);
                break;


        }
    }
}
