package com.example.packathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InstructionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_instructions);

        Button home = findViewById(R.id.homeButton);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });
    }

    // TODO: Change this back to home... inbetweenturns is just for testing
    public void openHomePage() {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}