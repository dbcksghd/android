package com.example.firstapp;

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


        et_test = findViewById(R.id.et_test);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() { //btn_move 버튼을 클릭했을때 나올것들
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString(); //et_test에서 받아온 것들을 문자열 형태로 변환
                Intent intent = new Intent(MainActivity.this, MainActivity2.class); //Main 액티비티에서 Main2 액티비티로 가는 인텐트라는 객체 생성
                intent.putExtra("str", str);//start Activity를 하기 전에 뭔가를 실어주는 역할
                startActivity(intent); //액티비티 이동
                }
        });




    }
}