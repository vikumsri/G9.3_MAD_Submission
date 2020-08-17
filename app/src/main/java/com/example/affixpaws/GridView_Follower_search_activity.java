package com.example.affixpaws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridView_Follower_search_activity extends AppCompatActivity {

    GridView follower_search_Grid;
    int profile_pictures_m[] = { R.drawable.user_pic_1_m,R.drawable.user_pic_2_m,R.drawable.user_pic_3_m,R.drawable.user_pic_4_m,R.drawable.user_pic_6_m};
    String user_names[] ={"@sir_george_biscuit","@tutu_the_dog","@chocolate","@skippy02","@iam_speedy"};
    String profile_names[] ={"George","Tutu","Chocolate","Skippy","Speedy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follower_search_m);

        follower_search_Grid = (GridView) findViewById(R.id.follower_search_gridview_m);

        //Create a new object from CustomerAdapter to set the adapter to the gridView
        Follower_Search_Adapter followersAdapter = new Follower_Search_Adapter(getApplicationContext(),profile_pictures_m,profile_names,user_names);
        follower_search_Grid .setAdapter(followersAdapter);


    }
}