package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);


        Intent intent = getIntent(); //보내는 인텐트 받기
        String str = intent.getStringExtra("str"); //String str에 받아서 사용할 예정

        tv_sub.setText(str); //textView에 intent로 받은 값을 저자한 str을 표시함
    }
}