package com.example.affixpaws;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedAdapter_v extends RecyclerView.Adapter<FeedAdapter_v.feedViewHolder>{

    ArrayList<FeedData_v> postList;
    public static class feedViewHolder extends RecyclerView.ViewHolder {
        public ImageView profileImage;
        public ImageView postImage;
        public TextView userName;
        public TextView caption;
        public TextView likes;
        public TextView comments;
        public TextView favorites;

        public feedViewHolder(View itemView) {
            super(itemView);

            postImage = itemView.findViewById(R.id.postImage);
            profileImage = itemView.findViewById(R.id.profile_photo);
             userName = itemView.findViewById(R.id.username);
            caption = itemView.findViewById(R.id.caption);
            likes = itemView.findViewById(R.id.likes);
            comments = itemView.findViewById(R.id.comments);
            favorites = itemView.findViewById(R.id.favorite);
        }

    }

    public FeedAdapter_v(ArrayList<FeedData_v> postList){
        this.postList = postList;

    }

    @NonNull
    @Override
    public feedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_view_post_v,parent,false);
        feedViewHolder viewHolder = new feedViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull feedViewHolder holder, int position) {
        FeedData_v postdata = postList.get(position);
        holder.profileImage.setImageResource(postdata.getProfileImage());
        holder.postImage.setImageResource(postdata.getPostImage());
        holder.userName.setText(postdata.getUserName());
        holder.caption.setText(postdata.getCaption());
        holder.likes.setText(postdata.getLikes());
        holder.comments.setText(postdata.getComments());
        holder.favorites.setText(postdata.getFavorites());


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }



}
