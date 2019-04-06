package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertE1 extends AppCompatActivity {
    private Button MajorESound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_e1);

        final MediaPlayer playE= MediaPlayer.create(this,R.raw.es);
        MajorESound=(Button)this.findViewById(R.id.MajorESound);
        MajorESound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playE.start();

            }
        });
    }
}
