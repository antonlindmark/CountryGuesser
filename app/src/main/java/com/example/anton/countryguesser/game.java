package com.example.anton.countryguesser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class game extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int regionchoice = getIntent().getIntExtra("regionChoice",0);
        if(regionchoice==0)
            System.out.println("Start game with Europe");
        else if(regionchoice==1)
            System.out.println("Start game with Africa");
        else if(regionchoice==2)
            System.out.println("Start game with TESTING");
    }
}
