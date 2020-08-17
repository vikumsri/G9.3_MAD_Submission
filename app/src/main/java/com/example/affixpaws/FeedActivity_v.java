package com.example.affixpaws;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedActivity_v extends AppCompatActivity {
    RecyclerView feedRecyclerView;
    RecyclerView.LayoutManager feedLayoutManager;
    RecyclerView.Adapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_activity_v);
        ArrayList<FeedData_v> postList = new ArrayList<>();

        postList.add(new FeedData_v(R.drawable.post1_v, R.drawable.prof_1_v,"Choco7","Went out with ma buddy. Best friedns forever","34K","2456","1809"));
        postList.add(new FeedData_v(R.drawable.post2_v, R.drawable.prof_2_v,"KittyCat","I am the best in the world. I am awesome","234","32","12"));
        postList.add(new FeedData_v(R.drawable.post3_v, R.drawable.prof_3_v,"ColorLab","I love color. But i can't see them","890","100","60"));
        postList.add(new FeedData_v(R.drawable.post4_v, R.drawable.prof_4_v,"Hoppy34","Hoppy is my life, Because i always hop","23K","234","56"));
        postList.add(new FeedData_v(R.drawable.post5_v, R.drawable.prof_5_v,"Rotteni","I love food. So i eat all the time","5672","345","211"));


        feedRecyclerView = findViewById(R.id.feed_recyclerview);
        feedRecyclerView.setHasFixedSize(true);
        feedLayoutManager = new LinearLayoutManager(this);
        feedAdapter = new FeedAdapter_v(postList);
        feedRecyclerView.setLayoutManager(feedLayoutManager);
        feedRecyclerView.setAdapter(feedAdapter);


    }

}