package com.example.emergencytime;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import java.util.Map;

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
public class EdmontonList extends AppCompatActivity {
    public static final String HOSPITAL_NUM = "com.example.emergencytime.HOSPITAL_NUM";
    webscrape webs = new webscrape();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Map<String,String> time = webs.get_time("Edmonton");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edmonton_list);

        TextView fortSask = findViewById(R.id.text);
        /*TextView greyNuns = findViewById(R.id.waitTimeSask);
        TextView Leduc = findViewById(R.id.waitTimeSask);
        TextView Mise = findViewById(R.id.waitTimeSask);
        TextView North = findViewById(R.id.waitTimeSask);
        TextView Royal = findViewById(R.id.waitTimeSask);
        TextView Stollery = findViewById(R.id.waitTimeSask);
        TextView Strathcona = findViewById(R.id.waitTimeSask);
        TextView Strugeon = findViewById(R.id.waitTimeSask);
        TextView Uni = findViewById(R.id.waitTimeSask);
        TextView westview = findViewById(R.id.waitTimeSask);*/

        Log.e("Dict:",time.toString());
        /*greyNuns.setText((time.get("Grey Nuns Community Hospital")));
        Leduc.setText((time.get("Leduc Community Hospital")));
        Mise.setText((time.get("Misericordia Community Hospital")));
        North.setText((time.get("Northeast Community Health Centre")));
        Royal.setText((time.get("Royal Alexandra Hospital")));
        Stollery.setText((time.get("Stollery Children's Hospital")));
        Strathcona.setText((time.get("Strathcona Community Hospital")));
        Strugeon.setText((time.get("Sturgeon Community Hospital")));
        Uni.setText((time.get("University of Alberta Hospital")));
        westview.setText((time.get("WestView Health Centre")));*/


        Button edmFortSask = findViewById(R.id.BTNEdmontonFortSask);
        Button edmGreyNuns = findViewById(R.id.BTNEdmontonGreyNuns);
        Button edmLeduc = findViewById(R.id.BTNEdmontonLeduc);
        Button edmMisericordia = findViewById(R.id.BTNEdmontonMisericordia);
        Button edmNortheast = findViewById(R.id.BTNEdmontonNortheast);
        Button edmRoyalAlex = findViewById(R.id.BTNEdmontonRoyalAlex);
        Button edmStollery = findViewById(R.id.BTNEdmontonStollery);
        Button edmStrathcona = findViewById(R.id.BTNEdmontonStrathcona);
        Button edmSturgeon = findViewById(R.id.BTNEdmontonSturgeon);
        Button edmUniversity = findViewById(R.id.BTNEdmontonUniversity);
        Button edmWestview = findViewById(R.id.BTNEdmontonWestview);

        edmFortSask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(6);
            }
        });
        edmGreyNuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(7);
            }
        });
        edmLeduc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(8);
            }
        });
        edmMisericordia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(9);
            }
        });
        edmNortheast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(10);
            }
        });
        edmRoyalAlex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(11);
            }
        });
        edmStollery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(12);
            }
        });
        edmStrathcona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(13);
            }
        });
        edmSturgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(14);
            }
        });
        edmUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(15);
            }
        });
        edmWestview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(16);
            }
        });

    }
    public void openInfo(int hospital){
        Intent intent = new Intent(this, hospitalInfo.class);
        intent.putExtra(HOSPITAL_NUM, hospital);
        startActivity(intent);
    }
}
