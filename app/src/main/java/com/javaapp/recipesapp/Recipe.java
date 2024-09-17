package com.javaapp.recipesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);


        Button goBackBtn = findViewById(R.id.btnGoBack);
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish(); // Close the current activity and go back
            }
        });
    }


}