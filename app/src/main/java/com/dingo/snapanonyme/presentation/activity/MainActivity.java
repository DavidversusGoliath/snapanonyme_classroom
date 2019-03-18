package com.dingo.snapanonyme.presentation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dingo.snapanonyme.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imageView = findViewById(R.id.main_background);
//        Glide.with(this).load(R.drawable.anonymous_hand_mask).into(imageView);
    }

    public void onExploreSnaps(View view) {
        Intent intent = new Intent(this,SnapListActivity.class);
        startActivity(intent);
    }

    public void onPublishSnap(View view) {
    }
}
