package com.example.unicorntestassessmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class MainActivity extends AppCompatActivity {
    Activity binding;
    BottomNavigationItemView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     binding = Activity.inflate(getLayoutInflater());
        setContentView(binding.getResources());

        binding.bottonNavigationView.setonitem
                switch (item.getItemID()){
                    case R.id.home:

                }

    }
}