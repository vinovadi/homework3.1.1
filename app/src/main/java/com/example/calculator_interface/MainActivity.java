package com.example.calculator_interface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mOutputTxt;
    private TextView mCancelBtn;
    private TextView mChangeSignBtn;
    private TextView mPercentBtn;
    private TextView mSevenBtn;
    private TextView mEightBtn;
    private TextView mNineBtn;
    private TextView mMultiplyBtn;
    private TextView mFourBtn;
    private TextView mFiveBtn;
    private TextView mSixBtn;
    private TextView mMinusBtn;
    private TextView mOneBtn;
    private TextView mTwoBtn;
    private TextView mThreeBtn;
    private TextView mZeroBtn;
    private TextView mPointBtn;
    private TextView mEqualsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        mOutputTxt = findViewById(R.id.txtOutput);
        mCancelBtn = findViewById(R.id.btnCancel);
        mChangeSignBtn = findViewById(R.id.btnChangeSign);
        mPercentBtn = findViewById(R.id.btnPercent);
        mSevenBtn = findViewById(R.id.btn7);
        mEightBtn = findViewById(R.id.btn8);
        mNineBtn = findViewById(R.id.btn9);
        mMultiplyBtn = findViewById(R.id.btnMultiply);
        mFourBtn = findViewById(R.id.btn4);
        mFiveBtn = findViewById(R.id.btn5);
        mSixBtn = findViewById(R.id.btn6);
        mMinusBtn = findViewById(R.id.btnMinus);
        mOneBtn = findViewById(R.id.btn1);
        mTwoBtn = findViewById(R.id.btn2);
        mThreeBtn = findViewById(R.id.btn3);
        mZeroBtn = findViewById(R.id.btn0);
        mPointBtn = findViewById(R.id.btnPoint);
        mEqualsBtn = findViewById(R.id.btnEquals);
    }
}
