package com.example.android.podcats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class StuffMewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracklist_list);

        //Create a list of tracks
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_12), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_11), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_10), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_9), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_8), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_7), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_6), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_5), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_4), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_3), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_2), R.drawable.smsk));
        tracks.add(new Track(getString(R.string.smsk_title_name), getString(R.string.smsk_ep_1), R.drawable.smsk));

        final TrackAdapter adapter = new TrackAdapter(this, tracks);

        //Uses tracklist.xml as template for ListView
        ListView listView = (ListView) findViewById(R.id.tracklist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Track item = (Track) adapter.getItem(i);

                //Sets intent for nowPlayingActivity.
                Intent nowPlayingActivity = new Intent(StuffMewActivity.this, NowPlaying.class);
                nowPlayingActivity.putExtra("PODCAST_TITLE", item.getPodcastTitle());
                nowPlayingActivity.putExtra("EPISODE_TITLE", item.getPodcastEpisode());
                nowPlayingActivity.putExtra("PODCAST_ART", item.getPodcastImageResId());
                startActivity(nowPlayingActivity);
            }
        });


    }
}
