package com.example.sina.activity;

import android.os.Build;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sina.R;

import java.text.DecimalFormat;

public class CalculatorActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_result;
    private EditText editText;
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,
            btn_jia,btn_jian,btn_cheng,btn_chu,btn_dian,btn_equals,btn_clear;
    private String string;
    private double n1,n2,result;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getToolBarx().setTitle(R.string.calculator);
        init();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_calculator;
    }

    private void init() {
        tv_result=findViewById(R.id.tv_result);
        editText=findViewById(R.id.et_in);
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_jia=findViewById(R.id.btn_jia);
        btn_jian=findViewById(R.id.btn_jian);
        btn_cheng=findViewById(R.id.btn_x);
        btn_chu=findViewById(R.id.btn_ggg);
        btn_dian=findViewById(R.id.btn_dian);
        btn_equals=findViewById(R.id.btn_equal);
        btn_clear=findViewById(R.id.btn_clear);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_jia.setOnClickListener(this);
        btn_jian.setOnClickListener(this);
        btn_cheng.setOnClickListener(this);
        btn_chu.setOnClickListener(this);
        btn_dian.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)  {
        DecimalFormat MyFormat = new DecimalFormat("###.##");
        try{
            switch (v.getId()){
                case R.id.btn_0:
                    string=editText.getText().toString()+0;
                    editText.setText(string);
                    break;
                case R.id.btn_1:
                    string=editText.getText().toString()+1;
                    editText.setText(string);
                    break;
                case R.id.btn_2:
                    string=editText.getText().toString()+2;
                    editText.setText(string);
                    break;
                case R.id.btn_3:
                    string=editText.getText().toString()+3;
                    editText.setText(string);
                    break;
                case R.id.btn_4:
                    string=editText.getText().toString()+4;
                    editText.setText(string);
                    break;
                case R.id.btn_5:
                    string=editText.getText().toString()+5;
                    editText.setText(string);
                    break;
                case R.id.btn_6:
                    string=editText.getText().toString()+6;
                    editText.setText(string);
                    break;
                case R.id.btn_7:
                    string=editText.getText().toString()+7;
                    editText.setText(string);
                    break;
                case R.id.btn_8:
                    string=editText.getText().toString()+8;
                    editText.setText(string);
                    break;
                case R.id.btn_9:
                    string=editText.getText().toString()+9;
                    editText.setText(string);
                    break;
                case R.id.btn_jia:
                    string=editText.getText().toString();
                    n1= Double.parseDouble(string);
                    operator="+";
                    editText.setText("");
                    string=MyFormat.format(n1)+operator;
                    tv_result.setText(string);
                    break;
                case R.id.btn_jian:
                    string=editText.getText().toString();
                    n1= Double.parseDouble(string);
                    operator="-";
                    editText.setText("");
                    string=MyFormat.format(n1)+operator;
                    tv_result.setText(string);
                    break;
                case R.id.btn_x:
                    string=editText.getText().toString();
                    n1= Double.parseDouble(string);
                    operator="*";
                    editText.setText("");
                    string=MyFormat.format(n1)+operator;
                    tv_result.setText(string);
                    break;
                case R.id.btn_ggg:
                    string=editText.getText().toString();
                    n1= Double.parseDouble(string);
                    operator="/";
                    editText.setText("");
                    string=MyFormat.format(n1)+operator;
                    tv_result.setText(string);
                    break;
                case R.id.btn_dian:
                    string=editText.getText().toString();
                    if (string.contains(".")){
                        Log.d("xxxx","havepoint");
                    }else{
                        if (string.equals("0")){
                            string="0"+".";
                            editText.setText(string);
                        }
                        else if (string.equals("")){
                            Log.d("xxxx","thisnull");
                        }
                        else {
                            string+=".";
                            editText.setText(string);
                        }
                    }
                    break;
                case R.id.btn_equal:
                    switch (operator){
                        case "+":
                            string=editText.getText().toString();
                            n2= Double.parseDouble(string);
                            result=n1+n2;
                            string=MyFormat.format(n1)+operator+MyFormat.format(n2)+
                                    "="+MyFormat.format(result);
                            tv_result.setText(string);
                            string=MyFormat.format(result)+"";
                            editText.setText(string);
                            break;
                        case "-":
                            string=editText.getText().toString();
                            n2= Double.parseDouble(string);
                            result=n1-n2;
                            string=MyFormat.format(n1)+operator+MyFormat.format(n2)+
                                    "="+MyFormat.format(result);
                            tv_result.setText(string);
                            string=MyFormat.format(result)+"";
                            editText.setText(string);
                            break;
                        case "*":
                            string=editText.getText().toString();
                            n2= Double.parseDouble(string);
                            result=n1*n2;
                            string=MyFormat.format(n1)+operator+MyFormat.format(n2)+
                                    "="+MyFormat.format(result);
                            tv_result.setText(string);
                            string=MyFormat.format(result)+"";
                            editText.setText(string);
                            break;
                        case "/":
                            string=editText.getText().toString();
                            n2= Double.parseDouble(string);
                            result=n1/n2;
                            string=MyFormat.format(n1)+operator+MyFormat.format(n2)+
                                    "="+MyFormat.format(result);
                            tv_result.setText(string);
                            string=MyFormat.format(result)+"";
                            editText.setText(string);

                            break;
                    }
                    break;
                case R.id.btn_clear:
                    editText.setText("");
                    tv_result.setText("");
                    result=0;
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
