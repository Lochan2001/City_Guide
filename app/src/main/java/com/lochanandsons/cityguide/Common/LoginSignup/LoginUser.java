package com.lochanandsons.cityguide.Common.LoginSignup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.lochanandsons.cityguide.R;
import com.lochanandsons.cityguide.User.AllCategories;
import com.lochanandsons.cityguide.User.UserDashboard;
import com.lochanandsons.cityguide.User.UserProfile;

public class LoginUser extends AppCompatActivity {
    Button callSignup, login_user;
    ImageView image;
    TextView logotext;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_login);
    }

    public void onLoginClick(View view){
        startActivity(new Intent(this, SignupUser.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

      public void LoginUser(View view){
        startActivity(new Intent(getApplicationContext(), UserDashboard.class));
    }

//    public void LoginUser(View view) {
//        //Validate Login Info
//        if (!validateUsername() | !validatePassword()) {
//            return;
//        } else {
//            isUser();
//        }
//    }

//    private void isUser() {
//        final String userEnteredUsername = username.getEditText().getText().toString().trim();
//        final String userEnteredPassword = password.getEditText().getText().toString().trim();
//
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
//
//        Query checkUser = reference.orderByChild("username").equalTo(userEnteredUsername);
//
//        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                if (dataSnapshot.exists()) {
//
//                    username.setError(null);
//                    username.setErrorEnabled(false);
//                    String passwordFromDB = dataSnapshot.child(userEnteredUsername).child("password").getValue(String.class);
//
//                    if (passwordFromDB.equals(userEnteredPassword)) {
//                        String nameFromDB = dataSnapshot.child(userEnteredUsername).child("name").getValue(String.class);
//                        String usernameFromDB = dataSnapshot.child(userEnteredUsername).child("username").getValue(String.class);
//                        String phoneNoFromDB = dataSnapshot.child(userEnteredUsername).child("phoneNo").getValue(String.class);
//                        String emailFromDB = dataSnapshot.child(userEnteredUsername).child("email").getValue(String.class);
//                        Intent intent = new Intent(getApplicationContext(), AllCategories.class);
//                        intent.putExtra("name", nameFromDB);
//                        intent.putExtra("username", usernameFromDB);
//                        intent.putExtra("email", emailFromDB);
//                        intent.putExtra("phoneNo", phoneNoFromDB);
//                        intent.putExtra("password", passwordFromDB);
//                        startActivity(intent);
//
//                    }else {
//
//                        password.setError("Wrong Password");
//                        password.requestFocus();
//                    }
//                } else {
//
//                    username.setError("No such User exist");
//                    password.requestFocus();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }

    private Boolean validateUsername() {
        String val = username.getEditText().getText().toString();
        if (val.isEmpty()) {
            username.setError("Field cannot be empty");
            return false;
        } else {
            username.setError(null);
            username.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = password.getEditText().getText().toString();
        if (val.isEmpty()) {
            password.setError("Field cannot be empty");
            return false;
        } else {
            password.setError(null);
            password.setErrorEnabled(false);
            return true;
        }
    }
}