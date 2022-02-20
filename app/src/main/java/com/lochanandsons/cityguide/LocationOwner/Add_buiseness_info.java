package com.lochanandsons.cityguide.LocationOwner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lochanandsons.cityguide.R;

import java.util.ArrayList;

public class Add_buiseness_info extends AppCompatActivity {
    Spinner spinner;
    String textdata = "";
    EditText edData;
    DatabaseReference databaseReference;
    ValueEventListener listener;
    ArrayAdapter<String> adapter;
    ArrayList<String> spinnerDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_add_buiseness_info);
        spinner = findViewById(R.id.buiseness_names_spinner);
        edData = findViewById(R.id.txtData);
        databaseReference= FirebaseDatabase.getInstance().getReference("SpinnerData");

        spinnerDataList = new ArrayList<>();
        adapter = new ArrayAdapter<String>(Add_buiseness_info.this, android.R.layout.simple_spinner_dropdown_item,spinnerDataList);

        spinner.setAdapter(adapter);
        retriveData();

    }
    public void callbtnAddData(View view){
        textdata = edData.getText().toString().trim();
        
        databaseReference.push().setValue(textdata).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                edData.setText("");
                Toast.makeText(Add_buiseness_info.this, "Data Inserted", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void retriveData(){
        listener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot item:dataSnapshot.getChildren()){

                    spinnerDataList.add(item.getValue().toString());
                }
            adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}