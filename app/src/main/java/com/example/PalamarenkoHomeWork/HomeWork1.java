package com.example.PalamarenkoHomeWork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.toolbar.R;

public class HomeWork1 extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work1);
        Toolbar();
        NavigationDraver();
        final TextView textView = (TextView) findViewById(R.id.textView2);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        View.OnClickListener oclBtn = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button:
                        textView.setText(editText.getText());

                        break;
                }
            }};
        button.setOnClickListener(oclBtn);




    }}


