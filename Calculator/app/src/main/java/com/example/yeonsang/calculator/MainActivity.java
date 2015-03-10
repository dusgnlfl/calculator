package com.example.yeonsang.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView value1;
    TextView value2;
    TextView res;

    int flag=1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1=(TextView) findViewById(R.id.firstvalue);
        value2=(TextView) findViewById(R.id.secondvalue);
        res=(TextView) findViewById(R.id.result);
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                value1.setText("1");
                break;
            case R.id.two:
                value2.setText("2");
                break;
        }
    }
}