package com.example.c0769922_f2019_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView fullName;
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
        fullName = (TextView)findViewById(R.id.txtfullName);
        Age = (TextView)findViewById(R.id.txtage);
        taxfilingdate = (TextView)findViewById(R.id.taxFilingdate);
        federalTax = (TextView)findViewById(R.id.txtfederalTax);
        provincialTax = (TextView)findViewById(R.id.txtprovincialTax);
        carryFrwdCpp = (TextView)findViewById(R.id.txtcarryForwardCpp);

        tEi = (TextView)findViewById(R.id.txteI);
        carryFrwdRRSP = (TextView)findViewById(R.id.txtRrspContributed);
        ttaxinc = (TextView)findViewById(R.id.txtIncome);
        //taxPaid = (TextView)findViewById(R.id.txt);
        

    }
}
