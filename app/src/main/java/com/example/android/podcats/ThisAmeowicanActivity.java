package com.example.android.podcats;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ThisAmeowicanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracklist_list);

        //Toolbar button to go back to MainActivity.
        Toolbar myToolbar = (Toolbar) findViewById(R.id.tracklist_toolbar);
        myToolbar.setTitle(getString(R.string.this_ameowican_life_title_name));
        myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }

        });


        //Create a list of tracks for This Ameowican Life
        final ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_648), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_647), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_646), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_645), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_644), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_643), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_642), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_641), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_640), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_639), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_638), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_637), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_636), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_635), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_634), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_633), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_632), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_631), R.drawable.this_ameowican_life));
        tracks.add(new Track(getString(R.string.this_ameowican_life_title_name), getString(R.string.t_a_life_630), R.drawable.this_ameowican_life));

        final TrackAdapter adapter = new TrackAdapter(this, tracks);

        //Uses tracklist.xml as template for ListView
        ListView listView = (ListView) findViewById(R.id.tracklist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Track item = (Track) adapter.getItem(i);
                //Sets intent for nowPlayingActivity.
                Intent nowPlayingActivity = new Intent(ThisAmeowicanActivity.this, NowPlaying.class);
                nowPlayingActivity.putExtra("PODCAST_TITLE", item.getPodcastTitle());
                nowPlayingActivity.putExtra("EPISODE_TITLE", item.getPodcastEpisode());
                nowPlayingActivity.putExtra("PODCAST_ART", item.getPodcastImageResId());
                startActivity(nowPlayingActivity);
            }
        });


    }
}
