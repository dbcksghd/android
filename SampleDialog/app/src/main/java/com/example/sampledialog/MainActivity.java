package com.example.sampledialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage();
            }
        });

    }

    private void showMessage(){ //대화상자를 만들기 위한 빌더 객체 생성
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("안내");//빌더 창 제목
        builder.setMessage("종료하시겠습니까?"); //빌더 창 표시메세지
        builder.setIcon(android.R.drawable.ic_dialog_alert); //빌더 창 아이콘

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() { //예 버튼을 눌렀을때 실행할 구문
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "예 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNeutralButton("취소", new DialogInterface.OnClickListener() { //취소 버튼을 눌렀을때 실행할 구문
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "취소 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() { //아니오 버튼을 눌렀을때 실행할 구문
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "아니오 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        AlertDialog dialog = builder.create(); //대화상자 객체 생성
        dialog.show(); //보여주기
    }
}