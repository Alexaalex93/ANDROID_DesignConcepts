package com.example.cice.designconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView myTxt = (TextView)findViewById(R.id.text3);
        String formattedText = "Esto <i>es</i> una <b>prueba</b> de un <a href='http//www.google.es'>html</a>";
        myTxt.setText(Html.fromHtml(formattedText));

        TextView myTxt2 = (TextView)findViewById(R.id.text4);
        String formattedText2 = getString(R.string.htmlFormattedString);
        myTxt2.setText(Html.fromHtml(formattedText2));



        //Spaaaaaan
        String primeraPalabra = "Hola";
        String segundaPalabra = "Mundo";

        TextView myTxt3 = (TextView)findViewById(R.id.text6);
        ForegroundColorSpan foregroundColorSpanBlue = new ForegroundColorSpan(getResources().getColor(android.R.color.holo_blue_dark));
        SpannableStringBuilder ssb = new SpannableStringBuilder(primeraPalabra);

        ssb.setSpan(foregroundColorSpanBlue,
                0,
                ssb.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        ssb.append(" ");

        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        ssb.append(segundaPalabra);
        ssb.setSpan(strikethroughSpan,
                ssb.length() - segundaPalabra.length(),
                ssb.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        myTxt3.setText(ssb, TextView.BufferType.EDITABLE);


    }
}
