package com.example.sahaj.twistercool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Twister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twister);
        final TextView Colors = (TextView) findViewById(R.id.TheColor);
        final TextView Armleg  = (TextView) findViewById(R.id.Armleg);
        Button Submit = (Button) findViewById(R.id.Ask);
        Colors.setTextSize(15);
        Armleg.setTextSize(15);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] Board = new String[4];
                Board[0] = "Left Foot";
                Board[1] = "Right Hand";
                Board[2] = "Right Foot";
                Board[3] = "Left Hand";
                String[] Color = new String[6];
                Color[0] = "Orange";
                Color[1] = "Green";
                Color[2] = "White";
                Color[3] = "Blue";
                Color[4] = "Black";
                Color[5] = "Red";
                int col = (int)Math.ceil(Math.random()*5);
                int boar = (int) Math.ceil(Math.random()*3);
                Colors.setText(Color[col]);
                Armleg.setText(Board[boar]);
            }
        });

    }
}
