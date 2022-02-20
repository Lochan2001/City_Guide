package com.lochanandsons.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.lochanandsons.cityguide.R;

public class UserProfile extends AppCompatActivity {

    TextInputLayout fullName,email,phoneNo,password;
    TextView fullNameLabel,usernameLabel;

    String _USERNAME, _NAME, _EMAIL, _PHONENO, _PASSWORD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        //HOOKS
        fullName = findViewById(R.id.full_name_profile);
//        email = findViewById(R.id.email_profile);
//        phoneNo = findViewById(R.id.phone_no_profile);
//        password = findViewById(R.id.password_profile);
//        fullNameLabel = findViewById(R.id.fullname_field);
//        usernameLabel = findViewById(R.id.username_field);

        showAlluserData();
    }

    private void showAlluserData() {

        Intent intent = getIntent();
        _USERNAME = intent.getStringExtra("username");
        _NAME = intent.getStringExtra("name");
        _EMAIL = intent.getStringExtra("email");
        _PHONENO = intent.getStringExtra("phoneNo");
        _PASSWORD = intent.getStringExtra("password");

        fullNameLabel.setText(_NAME);
        usernameLabel.setText(_USERNAME);
        fullName.getEditText().setText(_NAME);
        email.getEditText().setText(_EMAIL);
        phoneNo.getEditText().setText(_PHONENO);
        password.getEditText().setText(_PASSWORD);


    }


    public void callUpdate(View view){

    }
}