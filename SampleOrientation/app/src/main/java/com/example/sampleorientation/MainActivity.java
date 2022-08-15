package com.example.sampleorientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast("onCreate 호출됨");
        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = editText.getText().toString(); //버튼을 클릭했을때 editText에 입력한 값을 name 변수에 저장
                showToast("입력된 값을 변수에 저장했습니다 : "+ name);
            }
        });

        if (savedInstanceState != null){ //만약 이 화면이 초기화되었다면(화면이 가로나 세로로 바뀌었다면)
            name = savedInstanceState.getString("name"); //name 변수의 값을 복원
            showToast("값을 복원했습니다 : " + name); // 방향이 바뀔때는 액티비티가 메모리에서 없어졌다가 새로 만들어지기 때문에 값이 사라짐
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("name", name); //name 변수의 값 저장
    }

    public void showToast(String data){
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart () {
        super.onStart();

        showToast("onStart 호출됨");

   }

    @Override
    protected void onStop () {
        super.onStop();

        showToast("onStop 호출됨");
    }


    @Override
    protected void onDestroy () {
        super.onDestroy();

        showToast("onDestroy 호출됨");
    }
}