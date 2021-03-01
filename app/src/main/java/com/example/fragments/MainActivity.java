package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnone,btntwo;
    LinearLayout line;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone = findViewById(R.id.btn1);
        btntwo = findViewById(R.id.btn2);

        btnone.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Working",
                    Toast.LENGTH_SHORT);
            toast.show();

            First fragment =  new First();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.line,fragment);
            fragmentTransaction.commit();
        }
    });


    btntwo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Second fragment = new Second();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.line,fragment);
            fragmentTransaction.commit();
        }
    });

    }
}