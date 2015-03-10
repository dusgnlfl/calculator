package com.example.yeonsang.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/*
계산기의 전체적인 모양은 사용자가 누르는 숫자를 보여주는 두 줄의 텍스트 뷰와 연산기호를 보여주는
한줄의 텍스트뷰로 시작한다. 그 아래로 16개의 각 버튼이 있고 마지막 제일 아래 줄에 결과를 보여주는
텍스트 뷰가 있다.
 */
public class MainActivity extends Activity {

    TextView value1; //두 줄의 숫자를 보여주는 텍스트 뷰
    TextView value2;
    TextView sign; //연산기호를 보여주는 텍스트 뷰
    TextView res; //계산결과를 보여주는 텍스트 뷰

    int flag=1; //이 변수의 값에따라 먼저 누른 버튼은 첫째줄로 나중은 둘째줄로 하기위한 변수
    int num1; //두 숫자를 저장할 변수
    int num2;
    double finalnum; //숫자의 연산 결과를 double형으로 선언

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1=(TextView) findViewById(R.id.firstvalue); //각 텍스트 뷰의 아이디를 찾아서 지정
        value2=(TextView) findViewById(R.id.secondvalue);
        sign=(TextView) findViewById(R.id.sign);
        res=(TextView) findViewById(R.id.result);
    }
    /*
    숫자 버튼을 눌렀을 경우에 실행하는 함수
    flag에 따라서 첫째 둘째 줄에 숫자가 나오며 누른 숫자를 저장시킨다.
     */
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
    /*
    연산기호를 눌렀을 경우의 함수
    텍스트뷰에 출력한다음 계산결과를 결과 변수에 저장한다.
     */
    public void signBtnExecute(String sym) {
        sign.setText(sym);
        if(sym=="+")
            finalnum=num1+num2;
        else if(sym=="-")
            finalnum=num1-num2;
        else if(sym=="*")
            finalnum=num1*num2;
        else if(sym=="/")
            finalnum=num1/num2;
    }
    /*
    버튼 클릭 부분이며 숫자 10개와 연산기호 4개 그리고 리셋버튼과 계산 버튼을 나뉜다.
     */
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
                res.setText(Double.toString(finalnum));
                break;
            case R.id.reset: //리셋버튼이며 각 줄을 초기화시킨다.
                value1.setText("");
                value2.setText("");
                sign.setText("");
                res.setText("");
                break;
        }
    }
}