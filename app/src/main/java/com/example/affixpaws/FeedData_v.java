package com.example.affixpaws;

import android.widget.ImageView;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class FeedData_v  extends AppCompatActivity {
    public int profileImage;
    public int postImage;
    public String userName;
    public String caption;
    public String likes;
    public String comments;
    public String favorites;


    public FeedData_v(int postImage, int profileImage, String userName, String caption, String likes, String comments, String favorites) {

        this.postImage = postImage;
        this.profileImage = profileImage;
        this.userName = userName;
        this.caption = caption;
        this.likes = likes;
        this.comments = comments;
        this.favorites = favorites;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public int getPostImage() {
        return postImage;
    }

    public String getUserName() {
        return userName;
    }

    public String getCaption() {
        return caption;
    }

    public String getLikes() {
        return likes;
    }

    public String getComments() {
        return comments;
    }

    public String getFavorites() {
        return favorites;
    }

}
