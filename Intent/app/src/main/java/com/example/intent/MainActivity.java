package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_test = findViewById(R.id.et_test); //editText 아이디 찾기ㄴㅁㅇ

        btn_move = findViewById(R.id.btn_move); //button 아이디 찾기
        btn_move.setOnClickListener(new View.OnClickListener() { //버튼을 눌렀을때
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString(); //str에 editText에 적은 문장을 문자형으로 저장
                Intent intent = new Intent(MainActivity.this, SubActivity.class);//(현재 액티비티, 보낼 클래스)
                intent.putExtra("str", str); //putExtra("key", value);
                startActivity(intent); //액티비티를 이동해주는 구문
            }
        });
    }
}

//메인액티비티에서 글을 적음->이동버튼 누름->intent에 의해서 액티비티로 이동, putextra에 의해서 적은 내용을 인텐트에 넣어서 이동->
//서브액티비티에 도착->보낸 글을 getIntent에서 받음->string 형으로 변환->setText로 보임

