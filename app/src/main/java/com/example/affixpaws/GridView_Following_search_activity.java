package com.example.affixpaws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridView_Following_search_activity extends AppCompatActivity {

    GridView following_search_Grid;
    int profile_pictures_m[] = { R.drawable.user_pic_8_m,R.drawable.user_pic_13_m,R.drawable.user_pic_7_m,R.drawable.user_pic_11_m};
    String user_names[] ={"@piggy_babe","@hedwig_of_hogwarts","@bugzy_loves_carrots","@squirrel_life"};
    String profile_names[] ={"Babe","Hedwig","Bugzy","Tip"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.following_search_m);

        following_search_Grid = (GridView) findViewById(R.id.following_search_gridview_m);

        //Create a new object from CustomerAdapter to set the adapter to the gridView
        Following_Search_Adapter followingAdapter = new Following_Search_Adapter(getApplicationContext(),profile_pictures_m,profile_names,user_names);
        following_search_Grid .setAdapter(followingAdapter);


    }
}