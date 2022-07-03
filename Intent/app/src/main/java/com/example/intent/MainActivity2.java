package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); // 어디서 날아오는 데이터가 있으면 그걸 인텐트로 받겠다는 뜻
        String str = intent.getStringExtra("str"); //날릴때랑 날아올때 이름은 동일하게

        tv_sub.setText(str);//str 데이터를 넣겠다

    }
}