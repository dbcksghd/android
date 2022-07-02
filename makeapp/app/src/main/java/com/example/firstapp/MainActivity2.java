package com.example.firstapp;

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

//메인액티비티에서 글을 적음->이동버튼 누름->intent에 의해서 액티비티로 이동, putextra에 의해서 적은 내용을 인텐트에 넣어서 이동->
//메인액티비티2에 도착->보낸 글을 겟 인텐트에서 받음->string 형으로 변환->setText로 보임