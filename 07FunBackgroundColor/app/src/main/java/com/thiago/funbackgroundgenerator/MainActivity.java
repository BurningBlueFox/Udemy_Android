package com.thiago.funbackgroundgenerator;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout) findViewById(R.id.layout_main);
        button = (ImageButton) findViewById(R.id.bt_image_refresh);
    }

    public void RefreshBackgroundColor(View view) {
        Random random = new Random();

        int colorInt = Color.argb(255,
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));

        layout.setBackgroundColor(colorInt);
    }
}
