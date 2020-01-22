package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startBTN =  findViewById(R.id.startBTN);
        startBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocations();
            }
        });
        ImageView logoPic = findViewById(R.id.logoMainIMAGEVIEW);

        int imageResource = getResources().getIdentifier("@drawable/abetalogo", null, this.getOpPackageName());
        logoPic.setImageResource(imageResource);
    }

    public void openLocations() {
        Intent intent = new Intent(this,Locations.class);
        startActivity(intent);
    }

}
