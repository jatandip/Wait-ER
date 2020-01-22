package com.example.emergencytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;

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
public class hospitalInfo extends AppCompatActivity {
    int hospitalNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_info);

        Intent intent = getIntent();
        int imageResource = getResources().getIdentifier("@drawable/hospital1", null, this.getOpPackageName());;
        Button phoneNumBox = findViewById(R.id.TBhospitalNumber);
        TextView hospitalName = findViewById(R.id.TBhospitalName);
        ImageView hospitalPic = findViewById(R.id.IVhospitalPic);

        hospitalNum = intent.getIntExtra(CalgaryList.HOSPITAL_NUM,0);
        if(hospitalNum == 0){
            hospitalNum = intent.getIntExtra(EdmontonList.HOSPITAL_NUM,0);
        }
        if(hospitalNum == 0){
            hospitalNum = intent.getIntExtra(LethbridgeList.HOSPITAL_NUM,0);
        }
        if(hospitalNum == 0){
            hospitalNum = intent.getIntExtra(MHatList.HOSPITAL_NUM,0);
        }
        if(hospitalNum == 0){
            hospitalNum = intent.getIntExtra(RedDeerList.HOSPITAL_NUM,0);
        }
        switch(hospitalNum) {
            case 1:
                phoneNumBox.setText("(403) 955 7211");
                hospitalName.setText("Childrens Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital1", null, this.getOpPackageName());
                break;
            case 2:
                phoneNumBox.setText("(403) 944 1110");
                hospitalName.setText("Foothills Medical Centre");
                imageResource = getResources().getIdentifier("@drawable/hospital2", null, this.getOpPackageName());
                break;
            case 3:
                phoneNumBox.setText("(403) 943 4555");
                hospitalName.setText("Peter Lougheed Centre");
                imageResource = getResources().getIdentifier("@drawable/hospital3", null, this.getOpPackageName());
                break;
            case 4:
                phoneNumBox.setText("(403) 943 3000");
                hospitalName.setText("Rockyview General Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital4", null, this.getOpPackageName());
                break;
            case 5:
                phoneNumBox.setText("(403) 956 1111");
                hospitalName.setText("South Health Campus");
                imageResource = getResources().getIdentifier("@drawable/hospital5", null, this.getOpPackageName());
                break;
            case 6:
                phoneNumBox.setText("(780) 998 2256");
                hospitalName.setText("Fort Sask. hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital6", null, this.getOpPackageName());
                break;
            case 7:
                phoneNumBox.setText("(780) 735 7000");
                hospitalName.setText("Grey Nuns Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital7", null, this.getOpPackageName());
                break;
            case 8:
                phoneNumBox.setText("(780) 986 7711");
                hospitalName.setText("Leduc Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital8", null, this.getOpPackageName());
                break;
            case 9:
                phoneNumBox.setText("(780) 735 2000");
                hospitalName.setText("Misericordia Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital9", null, this.getOpPackageName());
                break;
            case 10:
                phoneNumBox.setText("(780) 342 4000");
                hospitalName.setText("Northeast Health Centre");
                imageResource = getResources().getIdentifier("@drawable/hospital10", null, this.getOpPackageName());
                break;
            case 11:
                phoneNumBox.setText("(780) 735 4111");
                hospitalName.setText("Royal Alexandra Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital11", null, this.getOpPackageName());
                break;
            case 12:
                phoneNumBox.setText("(780) 407 8822");
                hospitalName.setText("Stollery Children's Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital12", null, this.getOpPackageName());
                break;
            case 13:
                phoneNumBox.setText("(780) 449 5380");
                hospitalName.setText("Strathcona Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital13", null, this.getOpPackageName());
                break;
            case 14:
                phoneNumBox.setText("(780) 418 8200");
                hospitalName.setText("Sturgeon Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital14", null, this.getOpPackageName());
                break;
            case 15:
                phoneNumBox.setText("(780) 407 8822");
                hospitalName.setText("University Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital15", null, this.getOpPackageName());
                break;
            case 16:
                phoneNumBox.setText("(780) 968 3600");
                hospitalName.setText("Westview Health Centre");
                imageResource = getResources().getIdentifier("@drawable/hospital16", null, this.getOpPackageName());
                break;
            case 17:
                phoneNumBox.setText("(403) 388 6111");
                hospitalName.setText("Chinook Regional Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital17", null, this.getOpPackageName());
                break;
            case 18:
                phoneNumBox.setText("(403) 529 8000");
                hospitalName.setText("Medicine Hat Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital18", null, this.getOpPackageName());
                break;
            case 19:
                phoneNumBox.setText("(403) 343 4422");
                hospitalName.setText("Red Deer Regional Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital19", null, this.getOpPackageName());
                break;
            case 20:
                phoneNumBox.setText("(403) 227 7800");
                hospitalName.setText("Innisfail Health Centre");
                imageResource = getResources().getIdentifier("@drawable/hospital20", null, this.getOpPackageName());
                break;
            case 21:
                phoneNumBox.setText("(403) 782 3336");
                hospitalName.setText("Lacombe Hospital");
                imageResource = getResources().getIdentifier("@drawable/hospital21", null, this.getOpPackageName());
                break;

        }
        hospitalPic.setImageResource(imageResource);

        phoneNumBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                switch(hospitalNum) {
                    case 1:
                        intent.setData(Uri.parse("tel:(403) 955 7211"));
                        break;
                    case 2:
                        intent.setData(Uri.parse("tel:(403) 944 1110"));
                        break;
                    case 3:
                        intent.setData(Uri.parse("tel:(403) 943 4555"));
                        break;
                    case 4:
                        intent.setData(Uri.parse("tel:(403) 943 3000"));
                        break;
                    case 5:
                        intent.setData(Uri.parse("tel:(403) 956 1111"));
                        break;
                    case 6:
                        intent.setData(Uri.parse("tel:(780) 998 2256"));
                        break;
                    case 7:
                        intent.setData(Uri.parse("tel:(780) 735 7000"));
                        break;
                    case 8:
                        intent.setData(Uri.parse("tel:(780) 986 7711"));
                        break;
                    case 9:
                        intent.setData(Uri.parse("tel:(780) 735 2000"));
                        break;
                    case 10:
                        intent.setData(Uri.parse("tel:(780) 342 4000"));
                        break;
                    case 11:
                        intent.setData(Uri.parse("tel:(780) 735 4111"));
                        break;
                    case 12:
                        intent.setData(Uri.parse("tel:(780) 407 8822"));
                        break;
                    case 13:
                        intent.setData(Uri.parse("tel:(780) 449 5380"));
                        break;
                    case 14:
                        intent.setData(Uri.parse("tel:(780) 418 8200"));
                        break;
                    case 15:
                        intent.setData(Uri.parse("tel:(780) 407 8822"));
                        break;
                    case 16:
                        intent.setData(Uri.parse("tel:(780) 968 3600"));
                        break;
                    case 17:
                        intent.setData(Uri.parse("tel:(403) 388 6111"));
                        break;
                    case 18:
                        intent.setData(Uri.parse("tel:(403) 529 8000"));
                        break;
                    case 19:
                        intent.setData(Uri.parse("tel:(403) 343 4422"));
                        break;
                    case 20:
                        intent.setData(Uri.parse("tel:(403) 227 7800"));
                        break;
                    case 21:
                        intent.setData(Uri.parse("tel:(403) 782 3336"));
                        break;
                }

                startActivity(intent);
            }
        });


    }
}
