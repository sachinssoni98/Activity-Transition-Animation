package com.example.screen_sliding_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        btn1= findViewById(R.id.rightToLeft);
        btn2= findViewById(R.id.bottomToTop);
        btn3= findViewById(R.id.zoom);
        btn1.setOnClickListener(this::slideLeftRight);
        btn2.setOnClickListener(this::slideBottomTop);
        btn3.setOnClickListener(this::slideZoomInOut);


    }

    private void slideZoomInOut(View view) {
        startActivity(new Intent(this, Activity4.class));
        overridePendingTransition(R.anim.zoom_in,R.anim.zoom_out);
    }

    private void slideBottomTop(View view) {
        startActivity(new Intent(this, Activity3.class));
        overridePendingTransition(R.anim.bottom_to_center,R.anim.center_to_top);
    }

    private void slideLeftRight(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right_to_center,R.anim.center_to_left);
    }
}