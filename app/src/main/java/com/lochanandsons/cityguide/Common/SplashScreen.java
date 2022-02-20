package com.lochanandsons.cityguide.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.lochanandsons.cityguide.Common.LoginSignup.UserOwnerSelection;
import com.lochanandsons.cityguide.R;
import com.lochanandsons.cityguide.User.UserDashboard;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 5000;



    //variables
    ImageView backgroundImage;
    TextView poweredbyLine;

    //Animations

    Animation sideAnim, bottomAnim;

    SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //hooks
        backgroundImage =findViewById(R.id.background_image);
        poweredbyLine = findViewById(R.id.powered_by_line);

        //animations
        sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);


        //set Animation on elements

        backgroundImage.setAnimation(sideAnim);
        poweredbyLine.setAnimation(bottomAnim);


       new Handler().postDelayed(() -> {

           onBoardingScreen = getSharedPreferences( "onBoardingScreen",MODE_PRIVATE);
           boolean isFirstTime = onBoardingScreen.getBoolean("firstTime",true);

           if(isFirstTime){

               SharedPreferences.Editor editor = onBoardingScreen.edit();
               editor.putBoolean("firstTime",false);
               editor.commit();

               Intent intent = new Intent(getApplicationContext(), OnBoarding.class);
               startActivity(intent);
               finish();

           }
           else{
               Intent intent = new Intent(getApplicationContext(), UserOwnerSelection.class);
               startActivity(intent);
               finish();
           }



       },SPLASH_TIMER);
    }
}