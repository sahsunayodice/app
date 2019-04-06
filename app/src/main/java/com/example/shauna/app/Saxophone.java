package com.example.shauna.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Saxophone extends AppCompatActivity {
    private Button majorG2;
    private Button majorBFlat2;
    private Button majorF2;
    private Button majorE2;
    private Button majorC2;
    private Button factsax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saxophone);

        majorBFlat2 = (Button) findViewById(R.id.majorBFlat2);
        majorBFlat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertDFlat2();
            }
        });

        majorE2 = (Button) findViewById(R.id.majorE2);
        majorE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertG1();
            }
        });

        majorF2 = (Button) findViewById(R.id.majorF2);
        majorF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertAFlat2();
            }
        });

        majorG2 = (Button) findViewById(R.id.majorG2);
        majorG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertBFlat2();
            }
        });

        majorC2 = (Button) findViewById(R.id.majorC2);
        majorC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertEb4();
            }
        });

        factsax=(Button) findViewById(R.id.factsax);
        factsax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaxFact();
            }
        });
    }


    public void openConcertDFlat2() {
        Intent intent = new Intent(this, ConcertDFlat2.class);
        startActivity(intent);
    }

    public void openConcertG1() {
        Intent intent = new Intent(this, ConcertG1.class);
        startActivity(intent);
    }

    public void openConcertAFlat2() {
        Intent intent = new Intent(this, ConcertAFlat2.class);
        startActivity(intent);
    }

    public void openConcertBFlat2() {
        Intent intent = new Intent(this, ConcertBFlat2.class);
        startActivity(intent);
    }

    public void openConcertEb4() {
        Intent intent = new Intent(this, ConcertEb4.class);
        startActivity(intent);
    }

    public void openSaxFact(){
        Intent intent = new Intent(this, factsax.class);
        startActivity(intent);
    }

}
