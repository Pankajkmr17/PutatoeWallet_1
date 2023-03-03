package com.example.putatoewallet;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();


        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#20B2AA")));

        actionBar.setTitle("Putatoe Wallet ");

        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}