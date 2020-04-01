package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivityi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("My name is...", "minto wuksus"));
        words.add(new Word("How are you feeling?", "tinnә oyaase'nә"));
        words.add(new Word("I'm feeling good.", "oyaaset..."));
        words.add(new Word("Are you coming", "michәksәs?"));
        words.add(new Word("Yes I'm coming.", "kuchi achit"));
        words.add(new Word("I'm coming", "әәnәs'aa?"));
        words.add(new Word("Let's go.", "hәә’ әәnәm"));
        words.add(new Word("come here.", "әәnәm"));
        words.add(new Word("Where are you going?", "yoowutis"));
        words.add(new Word("What is your name?", "әnni'nem"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.phrases);
        listView.setAdapter(wordAdapter);
    }
}
