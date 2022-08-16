package com.example.sampleorientation2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConfigurationChanged(Configuration newConfig){ //값 저장이 필요없이 화면만 바꾸고싶을땐 이렇게 하는게 더 효율적이다
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){ //가로 방향으로 전환될 때
            showToast("방향 : ORIENTATION_LANDSCAPE");
        }
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){ //세로 방향으로 전환될 때
            showToast("방향 : ORIENTATION_PORTRAIT");
        }
    }

    public void showToast(String data)
    {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}