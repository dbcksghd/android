package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString();//et_test에서 받아온 값을 문자열로 변환해서 str에 저장
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str);//인텐트 보내기 전에 str울 실어주는 역할
                startActivity(intent); //액티비티 이동
            }
        });
    }
}

//메인액티비티에서 글을 적음->이동버튼 누름->intent에 의해서 액티비티로 이동, putextra에 의해서 적은 내용을 인텐트에 넣어서 이동->
//서브액티비티에 도착->보낸 글을 겟 인텐트에서 받음->string 형으로 변환->setText로 보임

