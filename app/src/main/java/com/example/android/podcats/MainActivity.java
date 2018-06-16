package com.example.android.podcats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String PODCAST_TITLE = "PODCAST_TITLE";
    public static final String EPISODE_TITLE = "EPISODE_TITLE";
    public static final int PODCAST_ART = 444;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView smsk = (ImageView) findViewById(R.id.smsk_image_view);

        smsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smskIntent = new Intent(MainActivity.this, StuffMewActivity.class);
                startActivity(smskIntent);


            }
        });
        ImageView thisAmeowicanLife = (ImageView) findViewById(R.id.this_ameowican_life_image_view);

        thisAmeowicanLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thisAmeowicanLifeIntent = new Intent(MainActivity.this, ThisAmeowicanActivity.class);
                startActivity(thisAmeowicanLifeIntent);


            }
        });


    }
}
