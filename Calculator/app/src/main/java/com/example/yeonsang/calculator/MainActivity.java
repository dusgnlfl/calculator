package com.example.yeonsang.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView value1;
    TextView value2;
    TextView sign;
    TextView res;

    int flag=1;
    int num1;
    int num2;
    int finalnum;
    double finalnum2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1=(TextView) findViewById(R.id.firstvalue);
        value2=(TextView) findViewById(R.id.secondvalue);
        sign=(TextView) findViewById(R.id.sign);
        res=(TextView) findViewById(R.id.result);
    }
    public void numBtnExecute(int num) {
        if(flag==1) {
            value1.setText(Integer.toString(num));
            flag=2;
            num1=num;
        }
        else if(flag==2) {
            value2.setText(Integer.toString(num));
            flag=1;
            num2=num;
        }
    }

    public void signBtnExecute(String sym) {
        sign.setText(sym);
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                numBtnExecute(1);
                break;
            case R.id.two:
                numBtnExecute(2);
                break;
            case R.id.three:
                numBtnExecute(3);
                break;
            case R.id.four:
                numBtnExecute(4);
                break;
            case R.id.five:
                numBtnExecute(5);
                break;
            case R.id.six:
                numBtnExecute(6);
                break;
            case R.id.seven:
                numBtnExecute(7);
                break;
            case R.id.eight:
                numBtnExecute(8);
                break;
            case R.id.nine:
                numBtnExecute(9);
                break;
            case R.id.zero:
                numBtnExecute(0);
                break;
            case R.id.plus:
                signBtnExecute("+");
                break;
            case R.id.minus:
                signBtnExecute("-");
                break;
            case R.id.mul:
                signBtnExecute("*");
                break;
            case R.id.div:
                signBtnExecute("/");
                break;
            case R.id.account:
                break;
            case R.id.reset:
                value1.setText("");
                value2.setText("");
                sign.setText("");
                res.setText("");
                break;
        }
    }
}