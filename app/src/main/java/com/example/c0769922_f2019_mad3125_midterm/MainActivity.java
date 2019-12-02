package com.example.c0769922_f2019_mad3125_midterm;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Calendar;
import java.util.Date;

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



        birth.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.N)

            @Override

            public void onClick(View v) {

                Calendar cal = Calendar.getInstance();

                int year = cal.get(Calendar.YEAR);

                int month = cal.get(Calendar.MONTH);

                int day = cal.get(Calendar.DAY_OF_MONTH);



                DatePickerDialog datePickerDialog = new DatePickerDialog(v.getContext(),android.R.style.Theme_Black, datePickerListener, year,month,day);

                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());

                datePickerDialog.show();

            }

        });



        findViewById(R.id.btnsubmit).setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if (sin.length() != 0 && birth.length() != 0 && firstName.length() != 0 && lastName.length() != 0 && income.length() != 0 && RRSP.length() != 0) {



                    String sinNum = String.valueOf(sin.getText());

                    String dateofBirth = String.valueOf(birth.getText());

                    final String mAge = String.valueOf(getAge(dateofBirth));

                    String fname = String.valueOf(firstName.getText());

                    String lname = String.valueOf(lastName.getText());

                    String grsinc = String.valueOf(income.getText());

                    String rrspcntr = String.valueOf(RRSP.getText());

                    double grossInc = Double.parseDouble(grsinc);

                    double rrspcntrr = Double.parseDouble(rrspcntr);

                    int ageee = Integer.parseInt(mAge);




    }
    //test
}
