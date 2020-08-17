package com.example.affixpaws;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_View_Adapter extends RecyclerView.Adapter<Recycler_View_Adapter.MViewHolder> {
    private ArrayList<Data> arraylist;
    public int count = 0;
    public static class MViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView msg;

        public MViewHolder(View itemView){
            super(itemView);
            mImageView = itemView.findViewById(R.id.message_dp);

            msg = itemView.findViewById(R.id.left_message);
        }
    }

    public Recycler_View_Adapter(ArrayList<Data> arraylist){
        this.arraylist = arraylist;

    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View x;
        MViewHolder h = null;
        MViewHolder vh = null;
        MViewHolder t = null;


            Data datai = arraylist.get(count);

            if( datai.getUser() == "Self")
            {

                 x = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_right_s,parent,false);
                t = new MViewHolder(x);
                count++;
                return t;

            }
            else if(datai.getUser() == "friend")
            {
                x = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_left_s,parent,false);
                t = new MViewHolder(x);
                count++;
                return t;

            }


        return null;


    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {
        Data dataitem = arraylist.get(position);
        holder.mImageView.setImageResource(dataitem.getImageResource());
        holder.msg.setText(dataitem.gettext1());

    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }



}