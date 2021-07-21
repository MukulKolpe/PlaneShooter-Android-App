package com.example.planeshooter;
import android.app.Activity;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class GameOver extends Activity{

    TextView tvScore, tvPersonalBest;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        int score=getIntent().getExtras().getInt("score");
        SharedPreferences pref= getSharedPreferences("MyPref",0);
int scoreSP=pref.getInt("scoreSP",0);
SharedPreferences.Editor editor=pref.edit();
if(score > scoreSP){
    scoreSP=score;
    editor.putInt("scoreSP",scoreSP);
    editor.commit();

}
tvScore=(TextView) findViewById(R.id.tvScore);
tvPersonalBest=(TextView) findViewById(R.id.tvPersonalBest);
tvScore.setText(""+score);
tvPersonalBest.setText(""+scoreSP);
    }
    public void restart(View view){
        Intent intent= new Intent(GameOver.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void exit(View view){
        finish();

    }
}
