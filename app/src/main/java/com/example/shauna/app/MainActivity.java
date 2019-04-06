package com.example.shauna.app;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ClarinetButton;
    private Button AltoButton;
    private Button FluteButton;
    private Button FrenchButton;
    private Button Tuner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer tuner= MediaPlayer.create(this,R.raw.tuner);
        Tuner=(Button)this.findViewById(R.id.Tuner);
        Tuner.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tuner.start();

            }
        });

        ClarinetButton = (Button) findViewById(R.id.ClarinetButton);
         ClarinetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClarinet();
            }
        });

        FluteButton = (Button) findViewById(R.id.FluteButton);
        FluteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlute();
            }
        });

        AltoButton = (Button) findViewById(R.id.AltoButton);
        AltoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlto();
            }
        });

        FrenchButton = (Button) findViewById(R.id.FrenchButton);
        FrenchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrench();
            }
        });

    }


    public void openClarinet() {
        Intent intent = new Intent(this, Clarinet.class);
        startActivity(intent);
    }

    public void openAlto() {
        Intent intent = new Intent(this, Saxophone.class);
        startActivity(intent);
    }

    public void openFlute() {
        Intent intent = new Intent(this, Flute.class);
        startActivity(intent);
    }

    public void openFrench() {
        Intent intent = new Intent(this, FrenchHorn.class);
        startActivity(intent);
    }
}

