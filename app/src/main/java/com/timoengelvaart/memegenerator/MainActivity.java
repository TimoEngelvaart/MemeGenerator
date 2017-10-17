package com.timoengelvaart.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.timoengelvaart.memegenerator.R.id.image_meme;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //randomButton creation
        Button randomButton;
        randomButton = (Button) findViewById(R.id.randomButtom);

        //Memes creation
        final ImageView meme = (ImageView) findViewById(image_meme);

        //Array containing memes
        final int[] randomArray = {R.drawable.meme1,
                R.drawable.meme2,
                R.drawable.meme3,
                R.drawable.meme4,
                R.drawable.meme5,
                R.drawable.meme6
        };


        //randomButton action at click
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MemeGenerator", "The button has been pressed");

                //object & array creation
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("MemeGenerator", "The random number is " + number);

                meme.setImageResource(randomArray[number]);

            }
        });



    }
}
