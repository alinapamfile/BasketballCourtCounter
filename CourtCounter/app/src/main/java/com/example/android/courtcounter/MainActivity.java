package com.example.android.courtcounter;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Displays the given score for Team A and changes the colors based on the score*/
    private void displayForTeamA(int score) {
        TextView teamAScoreView = (TextView) findViewById(R.id.team_a_score);
        TextView teamBScoreView = (TextView) findViewById(R.id.team_b_score);
        teamAScoreView.setText(String.valueOf(score));
        if (scoreTeamA > scoreTeamB) {
            teamAScoreView.setTextColor(-16711936);
            teamBScoreView.setTextColor(-65536);
        }
        if (scoreTeamA == scoreTeamB) {
            teamAScoreView.setTextColor(-256);
            teamBScoreView.setTextColor(-256);
        }
    }

    /* Increases Team A's score with 1 */
    public void oneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /* Increases Team A's score with 2 */
    public void twoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /* Increases Team A's score with 3 */
    public void threeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /* Displays the given score for Team B and changes the colors based on the score*/
    public void displayForTeamB(int score) {
        TextView teamAScoreView = (TextView) findViewById(R.id.team_a_score);
        TextView teamBScoreView = (TextView) findViewById(R.id.team_b_score);
        teamBScoreView.setText(String.valueOf(score));
        if (scoreTeamB > scoreTeamA) {
            teamBScoreView.setTextColor(-16711936);
            teamAScoreView.setTextColor(-65536);
        }
        if (scoreTeamB == scoreTeamA) {
            teamBScoreView.setTextColor(-256);
            teamAScoreView.setTextColor(-256);
        }
    }

    /* Increases Team B's score with 1 */
    public void oneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /* Increases Team B's score with 2 */
    public void twoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /* Increases Team B's score with 3 */
    public void threeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /* Shows the winner */
    public void winner(View view) {
        TextView winnerView = (TextView) findViewById(R.id.winner);
        if (scoreTeamA > scoreTeamB)
            winnerView.setText(R.string.winnerA);
        else if (scoreTeamB > scoreTeamA)
            winnerView.setText(R.string.winnerB);
        else
            winnerView.setText(R.string.draw);
    }

    /* Resets the score */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(R.string.score);
        scoreView.setTextColor(-1);
        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(R.string.score);
        scoreView.setTextColor(-1);
        scoreView = (TextView) findViewById(R.id.winner);
        scoreView.setText("");
    }
}
