package com.example.screen_sliding_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn= findViewById(R.id.back3);
        btn.setOnClickListener(this::onBackClick);
    }

    private void onBackClick(View view) {
        startActivity(new Intent(this, Activity1.class));
        overridePendingTransition(R.anim.top_to_center,R.anim.center_to_bottom);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.top_to_center,R.anim.center_to_bottom);
    }
}