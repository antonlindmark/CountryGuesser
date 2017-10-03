package com.example.anton.countryguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;


public class gameSettings extends AppCompatActivity {

    public static int regionChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_settings);


        final Button startGame = (Button) findViewById(R.id.startGame);
        final Button chooseRegion = (Button) findViewById(R.id.chooseRegion);
        final Button timeSettings = (Button) findViewById(R.id.timeSettings);


        startGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),game.class);
                intent.putExtra("regionChoice",regionChoice);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        chooseRegion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(gameSettings.this,chooseRegion);
                popupMenu.getMenuInflater().inflate(R.menu.chooseregion,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        if(item.getItemId()==R.id.europa)
                            regionChoice=0;
                        else if(item.getItemId()==R.id.afrika)
                            regionChoice=1;
                        else if(item.getItemId()==R.id.asien)
                            regionChoice=2;
                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        timeSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
