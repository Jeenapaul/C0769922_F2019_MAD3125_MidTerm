package com.example.c0769922_f2019_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText sin;

    EditText firstName;

    EditText lastName;

    EditText birth;

    EditText income;

    EditText RRSP;

    RadioGroup genderGroup;

    RadioButton radioGenderButton;

    Calendar myCalendar = Calendar.getInstance();

    private Calendar calendar;

    int day, month, year;

    private DatePickerDialog datePickerDialog;

    private int remaining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sin = (EditText) findViewById(R.id.txtSinNumber);

        firstName = (EditText) findViewById(R.id.txtFirstName);

        lastName = (EditText) findViewById(R.id.txtlastName);

        birth = (EditText) findViewById(R.id.dob);

        income = (EditText) findViewById(R.id.txtIncome);

        RRSP = (EditText) findViewById(R.id.txtRrspContributed);

        genderGroup = (RadioGroup) findViewById(R.id.radioGroup1);





        int selectedId = genderGroup.getCheckedRadioButtonId();

        radioGenderButton = (RadioButton) findViewById(selectedId);

        calendar = Calendar.getInstance();

        day = calendar.get(Calendar.DAY_OF_MONTH);

        month = calendar.get(Calendar.MONTH);

        year = calendar.get(Calendar.YEAR);



    }
    //test
}
