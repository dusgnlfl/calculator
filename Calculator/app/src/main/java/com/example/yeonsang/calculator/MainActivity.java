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
                if(flag==1) {
                    value1.setText("1");
                    flag=2;
                }
                else if(flag==2) {
                    value2.setText("1");
                    flag=1;
                }
                break;
            case R.id.two:
                value2.setText("2");
                break;
            case R.id.three:
                value1.setText("1");
                break;
            case R.id.four:
                value2.setText("2");
                break;
            case R.id.five:
                value1.setText("1");
                break;
            case R.id.six:
                value2.setText("2");
                break;
            case R.id.seven:
                value1.setText("1");
                break;
            case R.id.eight:
                value2.setText("2");
                break;
            case R.id.nine:
                value1.setText("1");
                break;
            case R.id.zero:
                value2.setText("2");
                break;
            case R.id.plus:
                value1.setText("1");
                break;
            case R.id.minus:
                value2.setText("2");
                break;
            case R.id.mul:
                value1.setText("1");
                break;
            case R.id.div:
                value2.setText("2");
                break;
            case R.id.account:
                value1.setText("1");
                break;
            case R.id.reset:
                value2.setText("2");
                break;
        }
    }
}