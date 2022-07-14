package com.example.screen_sliding_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        btn= findViewById(R.id.back4);
        btn.setOnClickListener(this::onBackClick);
    }

    private void onBackClick(View view) {
        startActivity(new Intent(this, Activity1.class));
        overridePendingTransition(R.anim.zoom_out,R.anim.zoom_in);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.zoom_out,R.anim.zoom_in);
    }
}