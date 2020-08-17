package com.example.affixpaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviousPostsActivity extends AppCompatActivity {

    GridView gridView;

    int logos[] = {R.drawable.post_1, R.drawable.post_2,R.drawable.post_3,R.drawable.post_4,R.drawable.post_5,R.drawable.post_6,R.drawable.post_7,R.drawable.post_8,R.drawable.post_9,R.drawable.post_10, R.drawable.post_2,R.drawable.post_3,R.drawable.post_4,R.drawable.post_5,R.drawable.post_6,R.drawable.post_7,R.drawable.post_8,R.drawable.post_9, R.drawable.post_10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_posts);
        gridView = (GridView) findViewById(R.id.gridViewPosts); // init GridView

        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        gridView.setAdapter(customAdapter);

        // implement setOnItemClickListener event on GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // set an Intent to Another Activity
                Intent intent = new Intent(PreviousPostsActivity.this, PreviousPostsActivity2.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}