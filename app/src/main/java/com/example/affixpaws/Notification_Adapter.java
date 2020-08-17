package com.example.affixpaws;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Notification_Adapter extends BaseAdapter {
    Context context;
    int profile_pictures_m[];
    String profile_names [];
    String actions[];
    LayoutInflater inflater;


    public Notification_Adapter(Context applicationContext, int[] profile_pictures_m, String[] profile_names, String[] actions){
        this.context = applicationContext;
        this.profile_pictures_m = profile_pictures_m;
        this.profile_names = profile_names;
        this.actions = actions;
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
        //view = inflater.inflate(R.layout.notification_cardview_m,null); //inflateLayout
        view = inflater.from(viewGroup.getContext()).inflate(R.layout.notification_cardview_m,viewGroup,false); //inflateLayout
        ImageView icon = (ImageView) view.findViewById(R.id.notif_prof_pic_m); //get reference of imageview
        TextView action = (TextView) view.findViewById(R.id.notif_action_m);
        TextView profilename = (TextView) view.findViewById(R.id.notif_profilename_m);
       icon.setImageResource(profile_pictures_m[i]); //set logo images
        profilename.setText(profile_names[i]);
        action.setText(actions[i]);
        return view;
    }
}
