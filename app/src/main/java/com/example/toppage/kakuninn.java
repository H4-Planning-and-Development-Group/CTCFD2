package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class kakuninn extends AppCompatActivity implements View.OnClickListener {

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakuninn);

        ((Button) findViewById(R.id.credit)).setOnClickListener((View.OnClickListener) this);

        Intent intentstart = getIntent();
        //インテントに保存されたデータを取得
        String data = intentstart.getStringExtra("result");


        int num1 = Integer.parseInt(data);
        int sum =num1*600;
        TextView text = findViewById(R.id.textView_sum);
        str = String.valueOf(sum);
        text.setText("合計 "+str+"円");
        TextView num = findViewById(R.id.num);
        num.setText(data+"個");
        num.setText(data+"個");


    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.credit):
                Intent intentStart = new Intent(getApplication(),kakuninn2.class);
                intentStart.putExtra("result2",str);
                startActivity(intentStart);
                break;


        }
    }
}