package com.example.youtubeplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
     Context mContext;
     LayoutInflater inflater;
     List<model> modellist;
     ArrayList<model> arraylist;

    public ListViewAdapter(Context Context, List<model> modellist) {
        mContext = Context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<model>();
        this.arraylist.addAll(modellist);
    }

    public class ViewHolder{
        TextView SongTitle;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int position) {
        return modellist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            holder.SongTitle = view.findViewById(R.id.Song1);

            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)view.getTag();
        }
         //set results into textview
        holder.SongTitle.setText(modellist.get(position).getTitle());

        //listview items clicks

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(modellist.get(position).getTitle().equals("Laung Laachi")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_1,0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Lahore")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_2, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("High Rated Gabru")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_3, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Prada")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_4, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Daru Badnaam")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_5, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Nikle Current")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_6, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Made In India")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_7, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Naah")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_8, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("3 Peg")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_9, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Kya Baat Hai")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_10, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Na Ja")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_11, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Suit")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_12, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Ishaare Tere")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_13, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Diamond")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_14, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Badnaam")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_15, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Backbone")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_16, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Khaab")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_17, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Illegal Weapon")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_18, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Sakhiyaan")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_19, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Nawab")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_20, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Bapu Zamidar")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_21, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Leambadgini")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_22, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Mil Lo Na")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_23, 0,true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Gaal Ni Kadni")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_24, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Jaani Tera Naa")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_25, 0, true, false);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("Qismat")){
                    Intent intent = (Intent) YouTubeStandalonePlayer.createVideoIntent((Activity) mContext, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID_26, 0, true, false);
                    mContext.startActivity(intent);
                }


            }
        });
        return view;
    }

    //filter
    public void filter(String charTxt){
        charTxt = charTxt.toLowerCase(Locale.getDefault());
        modellist.clear();
        if(charTxt.length() == 0){
            modellist.addAll(arraylist);
        }
        else{
            for(model Model : arraylist){
                if(Model.getTitle().toLowerCase(Locale.getDefault()).contains(charTxt)){
                    modellist.add(Model);
                }
            }
        }

        notifyDataSetChanged();
    }
}
