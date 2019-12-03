package com.example.c0769922_f2019_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView fullName;
    TextView Age;
    TextView taxfilingdate;
    TextView fedTax;
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
        fedTax = (TextView)findViewById(R.id.txtfederalTax);
        provincialTax = (TextView)findViewById(R.id.txtprovincialTax);
        carryFrwdCpp = (TextView)findViewById(R.id.txtcarryForwardCpp);

        tEi = (TextView)findViewById(R.id.txteI);
        carryFrwdRRSP = (TextView)findViewById(R.id.txtRrspContributed);
        ttaxinc = (TextView)findViewById(R.id.txtIncome);
        //taxPaid = (TextView)findViewById(R.id.txt);
        String fname = getIntent().getStringExtra("fullName");
        String age = getIntent().getStringExtra("age");
        String cdate = getIntent().getStringExtra("currentdate");
        fullName.setText(fname);
        Age.setText(age);
        taxfilingdate.setText(cdate);
        double federalTax = getIntent().getDoubleExtra("grossInc",0);
        if (federalTax <= 12069){
            federalTax = federalTax;
        }else if (federalTax >= 12069.01 && federalTax <= 47630){
            federalTax = (federalTax/100)*15;
        }else if (federalTax >= 47630.01 && federalTax <= 95259){
            federalTax = (federalTax/100)*20.50;
        }else if (federalTax >= 95259.01 && federalTax <= 147667 ){
            federalTax = (federalTax/100)*26;
        }else if (federalTax >= 147667.01 && federalTax <= 210371){
            federalTax = (federalTax/100)*29;
        }else if (federalTax >= 210371.01){
            federalTax = (federalTax/100)*33;
        }
        String finalresult = String.valueOf(federalTax);
        fedTax.setText(finalresult+"$");
        double pT = getIntent().getDoubleExtra("grossInc",0);

        if (pT <= 10582){
            pT = pT;
        }else if (pT >= 10582.01 && pT <= 43906){
            pT = (pT/100)*5.05;
        }else if (pT >= 43906.01 && pT <= 87813){
            pT = (pT/100)*9.15;
        }else if (pT >= 87813.01 && pT<= 150000){
            pT = (pT/100)*11.16;
        }else if (pT >= 150000.01 && pT <= 220000){
            pT = (pT/100)*12.16;
        }else if (pT >= 220000.01){
            pT = (pT/100)*13.16;
        }

        String finalPT = String.valueOf(pT);
        provincialTax.setText(finalPT+"$");

        double cppcontr = getIntent().getDoubleExtra("grossInc",0);
        double contribution = (cppcontr/100)*5.10;

       


    }
}
