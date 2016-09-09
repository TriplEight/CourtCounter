package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantityA = 0;
    int quantityB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increase3 (View view) {
        quantityA = quantityA + 3;
        displayForTeamA(quantityA);
    }

    public void increase2 (View view) {
        quantityA = quantityA + 2;
        displayForTeamA(quantityA);
    }

    public void increase1 (View view) {
        quantityA = quantityA + 1;
        displayForTeamA(quantityA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increaseB3 (View view) {
        quantityB = quantityB + 3;
        displayForTeamB(quantityB);
    }

    public void increaseB2 (View view) {
        quantityB = quantityB + 2;
        displayForTeamB(quantityB);
    }

    public void increaseB1 (View view) {
        quantityB = quantityB + 1;
        displayForTeamB(quantityB);
    }



    public void rezet (View view) {
        quantityA = 0;
        displayForTeamA(quantityA);
        quantityB = 0;
        displayForTeamB(quantityB);
    }
}
