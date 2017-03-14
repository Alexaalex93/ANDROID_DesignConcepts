package com.example.cice.designconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class CheckBoxesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                onCheckBoxClicked(compoundButton);
            }
        });
    }

    public void onCheckBoxClicked(View view){

        Log.d("CheckBox marcado","Checkbox selected" + ((CheckBox) view).isChecked());


    }

    public void onRadioButtonClicked(View v){
        boolean checked = ((RadioButton)v).isChecked();

        switch (v.getId()){
            case R.id.radioButton1:
                if (checked)
                    Toast.makeText(this, "Marcado 1", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Desmarcado 1", Toast.LENGTH_SHORT).show();
                break;

        }


    }


}
