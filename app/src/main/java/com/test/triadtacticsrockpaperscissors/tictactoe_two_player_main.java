package com.test.triadtacticsrockpaperscissors;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tictactoe_two_player_main extends AppCompatActivity {

    public void playerTap(View view) {
        // 0 - X
        // 1 - O
        int activeplayer = 0;
        int [] state = {2,2,2,2,2,2,2,2,2};

        //0 - X
        // 1- O
        // 2 - Blank Space

        int [][] winPositions = {{0,1,2},{3,4,5},{6,7,8},//horizontal
                {0,3,6},{1,4,7},{2,5,8},//vertical
                {0,4,8},{2,4,6}};//diagonal

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tictactoe_two_player_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
//almost done half reamins

}