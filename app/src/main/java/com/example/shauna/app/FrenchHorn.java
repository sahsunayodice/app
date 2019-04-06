package com.example.shauna.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrenchHorn extends AppCompatActivity {

    private Button majorBFlat4;
    private Button majorC4;
    private Button majorF4;
    private Button majorE4;
    private Button majorG4;
    private Button frenchhornfact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_horn);

        majorBFlat4 = (Button) findViewById(R.id.majorBFlat4);
        majorBFlat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertEFlat3();
            }
        });

        majorC4 = (Button) findViewById(R.id.majorC4);
        majorC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertF2();
            }
        });

        majorG4 = (Button) findViewById(R.id.majorG4);
        majorG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertC1();
            }
        });

        majorF4 = (Button) findViewById(R.id.majorF4);
        majorF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertBFlat3();
            }
        });

        majorE4 = (Button) findViewById(R.id.majorE4);
        majorE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertA1();
            }
        });

        frenchhornfact=(Button) findViewById(R.id.frenchhornfact);
        frenchhornfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrenchFact();
            }
        });
    }


    public void openConcertBFlat3() {
        Intent intent = new Intent(this, ConcertBFlat3.class);
        startActivity(intent);
    }

    public void openConcertF2() {
        Intent intent = new Intent(this, ConcertF2.class);
        startActivity(intent);
    }

    public void openConcertC1() {
        Intent intent = new Intent(this, ConcertC1.class);
        startActivity(intent);
    }

    public void openConcertEFlat3() {
        Intent intent = new Intent(this, ConcertEFlat3.class);
        startActivity(intent);
    }

    public void openConcertA1() {
        Intent intent = new Intent(this, ConcertA1.class);
        startActivity(intent);
    }

    public void openFrenchFact(){
        Intent intent = new Intent(this, frenchhornfact.class);
        startActivity(intent);
    }
}

