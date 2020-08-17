//IT19135134
//Ashini Kulatunga

package com.example.affixpaws;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class FavouritePostsCustomAdapter extends BaseAdapter {

    Context context;
    int favourite_posts[];
    LayoutInflater inflter;
    public FavouritePostsCustomAdapter(Context applicationContext, int[] favourite_posts) {
        this.context = applicationContext;
        this.favourite_posts = favourite_posts;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return favourite_posts.length;
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

        view = inflter.inflate(R.layout.activity_favourite_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.iconfavourite); // get the reference of ImageView
        icon.setImageResource(favourite_posts[i]); // set logo images
        return view;
    }
}
