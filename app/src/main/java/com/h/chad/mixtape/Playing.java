package com.h.chad.mixtape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.h.chad.mixtape.R.id.track0;
import static com.h.chad.mixtape.R.id.track2;

public class Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        goToInfo();
    }

    public void goToInfo() {
        TextView track0 = (TextView) findViewById(R.id.track0);
        TextView track1 = (TextView) findViewById(R.id.track1);
        TextView track2 = (TextView) findViewById(R.id.track2);

        track0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInfoIntent();
            }
        });
        track1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInfoIntent();
            }
        });
        track2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInfoIntent();
            }
        });
    }
    public void startInfoIntent() {
        Intent i = new Intent(Playing.this, TrackInformation.class);
        startActivity(i);
    }
}
