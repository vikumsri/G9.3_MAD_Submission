package com.example.affixpaws;

import androidx.recyclerview.widget.RecyclerView;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycle_view_chatlist_Adapter_s extends RecyclerView.Adapter<Recycle_view_chatlist_Adapter_s.chatviewholder> {
    public ArrayList<ChatListData> arraylist;

    public static class chatviewholder extends RecyclerView.ViewHolder{
        public ImageView chatImage;
        public TextView name;
        public TextView message;


        public chatviewholder(@NonNull View itemView) {
            super(itemView);
            chatImage = itemView.findViewById(R.id.user_pro_pic);
            name=itemView.findViewById(R.id.username);
            message=itemView.findViewById(R.id.lastMessage);

        }
    }

    public Recycle_view_chatlist_Adapter_s(ArrayList<ChatListData> arrayList){
        this.arraylist=arrayList;
    }

    @NonNull
    @Override
    public Recycle_view_chatlist_Adapter_s.chatviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list,parent,false);
        chatviewholder ch=new chatviewholder(v);
        return  ch;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycle_view_chatlist_Adapter_s.chatviewholder holder, int position) {
        ChatListData dataitem=arraylist.get(position);
        holder.chatImage.setImageResource(dataitem.getChatImage());
        holder.name.setText(dataitem.getName());
        holder.message.setText(dataitem.getMessage());


    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }
}
