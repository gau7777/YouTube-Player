package com.example.youtubeplayer;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    static final String GOOGLE_API_KEY = "AIzaSyBgBrReSrZvMY3ydR3xqtYD8v19Eez4mE8";
    static final String YOUTUBE_VIDEO_ID_1 = "YpkJO_GrCo0";
    static final String YOUTUBE_VIDEO_ID_2 = "dZ0fwJojhrs";
    static final String YOUTUBE_VIDEO_ID_3 = "hjWf8A0YNSE";
    static final String YOUTUBE_VIDEO_ID_4 = "bzW9fmwcmG4";
    static final String YOUTUBE_VIDEO_ID_5 = "PjTU0DmBWiU";
    static final String YOUTUBE_VIDEO_ID_6 = "uBaqgt5V0mU";
    static final String YOUTUBE_VIDEO_ID_7 = "pnMQLrS5sTE";
    static final String YOUTUBE_VIDEO_ID_8 = "8qs2dZO6wcc";
    static final String YOUTUBE_VIDEO_ID_9 = "hzTg4zPBtDU";
    static final String YOUTUBE_VIDEO_ID_10 = "G0Hx6uN2AJE";
    static final String YOUTUBE_VIDEO_ID_11 = "uQ763VvqiEM";
    static final String YOUTUBE_VIDEO_ID_12 = "Q-GOFPM01d0";
    static final String YOUTUBE_VIDEO_ID_13 = "8nGFWWJLHio";
    static final String YOUTUBE_VIDEO_ID_14 = "ggJMQHltiQc";
    static final String YOUTUBE_VIDEO_ID_15 = "pXPHSaj8qSw";
    static final String YOUTUBE_VIDEO_ID_16 = "bqGtrvcR5ls";
    static final String YOUTUBE_VIDEO_ID_17 = "2eliQ_KR8yA";
    static final String YOUTUBE_VIDEO_ID_18 = "S-ezhTXPVGU";
    static final String YOUTUBE_VIDEO_ID_19 = "H7_yY3yr-jE";
    static final String YOUTUBE_VIDEO_ID_20 = "TJyy_qz_qII";
    static final String YOUTUBE_VIDEO_ID_21 = "jOYR3k1VhUQ";
    static final String YOUTUBE_VIDEO_ID_22 = "15Sjjl_24x0";
    static final String YOUTUBE_VIDEO_ID_23 = "yFFL1we4j_Y";
    static final String YOUTUBE_VIDEO_ID_24 = "U65TWIP3mpQ";
    static final String YOUTUBE_VIDEO_ID_25 = "O3Z_LKxPJXQ";
    static final String YOUTUBE_VIDEO_ID_26 = "9xVp8m0fJSg";
    static final String YOUTUBE_PLAYLIST_ID = "PLMRKdK25AuPVu7vuwjDm2yobPuZS8hiiO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_youtube);
        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_youtube, null);
        setContentView(layout);

        YouTubePlayerView player = new YouTubePlayerView(this);
        player.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(player);

        player.initialize(GOOGLE_API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
     Toast.makeText(this, "Initialized Youtube player successfully", Toast.LENGTH_LONG).show();
     youTubePlayer.setPlaybackEventListener(playbackEventListener);
     youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
     if(!wasRestored){
         youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID_1);
     }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
     final int REQUEST_CODE_1 = 1;
     if(youTubeInitializationResult.isUserRecoverableError()){
         youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE_1).show();
     }
     else
     {
         String errorMessage = String.format("There was an error in initialising player", youTubeInitializationResult.toString());
         Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
     }
    }
    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {
            Toast.makeText(YoutubeActivity.this, "Video is playing ok", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onPaused() {
            Toast.makeText(YoutubeActivity.this, "Video has paused", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onStopped() {
            Toast.makeText(YoutubeActivity.this, "Video has stopped", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {
            Toast.makeText(YoutubeActivity.this, "Click on ad to see ad", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onVideoStarted() {
            Toast.makeText(YoutubeActivity.this, "Video has started", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onVideoEnded() {
            Toast.makeText(YoutubeActivity.this, "Video has ended", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };
}
