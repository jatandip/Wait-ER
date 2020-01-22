package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RedDeerList extends AppCompatActivity {
    public static final String HOSPITAL_NUM = "com.example.emergencytime.HOSPITAL_NUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_deer_list);
        Button reddeerRegional = findViewById(R.id.BTNRedDeerRegional);
        Button reddeerInnisfail = findViewById(R.id.BTNRedDeerInnisfail);
        Button reddeerLacombe = findViewById(R.id.BTNRedDeerLacombe);

        reddeerRegional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(19);
            }
        });
        reddeerInnisfail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(20);
            }
        });
        reddeerLacombe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(21);
            }
        });
    }
    public void openInfo(int hospital){
        Intent intent = new Intent(this, hospitalInfo.class);
        intent.putExtra(HOSPITAL_NUM, hospital);
        startActivity(intent);
    }
}
