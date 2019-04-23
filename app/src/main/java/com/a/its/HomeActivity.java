package com.a.its;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;


public class HomeActivity extends AppCompatActivity {

    EditText edittext3;
    Calendar calendar;
    int year,month,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //getting calendar instance
        calendar = Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);

        //accessing EditText and Button
        edittext3= findViewById(R.id.edittext3);

        edittext3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                DatePickerDialog datePickerDialog = new DatePickerDialog(HomeActivity.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {
                        //sets date in EditText
                        edittext3.setText(dayOfMonth+"-"+ (month+1) +"-"+year);
                    }
                }, year, month, day);
                //shows DatePickerDialog
                datePickerDialog.show();

            }
        });



    }



}
