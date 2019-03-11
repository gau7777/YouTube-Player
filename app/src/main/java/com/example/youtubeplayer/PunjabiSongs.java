package com.example.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class PunjabiSongs extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabi_songs);

        TextView txt1 = (TextView) findViewById(R.id.Song1);
        TextView txt2 = (TextView) findViewById(R.id.Song2);
        TextView txt3 = (TextView) findViewById(R.id.Song3);
        TextView txt4 = (TextView) findViewById(R.id.Song4);
        TextView txt5 = (TextView) findViewById(R.id.Song5);
        TextView txt6 = (TextView) findViewById(R.id.Song6);
        TextView txt7 = (TextView) findViewById(R.id.Song7);
        TextView txt8 = (TextView) findViewById(R.id.Song8);
        TextView txt9 = (TextView) findViewById(R.id.Song9);
        TextView txt10 = (TextView) findViewById(R.id.Song10);
        TextView txt11 = (TextView) findViewById(R.id.Song11);
        TextView txt12 = (TextView) findViewById(R.id.Song12);
        TextView txt13 = (TextView) findViewById(R.id.Song13);
        TextView txt14 = (TextView) findViewById(R.id.Song14);
        TextView txt15 = (TextView) findViewById(R.id.Song15);
        TextView txt16 = (TextView) findViewById(R.id.Song16);
        TextView txt17 = (TextView) findViewById(R.id.Song17);
        TextView txt18 = (TextView) findViewById(R.id.Song18);
        TextView txt19 = (TextView) findViewById(R.id.Song19);
        TextView txt20 = (TextView) findViewById(R.id.Song20);
        TextView txt21 = (TextView) findViewById(R.id.Song21);
        TextView txt22 = (TextView) findViewById(R.id.Song22);
        TextView txt23 = (TextView) findViewById(R.id.Song23);
        TextView txt24 = (TextView) findViewById(R.id.Song24);
        TextView txt25 = (TextView) findViewById(R.id.Song25);
        TextView txt26 = (TextView) findViewById(R.id.Song26);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt7.setOnClickListener(this);
        txt8.setOnClickListener(this);
        txt9.setOnClickListener(this);
        txt10.setOnClickListener(this);
        txt11.setOnClickListener(this);
        txt12.setOnClickListener(this);
        txt13.setOnClickListener(this);
        txt14.setOnClickListener(this);
        txt15.setOnClickListener(this);
        txt16.setOnClickListener(this);
        txt17.setOnClickListener(this);
        txt18.setOnClickListener(this);
        txt19.setOnClickListener(this);
        txt20.setOnClickListener(this);
        txt21.setOnClickListener(this);
        txt22.setOnClickListener(this);
        txt23.setOnClickListener(this);
        txt24.setOnClickListener(this);
        txt25.setOnClickListener(this);
        txt26.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.Song1:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_1,0, true, false);
                break;

            case R.id.Song2:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_2,0, true, false);
                break;

            case R.id.Song3:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_3,0, true, false);
                break;

            case R.id.Song4:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_4,0, true, false);
                break;

            case R.id.Song5:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_5,0, true, false);
                break;

            case R.id.Song6:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_6,0, true, false);
                break;

            case R.id.Song7:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_7,0, true, false);
                break;

            case R.id.Song8:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_8,0, true, false);
                break;

            case R.id.Song9:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_9,0, true, false);
                break;

            case R.id.Song10:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_10,0, true, false);
                break;

            case R.id.Song11:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_11,0, true, false);
                break;

            case R.id.Song12:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_12,0, true, false);
                break;

            case R.id.Song13:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_13,0, true, false);
                break;

            case R.id.Song14:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_14,0, true, false);
                break;

            case R.id.Song15:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_15,0, true, false);
                break;

            case R.id.Song16:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_16,0, true, false);
                break;

            case R.id.Song17:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_17,0, true, false);
                break;

            case R.id.Song18:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_18,0, true, false);
                break;

            case R.id.Song19:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_19,0, true, false);
                break;

            case R.id.Song20:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_20,0, true, false);
                break;

            case R.id.Song21:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_21,0, true, false);
                break;

            case R.id.Song22:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_22,0, true, false);
                break;

            case R.id.Song23:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_23,0, true, false);
                break;

            case R.id.Song24:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_24,0, true, false);
                break;

            case R.id.Song25:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_25,0, true, false);
                break;

            case R.id.Song26:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_26,0, true, false);
                break;

            default:
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
