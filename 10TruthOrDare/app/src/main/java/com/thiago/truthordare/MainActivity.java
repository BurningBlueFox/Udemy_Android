package com.thiago.truthordare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private ImageView bottle;
    private int lastDirection = 0;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt_spin);
        bottle = (ImageView)findViewById(R.id.image_view_bottle);
    }

    public void SpinBottle(View view){

        int newDirection = random.nextInt(3600);
        float pivotX = bottle.getWidth()/2;
        float pivotY = bottle.getHeight()/2;

        Animation rotate = new RotateAnimation(lastDirection, newDirection, pivotX, pivotY);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);

        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                bt.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bt.setEnabled(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        bottle.startAnimation(rotate);
        lastDirection = newDirection;
    }
}
