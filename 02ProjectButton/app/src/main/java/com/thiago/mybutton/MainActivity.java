package com.thiago.mybutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.btn_heyAndroid);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test", "Button Clicked!");
                bt.setText(R.string.bt_2);
            }
        });
    }

    public void extraButtonClicked(View view){
        Log.d("Test", "Extra button clicked");
        Button myBt = (Button)view;
        myBt.setText(R.string.bt_extra);

        Context context = getApplicationContext();
        Toast.makeText(context, "Hi Toast", Toast.LENGTH_SHORT).show();
    }
}
