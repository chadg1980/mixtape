package com.h.chad.mixtape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToNewMixtape();
        playMix();
        playMix2();
        playMix3();
        playMix4();

    }

    //function to go to create mixtape view
    public void goToNewMixtape(){
        //find the view that goes to the new activity
        TextView newMixtape = (TextView) findViewById(R.id.createNewMix);
        newMixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to link to activity_create_mix
                Intent intent = new Intent(MainActivity.this, createMix.class);

                //start the new activity
                startActivity(intent);
            }
        });
    }

    public void playMix(){
        //Creating a click lisener for the Layout.
        LinearLayout playMixtape = (LinearLayout) findViewById(R.id.playWorkoutMix);
        //Create click  listener
        playMixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playing.class);
                startActivity(i);
            }
        });

    }
    public void playMix2(){
        //Creating a click lisener for the Layout.
        LinearLayout playMixtape = (LinearLayout) findViewById(R.id.studyMix);
        //Create click  listener
        playMixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playing.class);
                startActivity(i);
            }
        });

    }

    public void playMix3(){
        //Creating a click lisener for the Layout.
        LinearLayout playMixtape = (LinearLayout) findViewById(R.id.roadtripMix);
        //Create click  listener
        playMixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playing.class);
                startActivity(i);
            }
        });

    }
    public void playMix4(){
        //Creating a click lisener for the Layout.
        LinearLayout playMixtape = (LinearLayout) findViewById(R.id.deGrassi);
        //Create click  listener
        playMixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playing.class);
                startActivity(i);
            }
        });

    }
}
