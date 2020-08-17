package com.example.affixpaws;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ChatList_s extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter chatAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_chat_list_s);
        ArrayList<ChatListData>arrayList=new ArrayList<>();

        arrayList.add(new ChatListData(R.drawable.drawble_snow_ball_s,"Snow Ball","Hello"));
        arrayList.add(new ChatListData(R.drawable.rocky_s,"Snowy","How are you"));

        recyclerView = findViewById(R.id.chat_list_recycle_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        chatAdapter = new Recycle_view_chatlist_Adapter_s(arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chatAdapter);
    }

    }
