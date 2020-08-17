package com.example.affixpaws;

import android.content.res.Resources;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
class drop_shadow extends ViewOutlineProvider {
    @Override
    public void getOutline(View view, Outline outline) {

        outline.setOval(0, 0, view.getWidth(), view.getHeight());

    }
}


