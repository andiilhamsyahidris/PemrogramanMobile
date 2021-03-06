package com.example.pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton moveArticle = findViewById(R.id.artikel);
        ImageButton moveProfile = findViewById(R.id.profile);
        moveProfile.setOnClickListener(this);
        moveArticle.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.artikel:
                Intent moveArtikel = new Intent(MainActivity.this, ArticleActivity.class);
                startActivity(moveArtikel);
                break;
            case R.id.profile:
                Intent moveProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(moveProfile);
                break;
        }
    }
}
