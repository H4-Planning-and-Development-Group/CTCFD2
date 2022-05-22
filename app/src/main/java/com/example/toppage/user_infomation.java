package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class user_infomation extends AppCompatActivity  {

    //text_variable
    TextInputLayout regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button regBtn, regToLoginBtn;
    ImageButton home;

    FirebaseDatabase rootnode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_infomation);

        regName = findViewById(R.id.reg_name);
        regUsername = findViewById(R.id.reg_username);
        regEmail = findViewById(R.id.reg_email);
        regPhoneNo = findViewById(R.id.reg_phonenumber);
        regPassword = findViewById(R.id.reg_password);
        regBtn = findViewById(R.id.go);
        regToLoginBtn = findViewById(R.id.hint);
        home = findViewById(R.id.HOME);

        //save data in firebase on button click
        regBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final String usernameText =regUsername.getEditText().getText().toString();
                final String passwordTxt =regPassword.getEditText().getText().toString();

                if(usernameText.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(user_infomation.this,"ユーザーネームとパスワードを登録してください", Toast.LENGTH_SHORT).show();
                }else {
                    switch (view.getId()) {
                        case (R.id.go):
                            Intent intentgo = new Intent(getApplication(), SignUp.class);
                            startActivity(intentgo);
                            break;
                    }


                    rootnode = FirebaseDatabase.getInstance();
                    reference = rootnode.getReference("users");

                    //get all the values
                    String name = regName.getEditText().getText().toString();
                    String username = regUsername.getEditText().getText().toString();
                    String email = regEmail.getEditText().getText().toString();
                    String phoneNo = regPhoneNo.getEditText().getText().toString();
                    String password = regPassword.getEditText().getText().toString();

                    UserHelperClass helperClass = new UserHelperClass(
                            name, username, email, phoneNo, password);
                    reference.child(username).setValue(helperClass);
                }

            }
        });

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.HOME):
                        Intent intenthome = new Intent(getApplication(), MainActivity.class);
                        startActivity(intenthome);
                        break;
                }
                }
            });
        regToLoginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.hint):
                        Intent intenthome = new Intent(getApplication(), SignUp.class);
                        startActivity(intenthome);
                        break;
                }
            }
        });

    }
}