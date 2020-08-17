package com.example.affixpaws;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Follower_Search_Adapter extends BaseAdapter {

    Context context;
    int profile_pictures_m[];
    String profile_names [];
    String user_names[];
    LayoutInflater inflater;


    public Follower_Search_Adapter(Context applicationContext, int[] profile_pictures_m, String[] user_names, String[] profile_names){
        this.context = applicationContext;
        this.profile_pictures_m = profile_pictures_m;
        this.profile_names = profile_names;
        this.user_names = user_names;
        inflater = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return profile_pictures_m.length;
    }

    public Object getItem ( int i){
        return null;
    }

    @Override
    public long getItemId ( int i){
        return 0;
    }

    @Override
    public View getView (int i, View view, ViewGroup viewGroup){
        view = inflater.inflate(R.layout.friend_search_cardview_m,null); //inflateLayout
        ImageView icon = (ImageView) view.findViewById(R.id.search_prof_pic_m); //get reference of imageview
        TextView username = (TextView) view.findViewById(R.id.search_profilename_m);
        TextView profilename = (TextView) view.findViewById(R.id.search_username_m);
        icon.setImageResource(profile_pictures_m[i]); //set logo images
        profilename.setText(profile_names[i]);
        username.setText(user_names[i]);
        return view;
    }
}


