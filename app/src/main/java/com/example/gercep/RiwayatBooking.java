package com.example.gercep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

    public class RiwayatBooking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
