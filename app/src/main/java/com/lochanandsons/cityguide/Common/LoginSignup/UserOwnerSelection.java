package com.lochanandsons.cityguide.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lochanandsons.cityguide.R;
import com.lochanandsons.cityguide.User.AllCategories;
import com.lochanandsons.cityguide.User.UserDashboard;

public class UserOwnerSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_owner_selection);
    }

    public void callLocationOwnerStartupScreen(View view){
        startActivity(new Intent(getApplicationContext(), RetailerStartUpScreen.class));

    }
    public void callCustomerstartupScreen(View view){
        startActivity(new Intent(getApplicationContext(), LoginUser.class));

    }
    public void callworkinformation(View view){
        startActivity(new Intent(getApplicationContext(), AllCategories.class));

    }
}