package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kakuninn2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakuninn2);

        ((Button) findViewById(R.id.confirm)).setOnClickListener((View.OnClickListener) this);

        Intent intentstart = getIntent();
        //インテントに保存されたデータを取得
        String data = intentstart.getStringExtra("result2");
        TextView num = findViewById(R.id.textView);
        num.setText("合計 "+data+"円");

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.confirm):
                Intent intentStart = new Intent(getApplication(),banngou.class);
                startActivity(intentStart);
                break;


        }
    }
}