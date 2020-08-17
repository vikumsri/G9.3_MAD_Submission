package com.example.affixpaws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridView_Friend_Search extends AppCompatActivity {
    GridView friend_search_Grid;
    int profile_pictures_m[] = {R.drawable.sample_img_for_search_m, R.drawable.user_pic_1_m,R.drawable.user_pic_2_m,R.drawable.user_pic_3_m,R.drawable.user_pic_4_m,R.drawable.user_pic_5_m,R.drawable.user_pic_6_m};
    String user_names[] ={"@bingo17","@sir_george_biscuit","@tutu_the_dog","@chocolate","@skippy02","@rexyboy","@iam_speedy"};
    String profile_names[] ={"Bingo","George","Tutu","Chocolate","Skippy","Rex","Speedy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_search_m);

    friend_search_Grid = (GridView) findViewById(R.id.friend_search_gridview_m);

    //Create a new object from CustomerAdapter to set the adapter to the gridView
    Friend_Search_Adapter customAdapter = new Friend_Search_Adapter(getApplicationContext(),profile_pictures_m,profile_names,user_names);
        friend_search_Grid .setAdapter(customAdapter);


}
}