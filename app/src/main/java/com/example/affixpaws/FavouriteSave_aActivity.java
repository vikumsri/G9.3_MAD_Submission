//IT19135134
//Ashini Kulatunga

package com.example.affixpaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class FavouriteSave_aActivity extends AppCompatActivity {

    GridView gridView;

    int favourite_posts[] = {R.drawable.save_1, R.drawable.save_2,R.drawable.friend_fav2_a,R.drawable.save_4,R.drawable.save_5, R.drawable.save_14, R.drawable.save_3, R.drawable.save_6, R.drawable.save_7, R.drawable.save_8, R.drawable.save_9, R.drawable.save_10, R.drawable.save_11, R.drawable.save_12, R.drawable.save_13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_save_a);
        gridView = (GridView) findViewById(R.id.gridViewFavouriteSaves); // init GridView

        // Create an object of CustomAdapter and set Adapter to GirdView
        FriendPostsCustomAdapter friendPostsCustomAdapter = new FriendPostsCustomAdapter(getApplicationContext(), favourite_posts);
        gridView.setAdapter(friendPostsCustomAdapter);

        // implement setOnItemClickListener event on GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // set an Intent to Another Activity
                Intent intent = new Intent(FavouriteSave_aActivity.this, FriendPreviousPosts_aActivity2.class);
                intent.putExtra("image", favourite_posts[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}