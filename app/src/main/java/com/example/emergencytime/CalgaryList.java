package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
1:  Calgary Childrens hospital      12: Edmonton Stollery
2:  Calgary Foothills               13: Edmonton Strathcona
3:  Calgary Peter Lougheed          14: Edmonton Sturgeon
4:  Calgary Rockyview               15: Edmonton University Hospital
5:  Calgary South Campus            16: Edmonton Westview
6:  Edmonton Fort Sask              17: Lethbridge Chinook
7:  Edmonton Grey Nuns              18: Medicine Hat Regional
8:  Edmonton Leduc                  19: Red Deer Regional
9:  Edmonton Miserecordia           20: Red Deer Innisfail
10: Edmonton Northeast              21: Red Deer Lacombe
11: Edmonton Royal Alex
 */


public class CalgaryList extends AppCompatActivity {
    public static final String HOSPITAL_NUM = "com.example.emergencytime.HOSPITAL_NUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calgary_list);

        Button calChildren = findViewById(R.id.BTNCalgaryChildrenHospital);
        Button calFoothills = findViewById(R.id.BTNCalgaryFoothills);
        Button calPeter = findViewById(R.id.BTNCalgaryPeter);
        Button calRockyview = findViewById(R.id.BTNCalgaryRockyview);
        Button calSouthCampus = findViewById(R.id.BTNCalgarySouthCampus);


        calChildren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(1);
            }
        });
        calFoothills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(2);
            }
        });
        calPeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(3);
            }
        });
        calRockyview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(4);
            }
        });
        calSouthCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(5);
            }
        });
    }

    public void openInfo(int hospital){
        Intent intent = new Intent(this, hospitalInfo.class);
        intent.putExtra(HOSPITAL_NUM, hospital);
        startActivity(intent);
    }
}
