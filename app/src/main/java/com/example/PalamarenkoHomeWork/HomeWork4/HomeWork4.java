package com.example.PalamarenkoHomeWork.HomeWork4;

import android.support.v4.app.FragmentManager;

import com.example.toolbar.R;

public class HomeWork4 extends BaseActivity {

    protected boolean isAddFragment(){
        return true;
    }
    protected void addFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.BaseLayout, new Fragment1()).commit();
    }
    public void next() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.BaseLayout, new FragmentNext()).commit();
    }
    public void previous() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.BaseLayout, new FragmentPrevious()).commit();
    }

}
