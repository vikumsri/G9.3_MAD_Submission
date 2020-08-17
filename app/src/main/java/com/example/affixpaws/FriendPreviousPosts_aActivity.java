package com.example.affixpaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class FriendPreviousPosts_aActivity extends AppCompatActivity {

    GridView gridView;

    int friend_posts[] = {R.drawable.friend_collection_a, R.drawable.friend_fav1_a,R.drawable.friend_fav2_a,R.drawable.friend_fav3_a,R.drawable.snow_post_1,R.drawable.snow_post_2,R.drawable.snow_post_3,R.drawable.snow_post_4, R.drawable.snow_post_5, R.drawable.snow_post_6, R.drawable.snow_post_7, R.drawable.snow_post_8, R.drawable.snow_post_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_previous_posts_a);
        gridView = (GridView) findViewById(R.id.gridViewPostsFriend); // init GridView

        // Create an object of CustomAdapter and set Adapter to GirdView
        FriendPostsCustomAdapter friendPostsCustomAdapter = new FriendPostsCustomAdapter(getApplicationContext(), friend_posts);
        gridView.setAdapter(friendPostsCustomAdapter);

        // implement setOnItemClickListener event on GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // set an Intent to Another Activity
                Intent intent = new Intent(FriendPreviousPosts_aActivity.this, FriendPreviousPosts_aActivity2.class);
                intent.putExtra("image", friend_posts[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}