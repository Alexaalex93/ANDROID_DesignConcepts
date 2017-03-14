package com.example.cice.designconcepts;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment;
import com.codetroopers.betterpickers.datepicker.DatePickerBuilder;
import com.codetroopers.betterpickers.expirationpicker.ExpirationPickerBuilder;
import com.codetroopers.betterpickers.hmspicker.HmsPickerBuilder;
import com.codetroopers.betterpickers.numberpicker.NumberPickerBuilder;
import com.codetroopers.betterpickers.timepicker.TimePickerBuilder;

public class InputViewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_views);

        Button calendarButton = (Button) findViewById(R.id.button4);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalendarDatePickerDialogFragment cdp = new CalendarDatePickerDialogFragment()
                        .setFirstDayOfWeek(Calendar.MONDAY)
                        .setPreselectedDate(2016,0,12)
                        .setDoneText("Todo bien")
                        .setCancelText("Todo mal");
                cdp.show(getSupportFragmentManager(), "Mostrar calendario");
            }
        });

        Button datepicker = (Button) findViewById(R.id.datepickerbtn);
        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerBuilder dpb = new DatePickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment_Light)
                        .setYearOptional(true);
                dpb.show();
            }
        });
        final Button expirationPicker = (Button) findViewById(R.id.expirationpickerbtn);
        expirationPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExpirationPickerBuilder expirationPickerBuilder = new ExpirationPickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment)
                        .setMinYear(2015);
                expirationPickerBuilder.show();
            }
        });
        final Button hmsbutton = (Button) findViewById(R.id.hmspickerbtn);
        hmsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HmsPickerBuilder hmsPickerBuilder = new HmsPickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment);
                hmsPickerBuilder.show();
            }
        });
        Button numberPicker = (Button) findViewById(R.id.numberpickerbtn);
        numberPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumberPickerBuilder numberPickerBuilder = new NumberPickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment)
                        .setLabelText("Hola");
                numberPickerBuilder.show();;
            }
        });
        final Button timePicker = (Button) findViewById(R.id.timepickerbtn);
        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerBuilder timePickerBuilder = new TimePickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment);
                timePickerBuilder.show();
            }
        });



    }
}
