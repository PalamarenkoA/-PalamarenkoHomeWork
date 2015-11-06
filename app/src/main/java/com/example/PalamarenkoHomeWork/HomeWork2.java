package com.example.PalamarenkoHomeWork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.toolbar.R;

public class HomeWork2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work2);
        Toolbar();
        NavigationDraver();

        final TextView function = (TextView) findViewById(R.id.textView4);
        final TextView answer = (TextView) findViewById(R.id.textView3);
        final EditText input = (EditText) findViewById(R.id.editText2);
        Button fibonacci = (Button) findViewById(R.id.button2);
        Button factorial = (Button) findViewById(R.id.button3);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button2:
                        function.setText("Fibonacci");
                        answer.setText(Integer.toString(Fibonacci(Integer.parseInt(String.valueOf(input.getText())))));

                        break;
                    case R.id.button3:
                        function.setText("Factorial");
                        answer.setText(Integer.toString(Factorial(Integer.parseInt(String.valueOf(input.getText())))));

                        break;                }
            }};
        fibonacci.setOnClickListener(oclBtn);
        factorial.setOnClickListener(oclBtn);

    }



    public int Fibonacci (int a) {
        if (a == 0) return 0;
        if (a==1) return 1;
        return Fibonacci((a - 1)) + Fibonacci((a - 2));
    }
    public int Factorial (int a) {
        if (a==0) return 1;
        return a*Factorial(a-1);
    }



}