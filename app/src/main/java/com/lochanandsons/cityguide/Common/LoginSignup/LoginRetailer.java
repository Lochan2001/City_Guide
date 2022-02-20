package com.lochanandsons.cityguide.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.lochanandsons.cityguide.LocationOwner.OwnerDashboard;
import com.lochanandsons.cityguide.R;

public class LoginRetailer extends AppCompatActivity {
    Button forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_login);

        forget =findViewById(R.id.forget_password_login_text);
    }



   public void callForgetPasswordScreen(View view) {
       startActivity(new Intent(getApplicationContext(), ForgetPassword.class));

   }
    public void callSignupScreenFromLogin(View view) {
        startActivity(new Intent(getApplicationContext(), SignUpRetailer.class));

    }

    public void callOwnerDashboard(View view){
        startActivity(new Intent(getApplicationContext(), OwnerDashboard.class));
    }
}