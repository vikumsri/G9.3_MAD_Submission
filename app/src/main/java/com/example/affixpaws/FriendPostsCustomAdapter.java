package com.example.affixpaws;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class FriendPostsCustomAdapter extends BaseAdapter {

    Context context;
    int friend_posts[];
    LayoutInflater inflter;
    public FriendPostsCustomAdapter(Context applicationContext, int[] friend_posts) {
        this.context = applicationContext;
        this.friend_posts = friend_posts;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return friend_posts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view = inflter.inflate(R.layout.activity_friend_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.iconfriend); // get the reference of ImageView
        icon.setImageResource(friend_posts[i]); // set logo images
        return view;
    }
}
