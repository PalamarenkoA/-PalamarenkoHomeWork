package com.example.PalamarenkoHomeWork.HomeWork4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.PalamarenkoHomeWork.MainActivity;
import com.example.toolbar.R;


public abstract class BaseActivity extends MainActivity implements FragmentInterface{
    protected abstract void addFragment();
    public abstract  void next();
    public abstract  void previous();
    protected abstract boolean isAddFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work4);
        NavigationDraver();
        Toolbar();
        if(isAddFragment())addFragment();
        Button next = (Button) findViewById(R.id.buttonNext);
        Button previous = (Button) findViewById(R.id.buttonPrevious);
        View.OnClickListener oclBtn = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.buttonNext:
                    next();
                        break;
                    case R.id.buttonPrevious:
                      previous();
                        break;
}
            }};
        next.setOnClickListener(oclBtn);
        previous.setOnClickListener(oclBtn);
    }
}
