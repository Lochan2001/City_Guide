package com.lochanandsons.cityguide.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lochanandsons.cityguide.R;

public class ForgetPassword extends AppCompatActivity {
    Animation animation;

    ImageView screenIcon;
    TextView title, description;
    Button nextBtn;
    EditText phoneNumberTextField;

    TextInputEditText countryCodePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        nextBtn = findViewById(R.id.forget_password_next_btn);
        title = findViewById(R.id.forget_password_title);
        description = findViewById(R.id.forget_password_description);
        screenIcon = findViewById(R.id.forget_password_icon);
       phoneNumberTextField = findViewById(R.id.forget_password_phone_number1);
    //    countryCodePicker = findViewById(R.id.country_code_picker);

        //Animation Hook
        animation = AnimationUtils.loadAnimation(this, R.anim.slide_animation);

        //Set animation to all the elements
        screenIcon.setAnimation(animation);
        title.setAnimation(animation);
        description.setAnimation(animation);
        phoneNumberTextField.setAnimation(animation);
     //   countryCodePicker.setAnimation(animation);
        nextBtn.setAnimation(animation);
    }

    public void verifyPhoneNumber(View view) {
        startActivity(new Intent(this, MakeSelection.class));

    }
}