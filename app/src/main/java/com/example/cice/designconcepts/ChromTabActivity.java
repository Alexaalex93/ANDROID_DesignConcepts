package com.example.cice.designconcepts;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class ChromTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrom_tab);

        //Crear los Tabs Intents
        String url = "http://www.google.es";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();

        //Darle color
        int colorInt = Color.argb(255,255,175,64);
        builder.setToolbarColor(colorInt);

        //Custom Action Button
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_camera_roll_black_24dp);
        String desc = "kjwfbosj";

        Boolean tint = true;

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("hola","txt");

        Random generator = new Random();

        PendingIntent pendingIntent = PendingIntent.getActivity(this, generator.nextInt(), intent, PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setActionButton(icon, desc, pendingIntent, tint);

        customTabsIntent.launchUrl(this, Uri.parse(url));



    }
}
