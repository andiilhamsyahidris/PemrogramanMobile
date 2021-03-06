package com.example.pemrogramanmobile;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Artikel {
    private Context contextArtikel;

    Artikel(Context context) {
        this.contextArtikel = context;
    }
    List<String> readLine() {
        List<String> lines = new ArrayList<>();
        AssetManager asset = contextArtikel.getAssets();

        try {
            InputStream inputText = asset.open(ArticleActivity.mPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputText));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
