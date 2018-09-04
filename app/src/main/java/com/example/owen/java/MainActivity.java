package com.example.owen.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.button);
        Button bt2 = (Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textOne);
                tv.setText(R.string.click_view);


            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv =(TextView) findViewById(R.id.textOne);
                tv.setText(R.string.default_view);
            }
        });

    }
}
