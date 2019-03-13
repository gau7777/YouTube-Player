package com.example.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import android.widget.TextView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;

public class PunjabiSongs extends AppCompatActivity {
     ListView listview;
     ListViewAdapter adapter;
     String[] title;
     ArrayList<model> arrayList = new ArrayList<model>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabi_songs);

        title = new String[] {"Laung Laachi", "Lahore", "High Rated Gabru", "Prada", "Daru Badnaam", "Nikle Current", "Made In India",
                             "Naah", "3 Peg", "Kya Baat Hai", "Na Ja", "Suit", "Ishare Tere", "Diamond", "Badnaam", "Backbone", "Khaab",
                              "Illegal Weapon", "Sakhiyaan", "Nawab", "Bapu Zamidar", "Leambadgini", "Mil Lo Na", "Gaal Ni Kadni", "Jaani Tera Naa", "Qismat"};

        listview = (ListView)findViewById(R.id.listview);

        for(int i = 0; i<title.length; i++){
            model Model = new model(title[i]);

            //bind all strings in array
            arrayList.add(Model);
        }

        //pass results to ListViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to listview

        listview.setAdapter(adapter);
           }
    // to link menu.xml to the activity in which we want to add search bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(TextUtils.isEmpty(newText)){
                    adapter.filter("");
                    listview.clearTextFilter();
                }
                else{
                    adapter.filter(newText);
                }
                return true;
            }
        });

        return true;
    }


}
