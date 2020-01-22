package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);

        Button calgary =  findViewById(R.id.BTNCalgary);
        Button edmonton =  findViewById(R.id.BTNEdmonton);
        Button lethbridge = findViewById(R.id.BTNLethbridge);
        Button mHat = findViewById(R.id. BTNMedicineHat);
        Button redDeer = findViewById(R.id.BTNRedDeer);

        calgary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalgary();
            }
        });
        edmonton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdmonton();
            }
        });
        lethbridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLeth();
            }
        });
        mHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmHat();
            }
        });
        redDeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openredDeer();
            }
        });


    }

    public void openCalgary() {
        Intent intent = new Intent(this,CalgaryList.class);
        startActivity(intent);
    }
    public void openEdmonton() {
        Intent intent = new Intent(this,EdmontonList.class);
        startActivity(intent);
    }
    public void openLeth() {
        Intent intent = new Intent(this,LethbridgeList.class);
        startActivity(intent);
    }
    public void openmHat() {
        Intent intent = new Intent(this,MHatList.class);
        startActivity(intent);
    }
    public void openredDeer() {
        Intent intent = new Intent(this,RedDeerList.class);
        startActivity(intent);
    }

}

