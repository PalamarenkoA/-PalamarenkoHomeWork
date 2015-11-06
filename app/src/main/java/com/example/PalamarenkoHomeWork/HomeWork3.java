package com.example.PalamarenkoHomeWork;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.toolbar.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HomeWork3 extends MainActivity {
    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile" };
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work3);
        Toolbar();
        NavigationDraver();
        text2 = (TextView) findViewById(R.id.text_2);

        createAndShowNumbers();

        findViewById(R.id.button_1).setOnClickListener(clickListener);
        findViewById(R.id.button_2).setOnClickListener(clickListener);
        findViewById(R.id.button_3).setOnClickListener(clickListener);
        findViewById(R.id.button_4).setOnClickListener(clickListener);
    }

    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }

    private void reverseOrder() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = values.length-1; i >= 0; i--) {
            list.add(values[i]);
        }

        show(list);
    }

    private void removeEveryThird() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if((i+1)%3!=0) list.add(values[i]);
        }
        show(list);
    }

    private void removeDuplicates() {
        HashSet<String> list = new HashSet <>();
        for (int i = 0; i < values.length; i++) {
            if((i+1)%3!=0) list.add(values[i]);
        }
        show(list);
    }



    private void sortValues() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if((i+1)%3!=0) list.add(values[i]);
        }
        Collections.sort(list);
        show(list);
    }
    private void show(Collection collection){
        String strings = TextUtils.join(", ", collection);
        text2.setText(strings);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    reverseOrder();
                    break;
                case R.id.button_2:
                    removeEveryThird();
                    break;
                case R.id.button_3:
                    removeDuplicates();
                    break;
                case R.id.button_4:
                    sortValues();
                    break;
            }
        }
    };
}

