package com.example.cice.designconcepts;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class EditTextsActivity extends AppCompatActivity {
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_texts);

        final EditText editText = (EditText) findViewById(R.id.editText);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                string = editText.getText().toString();
                Log.d(getClass().getCanonicalName(), "Antes " + string);

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                string = editText.getText().toString();
                Log.d(getClass().getCanonicalName(), "Durante " + string);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                string = editText.getText().toString();
                Log.d(getClass().getCanonicalName(), "Despues " + string);
            }
        });
    setupFloatingLabelError();

    }

    public void setupFloatingLabelError(){
        final TextInputLayout floatingUsernameLabel = (TextInputLayout) findViewById(R.id.text_input_layout2);
        floatingUsernameLabel.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.length() > 0 && charSequence.length() <= 4){
                    floatingUsernameLabel.setError(getString(R.string.username_error));
                    floatingUsernameLabel.setErrorEnabled(true);
                }
                else
                    floatingUsernameLabel.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }


}
