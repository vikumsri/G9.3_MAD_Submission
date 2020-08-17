package com.example.affixpaws;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FavouriteSave_aActivity2 extends AppCompatActivity {

    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_save_a2);

        selectedImage = (ImageView) findViewById(R.id.selectedImageSave); // init a ImageView

        Intent intent = getIntent(); // get Intent which we set from Previous Activity

        selectedImage.setImageResource(intent.getIntExtra("image", 0)); // get image from Intent and set it in ImageView
    }
}