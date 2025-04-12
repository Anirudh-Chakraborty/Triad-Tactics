package com.test.triadtacticsrockpaperscissors;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class rockpaper_scissors extends AppCompatActivity {

    private static final String TAG = "rockpaper_scissors";


    TextView scoreUser, scoreCom, Remarks;
    ImageView userChoice,compChoice;

    Random random;

    int userScore = 0;
    int botScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rockpaper_scissors2);

        scoreUser =findViewById(R.id.scoreUser);
        scoreCom = findViewById(R.id.scoreCom);
        Remarks = findViewById(R.id.Remarks);

        scoreUser.setText("00");
        scoreUser.setText("00");
        Remarks.setText("Dekhte hai");

        random = new Random();

        userChoice = findViewById(R.id.userChoice);
        compChoice = findViewById(R.id.compChoice);






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void resetButton(View view) {
        userScore =0;
        botScore = 0;
        Remarks.setText("Start kr");
        userChoice.setImageResource(R.drawable.rock);
        compChoice.setImageResource(R.drawable.rock);
        setScoreBoard(userScore,botScore);
    }

    public void rpsButtonSelect(View view) {

        int userSelection = Integer.parseInt(view.getTag().toString());
        Log.i(TAG, "rpsButtonSelect: " + userSelection);
        matchGame(userSelection);
    }

    private void matchGame(int userSelection){
    int low = 0;
    int high = 3;


    int compInput = random.nextInt(high);

        if(userSelection == compInput){
            //tie Statement
           Remarks.setText("Tie Ho gaya broo");
        }else if ((userSelection == 0 && compInput ==2)
                ||(userSelection == 1 && compInput ==0)
                ||(userSelection == 2 && compInput ==1))
        {
            Remarks.setText("You Won bro");
            userScore++;
        }else{
            Remarks.setText("Bot jeet gaya");
            botScore++;
        }

        switch (userSelection){
            case 0:
                userChoice.setImageResource(R.drawable.rock);
                break;
            case 1:
                userChoice.setImageResource(R.drawable.paper);
                break;
            case 2:
                userChoice.setImageResource(R.drawable.scissors);
                break;
        }

        switch (compInput){
            case 0:
                compChoice.setImageResource(R.drawable.rock);
                break;
            case 1:
                compChoice.setImageResource(R.drawable.paper);
                break;
            case 2:
                compChoice.setImageResource(R.drawable.scissors);
                break;
        }

        setScoreBoard(userScore,botScore);
    }
    //Scoreboard
    private void setScoreBoard(int userScore, int botScore){
        scoreUser.setText(String.valueOf(userScore));
        scoreCom.setText(String.valueOf(botScore));
    }


}