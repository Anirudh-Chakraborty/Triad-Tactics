package com.test.triadtacticsrockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tictactoe_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tictactoe_main);


        ImageButton tictactoe_bot = findViewById(R.id.versus_bot);
        tictactoe_bot.setOnClickListener(view ->{
            Intent tictac_botintent = new Intent(Tictactoe_Main.this, TicTacToe_Bot.class);
            startActivity(tictac_botintent);
        });

        ImageButton tictactoe_twoplayer = findViewById(R.id.versus_twoplayer);
        tictactoe_twoplayer.setOnClickListener(view -> {
            Intent tictac_twoplayer_intnet = new Intent(Tictactoe_Main.this, tictactoe_two_player_main.class);
            startActivity(tictac_twoplayer_intnet);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}