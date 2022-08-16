package com.example.sampleprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressDialog dialog;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar); //프로그레스바 객체 참조하여 설정하기
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() { //보여주기 버튼을 눌렸을때
            @Override
            public void onClick(View view) {
                dialog = new ProgressDialog(MainActivity.this); //프로그레스 대화상자 객체 만들고 설정하기
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                dialog.setMessage("데이터를 확인하는 중입니다.");

                dialog.show();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() { //닫기버튼을 눌렀을때
            @Override
            public void onClick(View view) {
                if (dialog != null){ //만약 dialog가 null이 아니라면
                    dialog.dismiss(); //프로그레스 대화상자 없애기
                }
            }
        });

    }
}