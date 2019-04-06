package com.example.shauna.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flute extends AppCompatActivity {

    private Button FlutemajorG3;
    private Button FlutemajorE3;
    private Button FlutemajorF3;
    private Button FlutemajorBFlat3;
    private Button FlutemajorC3;
    private Button FunFactFlute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flute);



        FlutemajorBFlat3 = (Button) findViewById(R.id.FlutemajorBFlat3);
        FlutemajorBFlat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertBFlat4();
            }
        });

        FlutemajorC3 = (Button) findViewById(R.id.FlutemajorC3);
        FlutemajorC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertC2();
            }
        });

        FlutemajorE3 = (Button) findViewById(R.id.FlutemajorE3);
        FlutemajorE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertE1();
            }
        });

        FlutemajorF3 = (Button) findViewById(R.id.FlutemajorF3);
        FlutemajorF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertF3();
            }
        });

        FlutemajorG3 = (Button) findViewById(R.id.FlutemajorG3);
        FlutemajorG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConcertG2();
            }
        });

        FunFactFlute=(Button) findViewById(R.id.FunFactFlute);
        FunFactFlute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFluteFact();
            }
        });
    }


    public void openConcertBFlat4() {
        Intent intent = new Intent(this, ConcertBFlat4.class);
        startActivity(intent);
    }

    public void openConcertC2() {
        Intent intent = new Intent(this, ConcertC2.class);
        startActivity(intent);
    }

    public void openConcertE1() {
        Intent intent = new Intent(this, ConcertE1.class);
        startActivity(intent);
    }

    public void openConcertF3() {
        Intent intent = new Intent(this, ConcertF3.class);
        startActivity(intent);
    }

    public void openConcertG2() {
        Intent intent = new Intent(this, ConcertG2.class);
        startActivity(intent);
    }

    public void openFluteFact() {
        Intent intent = new Intent(this, FunFactFlute.class);
        startActivity(intent);
    }
}