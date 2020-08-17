package com.example.affixpaws;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.widget.GridView;

public class GridView_Notification_Activity extends AppCompatActivity {
    GridView notification_Grid;
    int profile_pictures_m[] = {R.drawable.user_pic_6_m, R.drawable.user_pic_4_m, R.drawable.user_pic_13_m, R.drawable.user_pic_12_m, R.drawable.user_pic_10_m, R.drawable.user_pic_9_m, R.drawable.user_pic_8_m, R.drawable.user_pic_11_m};
    String profile_names[] = {"Speedy", "Rex", "Hedwig", "Spike", "Cuddles", "Polly", "Babe"};
    String actions[] = {"Liked", "Liked", "Commented", "Liked", "Liked", "Liked", "Commented"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_panel_m);

        notification_Grid = (GridView) findViewById(R.id.notif_grid_m);

        //Create a new object from CustomerAdapter to set the adapter to the gridView
        Notification_Adapter notifAdapter = new Notification_Adapter(getApplicationContext(), profile_pictures_m, profile_names, actions);
        notification_Grid.setAdapter(notifAdapter);


    }
}
