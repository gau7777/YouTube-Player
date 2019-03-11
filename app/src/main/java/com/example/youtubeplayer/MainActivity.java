package com.example.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_singleVideo = (Button) findViewById(R.id.SingleVideo);
        Button submenu = (Button) findViewById(R.id.Standalone);

        btn_singleVideo.setOnClickListener(this);
        submenu.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.SingleVideo:
                intent = new Intent(this, YoutubeActivity.class);
                break;
            case R.id.Standalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
