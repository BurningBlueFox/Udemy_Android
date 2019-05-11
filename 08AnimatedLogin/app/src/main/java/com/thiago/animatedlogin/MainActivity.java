package com.thiago.animatedlogin;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout)findViewById(R.id.layout_main);
        SetupAnimation();
    }

    private void SetupAnimation(){
        AnimationDrawable animationDrawable = (AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
    }
    public void Login(View view){
        Toast.makeText(this, "TODO: LOGIN", Toast.LENGTH_SHORT).show();
    }
}
