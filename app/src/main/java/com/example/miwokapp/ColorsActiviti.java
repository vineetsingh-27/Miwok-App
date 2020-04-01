package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActiviti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words =new ArrayList<>();

        words.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("mustard yellow","chokokki",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow","ṭakaakki",R.drawable.color_dusty_yellow));
        words.add(new Word("green","ṭopoppi",R.drawable.color_green));
        words.add(new Word("brown","kululli",R.drawable.color_brown));
        words.add(new Word("gray","kelelli",R.drawable.color_gray));
        words.add(new Word("black","ṭopiisә",R.drawable.color_black));
        words.add(new Word("white","chiwiiṭә",R.drawable.color_white));

        WordAdapter wordAdapter = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.colors);
        listView.setAdapter(wordAdapter);
    }
}
