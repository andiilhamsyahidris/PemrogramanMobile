package com.example.pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Custom Font
        Typeface customFont = Typeface.createFromAsset(getAssets(), "font/Bray Notes.ttf");
        TextView text = findViewById(R.id.biodata);
        text.setTypeface(customFont);

        Button moveArtikel = findViewById(R.id.buttonArtikel);
        Button moveBeranda = findViewById(R.id.buttonBeranda);
        moveArtikel.setOnClickListener(this);
        moveBeranda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonArtikel:
                Intent moveArtikel = new Intent(ProfileActivity.this, ArticleActivity.class);
                startActivity(moveArtikel);
                break;
            case R.id.buttonBeranda:
                Intent moveBeranda = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(moveBeranda);
                break;
        }
    }
}
