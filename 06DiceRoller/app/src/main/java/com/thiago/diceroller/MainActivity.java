package com.thiago.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickRollDice(View view){
        RollDice();
    }

    public void RollDice(){
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;

        ImageView image = (ImageView)findViewById(R.id.image_dice_1);

        switch (randomNumber){
            case 1: image.setImageResource(R.drawable.dice_1);
                break;
            case 2: image.setImageResource(R.drawable.dice_2);
                break;
            case 3: image.setImageResource(R.drawable.dice_3);
                break;
            case 4: image.setImageResource(R.drawable.dice_4);
                break;
            case 5: image.setImageResource(R.drawable.dice_5);
                break;
            case 6: image.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}
