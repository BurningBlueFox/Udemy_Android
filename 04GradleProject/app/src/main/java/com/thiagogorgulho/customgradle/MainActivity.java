package com.thiagogorgulho.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowToast(View view){
        switch (view.getId()){
            case R.id.btn_error:
                Toasty.error(this, "Error", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_success:
                Toasty.success(this, "Success", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_info:
                Toasty.info(this, "Info", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_warning:
                Toasty.warning(this, "Warning", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_image:
                Toasty.normal(this, "Image", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_download)).show();
                break;

        }
    }
}
