package com.example.iqsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Faculty_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_details);
        Button button1 = findViewById(R.id.Personal_Information);
        Button button2 = findViewById(R.id.PG_PhD_NET_SLET);
        Button button3 = findViewById(R.id.Ph_Ds_Guideship);
        Button button4 = findViewById(R.id.Teaching_experience_in_other_Institutions);
        Button button5 = findViewById(R.id.Teaching_in_MCC);
        Button button6 = findViewById(R.id.Total_Experience_Teaching);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button1 click
                switchToActivity(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button2 click
                switchToActivity(2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button3 click
                switchToActivity(3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button2 click
                switchToActivity(4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button2 click
                switchToActivity(5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button2 click
                switchToActivity(6);
            }
        });


    }
    private void switchToActivity(int activityNumber) {
        Class<?> targetActivity = null;

        switch (activityNumber) {
            case 1:
                targetActivity = PersonalInformation.class;
                break;
            case 2:
                targetActivity = PG_PhD_NET_SLET.class;
                break;
            case 3:
                targetActivity = PhdGuideship.class;
                break;
            case 4:
                targetActivity = teaching_experience_in_other_institutions.class;
                break;
            case 5:
                targetActivity = teaching_in_mcc.class;
                break;
            case 6:
                targetActivity = total_experience_teaching.class;
                break;

            default:
                // Handle invalid case
                break;
        }

        if (targetActivity != null) {
            Intent intent = new Intent(this, targetActivity);
            startActivity(intent);
        }
    }
}