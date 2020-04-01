package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout number,family,colors,phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=findViewById(R.id.numbers);
        family=findViewById(R.id.family);
        colors=findViewById(R.id.colors);
        phrases=findViewById(R.id.phrases);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers=new Intent(MainActivity.this,NumberActiviti.class);
                startActivity(numbers);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family=new Intent(MainActivity.this,FamilyActiviti.class);
                startActivity(family);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color=new Intent(MainActivity.this,ColorsActiviti.class);
                startActivity(color);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases=new Intent(MainActivity.this,PhrasesActivityi.class);
                startActivity(phrases);
            }
        });
    }
}
