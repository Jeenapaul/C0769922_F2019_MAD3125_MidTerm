package com.example.c0769922_f2019_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
    //test
}
