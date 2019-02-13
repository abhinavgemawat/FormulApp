package com.Group7.formulapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button Trig_btn;
    private Button Physics_btn;

    private Button LandA_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Trig_btn = (Button) findViewById(R.id.Trig_btn);         //declaring buttons
        Physics_btn = (Button) findViewById(R.id.Physics_btn);
        LandA_btn = (Button) findViewById(R.id.LandA_btn);

        Trig_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openTrigPage();         //function for opening page
            }
        });

        Physics_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage();   //function for opening page
            }

        });

        LandA_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLengthandAreaPage(); // function for opening page
            }
        });
    }
    public void openTrigPage(){         //Not really sure how this work will have to look into it
        Intent intent = new Intent(this,Trig_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage(){
        Intent intent = new Intent(this,Physics_page.class);
        startActivity(intent);
    }
    public void openLengthandAreaPage(){
        Intent intent = new Intent(this,Length_Area_page.class);
        startActivity(intent);
    }
}
