package com.example.c0769922_f2019_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView fName;
    TextView Age;
    TextView taxfilingdate;
    TextView federalTax;
    TextView provincialTax;
    TextView carryFrwdCpp;
    TextView tEi;
    TextView carryFrwdRRSP;
    TextView ttaxinc;
    TextView taxPaid;
    private double eI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
