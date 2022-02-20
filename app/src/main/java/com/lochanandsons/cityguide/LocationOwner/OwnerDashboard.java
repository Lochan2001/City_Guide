package com.lochanandsons.cityguide.LocationOwner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lochanandsons.cityguide.R;
import com.lochanandsons.cityguide.User.AllCategories;

public class OwnerDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_dashboard);



    }
    public void callCategories(View view){
        startActivity(new Intent(getApplicationContext(), Add_buiseness_info.class));

    }
}