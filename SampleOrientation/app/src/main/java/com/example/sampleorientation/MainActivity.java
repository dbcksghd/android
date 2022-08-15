package com.example.sampleorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(String data){
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart () {
        super.onStart();

        showToast("onStart 호출함");

   }


    @Override
    protected void onStop () {
        super.onStop();

        showToast("onStop 호출함");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();

        showToast("onDestroy 호출함");
    }
}