package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.id_list);

        List<String> data = new ArrayList<>(); //String 형태로 List를 넣겠다.

        //ListView랑 List를 연결해주는 다리역할 = Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);//ListView에 Adapter를 세팅

        data.add("유찬홍");//아이템 추가
        data.add("플러터");
        data.add("안드");
        adapter.notifyDataSetChanged();//이 상태를 저장하겠다
    }
}