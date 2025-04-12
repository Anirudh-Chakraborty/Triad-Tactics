package com.test.triadtacticsrockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageButton tictactoe_pageButton = findViewById(R.id.tictactoe_Button);
        tictactoe_pageButton.setOnClickListener(view -> {
                Intent tictacintent = new Intent(MainActivity.this, Tictactoe_Main.class);
                startActivity(tictacintent);
        });

        ImageButton versusrockpaper_Button = findViewById(R.id.rockpaper_Button);
        versusrockpaper_Button.setOnClickListener(view1 -> {
                Intent rockpaperintent = new Intent(MainActivity.this, rockpaper_scissors.class);
                startActivity(rockpaperintent);}
                    );



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}