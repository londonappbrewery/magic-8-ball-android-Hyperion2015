package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = (Button) findViewById(R.id.askQuestionButton);
        final ImageView magicBall = (ImageView) findViewById(R.id.image_magicBall);

        final int[] possibleAnswers = {R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndGenerator = new Random();
                int rndNumber = rndGenerator.nextInt(5);

                Log.d("(8Ball", "Broj je " + rndNumber);

                magicBall.setImageResource(possibleAnswers[rndNumber]);

            }
        });

    }
}
