package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MHatList extends AppCompatActivity {
    public static final String HOSPITAL_NUM = "com.example.emergencytime.HOSPITAL_NUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhat_list);
        Button mhatRegional = findViewById(R.id.BTNMHatRegional);

        mhatRegional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(18);
            }
        });
    }
    public void openInfo(int hospital){
        Intent intent = new Intent(this, hospitalInfo.class);
        intent.putExtra(HOSPITAL_NUM, hospital);
        startActivity(intent);
    }
}
