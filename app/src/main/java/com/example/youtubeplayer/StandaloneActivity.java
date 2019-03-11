package com.example.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnChoice = (Button) findViewById(R.id.Choice);
        Button btnPlaylist = (Button) findViewById(R.id.Playlist);

        btnChoice.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in = null;
        switch(v.getId()){
            case R.id.Choice:
                in = new Intent(this, PunjabiSongs.class);
                break;
            case R.id.Playlist:
                in = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST_ID, 0, 0, true, false);
                break;
            default:
        }
        if(in != null){
            startActivity(in);
        }
    }
}
