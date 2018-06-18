package com.example.android.soccermanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Team A global variables
    int teamAGoal = 0;
    int teamAFoul = 0;
    int teamAConner = 0;

//   Team B global variables
    int teamBGoal = 0;
    int teamBfoul = 0;
    int teamBconner = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//  Team A goals
    public void displayForTeamAG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAGoal(View view){
        teamAGoal = teamAGoal + 1;
        displayForTeamAG(teamAGoal);
    }

//    Team A fouls
    public void displayForTeamAF(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAFoul(View view){
        teamAFoul = teamAFoul + 1;
        displayForTeamAF(teamAFoul);
    }

//    Team A conners
public void displayForTeamAC(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_a_conner);
    scoreView.setText(String.valueOf(score));
    }
    public void teamAConner(View view){
        teamAConner = teamAConner + 1;
        displayForTeamAC(teamAConner);
    }


    //  Team B goals
    public void displayForTeamBG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBGoal(View view){
        teamBGoal = teamBGoal + 1;
        displayForTeamBG(teamBGoal);
    }

//    Team A fouls

    public void displayForTeamBF(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBFoul(View view){
        teamBfoul = teamBfoul + 1;
        displayForTeamBF(teamBfoul);
    }

    //    Team A conners
    public void displayForTeamBC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_conner);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBConner(View view){
        teamBconner = teamBconner + 1;
        displayForTeamBC(teamBconner);
    }
    public void resetScore(View view) {

     teamAGoal = 0;
     teamAFoul = 0;
     teamAConner = 0;
     teamBGoal = 0;
     teamBfoul = 0;
     teamBconner = 0;

    displayForTeamAG(teamAGoal);
    displayForTeamAF(teamAFoul);
    displayForTeamAC(teamAConner);
    displayForTeamBG(teamBGoal);
    displayForTeamBF(teamBfoul);
    displayForTeamBC(teamBconner);

}

}
