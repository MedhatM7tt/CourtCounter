package com.medhatmhtt.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    int scoreA,scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        scoreA=0;scoreB=0;
        setContentView(R.layout.activity_main);
    }
    public void addOne(View view){
        Button clicked=(Button) view;
        if(clicked.getId()==findViewById(R.id.addOneAButton).getId()){
            scoreA++;
            changeA(scoreA);
        }
        else if(clicked.getId()==findViewById(R.id.addOneBButton).getId()){
            scoreB++;
            changeB(scoreB);
        }
    }
    public void addTwo(View view){
        Button clicked=(Button) view;
        if(clicked.getId()==findViewById(R.id.addTwoAButton).getId()){
            scoreA=scoreA+2;
            changeA(scoreA);
        }
        else if(clicked.getId()==findViewById(R.id.addTwoBButton).getId()){
            scoreB=scoreB+2;
            changeB(scoreB);
        }
    }
    public void addThree(View view){
        Button clicked=(Button) view;
        if(clicked.getId()==findViewById(R.id.addThreeAButton).getId()){
            scoreA=scoreA+3;
            changeA(scoreA);
        }
        else if(clicked.getId()==findViewById(R.id.addThreeBButton).getId()){
            scoreB=scoreB+3;
            changeB(scoreB);
        }
    }

    private void changeA(int newScoreA){
        TextView AScore=(TextView) findViewById(R.id.TeamAScore);
        AScore.setText(""+newScoreA);
    }

    private void changeB(int newScoreB) {
        TextView BScore = (TextView) findViewById(R.id.TeamBScore);
        BScore.setText("" + newScoreB);
    }
}
