package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View v){
        Toast.makeText(this, "버튼이 눌림", Toast.LENGTH_SHORT).show();
    }
    public void button2(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EC%A0%95%ED%98%B8+%ED%99%94%EC%9D%B4%ED%8C%85"));
        startActivity(myIntent);
    }
    public void button3(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 010-5702-4624"));
        startActivity(myIntent);
    }

}