package com.h.chad.mixtape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class createMix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mix);
        goToTrackSearch();
    }
    //create a button to go to the search activity
    public void goToTrackSearch(){
        TextView gotoSearch = (TextView) findViewById(R.id.addTrack);

        gotoSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(createMix.this, searchForMusic.class);
                startActivity(i);
            }
        });

    }
}
