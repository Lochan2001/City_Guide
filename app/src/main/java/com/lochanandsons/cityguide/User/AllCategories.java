package com.lochanandsons.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lochanandsons.cityguide.Common.CategoriesSeperate.CarRent;
import com.lochanandsons.cityguide.Common.LoginSignup.RetailerStartUpScreen;
import com.lochanandsons.cityguide.R;

public class AllCategories extends AppCompatActivity {
    ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);

        //Hooks
        backBtn = findViewById(R.id.back_pressed);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllCategories.super.onBackPressed();
            }
        });

    }
        public void callExpandallCarrentCategories(View view){
            startActivity(new Intent(getApplicationContext(), CarRent.class));

    }
}