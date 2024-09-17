package com.javaapp.recipesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //get the id of the view recipe btn
        Button button=(Button) findViewById(R.id.btnRecipe);
      //adding an event for clicking the btnRecipe aka recipe btn
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //new Intent(MainActivity.this, Recipe.class): Here, you're creating a new Intent object. The Intent is used to specify which activity you want to start and possibly pass data between the activities.
                //MainActivity.this: The first argument specifies the context from which the activity is being started. In this case, it's started from the MainActivity. The this keyword refers to the current instance of the MainActivity class.
                //Recipe.class: The second argument is the target activity class that you want to start. In this case, it's the Recipe activity class.
                startActivity(new Intent(MainActivity.this, Recipe.class));
            }
        });
    }
}