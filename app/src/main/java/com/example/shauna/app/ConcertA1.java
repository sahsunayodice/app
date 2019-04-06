package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertA1 extends AppCompatActivity {
    private Button MajorEScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_a1);

        final MediaPlayer ConcertD= MediaPlayer.create(this,R.raw.es);
        MajorEScale=(Button)this.findViewById(R.id.Tuner);
        MajorEScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConcertD.start();

            }
        });
    }
}
