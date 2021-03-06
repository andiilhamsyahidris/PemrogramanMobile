package com.example.pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.List;

public class ArticleActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String mPath = "artikel/artikel.txt";
    private static final String TAG = ArticleActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        // Custom Font
        Typeface customFont = Typeface.createFromAsset(getAssets(), "font/Love Story Rough.ttf");
        TextView text = findViewById(R.id.artikel);
        text.setTypeface(customFont);

        // Read File from Artikel.java
        Artikel mArtikel = new Artikel(this);
        List<String> mLines = mArtikel.readLine();
        for (String string : mLines) {
            Log.d(TAG, string);
        }

        TextView article = findViewById(R.id.textArtikel);
        article.setText(mLines.toString().replace('[', ' '));

        ImageButton moveProfile = findViewById(R.id.moveProfile);
        ImageButton moveBeranda = findViewById(R.id.moveBeranda);
        moveProfile.setOnClickListener(this);
        moveBeranda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.moveProfile:
                Intent moveProfile = new Intent(ArticleActivity.this, ProfileActivity.class);
                startActivity(moveProfile);
                break;
            case R.id.moveBeranda:
                Intent moveBeranda = new Intent(ArticleActivity.this, MainActivity.class);
                startActivity(moveBeranda);
                break;
        }
    }
}
