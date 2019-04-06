package com.example.shauna.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clarinet extends AppCompatActivity {
    private Button ClarinetmajorC;
    private Button ClarinetmajorBFlat;
    private Button ClarinetmajorG;
    private Button ClarinetmajorF;
    private Button ClarinetmajorE;
    private Button clarinetfact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clarinet);

        ClarinetmajorC = (Button) findViewById(R.id.ClarinetmajorC);
        ClarinetmajorC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertBFlat1();
            }
        });

        ClarinetmajorBFlat = (Button) findViewById(R.id.ClarinetmajorBFlat);
        ClarinetmajorBFlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertAFlat1();
            }
        });

        ClarinetmajorG = (Button) findViewById(R.id.ClarinetmajorG);
        ClarinetmajorG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertF1();
            }
        });

        ClarinetmajorF = (Button) findViewById(R.id.ClarinetmajorF);
        ClarinetmajorF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertEFlat1();
            }
        });

        ClarinetmajorE = (Button) findViewById(R.id.ClarinetMajorE);
        ClarinetmajorE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertD1();
            }
        });

        clarinetfact = (Button) findViewById(R.id.clarinetfact);
        clarinetfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFunFactClarinet();
            }
        });
    }


    public void openConcertBFlat1() {
        Intent intent = new Intent(this, ConcertBFlat1.class);
        startActivity(intent);
    }

    public void openConcertAFlat1() {
        Intent intent = new Intent(this, ConcertAFlat1.class);
        startActivity(intent);
    }

    public void openConcertF1() {
        Intent intent = new Intent(this, ConcertF1.class);
        startActivity(intent);
    }

    public void openConcertD1() {
        Intent intent = new Intent(this, ConcertD1.class);
        startActivity(intent);
    }

    public void openConcertEFlat1() {
        Intent intent = new Intent(this, ConcertEFlat1.class);
        startActivity(intent);
    }

    public void openFunFactClarinet(){
        Intent intent = new Intent(this,FunFactClarinet.class);
        startActivity(intent);
    }

}
