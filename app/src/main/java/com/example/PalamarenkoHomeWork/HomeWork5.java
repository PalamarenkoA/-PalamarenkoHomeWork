package com.example.PalamarenkoHomeWork;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.toolbar.R;

public class HomeWork5 extends MainActivity implements Animation.AnimationListener {
    Animation animFadein;
    Animation blink;
    Animation rotate;
    Animation zoomin;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work5);
        Toolbar();
        NavigationDraver();
        textView1 = (TextView) findViewById(R.id.textView10);
        textView2 = (TextView) findViewById(R.id.textView11);
        textView3 = (TextView) findViewById(R.id.textView12);
        textView4 = (TextView) findViewById(R.id.textView13);
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        blink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        rotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        zoomin = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoomin);
        animFadein.setAnimationListener(this);
        textView1.startAnimation(animFadein);
        textView2.startAnimation(blink);
        textView3.startAnimation(rotate);
        textView4.startAnimation(zoomin);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        textView1.startAnimation(animFadein);
        textView2.startAnimation(blink);
        textView3.startAnimation(rotate);
        textView4.startAnimation(zoomin);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
