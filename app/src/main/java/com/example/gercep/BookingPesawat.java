package com.example.gercep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BookingPesawat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_pesawat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}