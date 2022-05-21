package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
        ((Button)findViewById(R.id.shopping2)).setOnClickListener(this);
        ((Button)findViewById(R.id.taiken)).setOnClickListener(this);
/*        ((ImageButton)findViewById(R.id.new_user)).setOnClickListener(this);*/

        // Write a message to the database
/*        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");

        Log.d("myinfo", "onCreate: "+ myRef);*/
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
                Intent intentmobileorder = new Intent(getApplication(),MapTest.class);
                startActivity(intentmobileorder);
                break;
            case (R.id.shopping2):
                Intent intentshopping2 = new Intent(getApplication(),CyokuhanWeb.class);
                startActivity(intentshopping2);
                break;
            case (R.id.taiken):
                Intent intenttaiken = new Intent(getApplication(),TaikenWeb.class);
                startActivity(intenttaiken);
                break;
/*            case (R.id.new_user):
                Intent intentuser = new Intent(getApplication(),user_infomation.class);
                startActivity(intentuser);
                break;*/


        }
    }

}

