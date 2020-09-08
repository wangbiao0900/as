package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import bean.Bean;
import bean.CpContentBean;
import bean.PayContentBean;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView tx= (TextView)findViewById(R.id.tx);
        findViewById(R.id.buttons).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = new Gson().toJson(new Bean(1, new CpContentBean("cx", "x", "x"), new PayContentBean("x", "x", 0, "x", "b", "p", "x")));
                tx.setText(s);
                Log.d("111",s);
            }
        });
    }
}