package com.example.PalamarenkoHomeWork;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.PalamarenkoHomeWork.HomeWork4.HomeWork4;
import com.example.toolbar.R;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationDraver();
        Toolbar();
        Menu();




    }
    public  void Toolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.HW:{
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;}
            case R.id.HW1:{
                Intent intent1 = new Intent(MainActivity.this, HomeWork1.class);
                startActivity(intent1);
                return true;}
            case R.id.HW2:{
                Intent intent2 = new Intent(MainActivity.this, HomeWork2.class);
                startActivity(intent2);
                return true;}
            case R.id.HW3:{
                Intent intent3 = new Intent(MainActivity.this, HomeWork3.class);
                startActivity(intent3);
                return true;}
            case R.id.HW4:{
                Intent intent4 = new Intent(MainActivity.this, HomeWork4.class);
                startActivity(intent4);
                return true;}
            case R.id.HW5:{
                Intent intent5 = new Intent(MainActivity.this, HomeWork5.class);
                startActivity(intent5);
                return true;}

                default:
                    return super.onOptionsItemSelected(item);

        }
    }
    public  void Menu(){
    Button homework1 = (Button) findViewById(R.id.homework_1);
    Button homework2 = (Button) findViewById(R.id.homework_2);
    Button homework3 = (Button) findViewById(R.id.homework_3);
    Button homework4 = (Button) findViewById(R.id.homework_4);
    Button homework5 = (Button) findViewById(R.id.homework_5);
    Button homework6 = (Button) findViewById(R.id.homework_6);
    View.OnClickListener oclBtn = new View.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.homework_1:
                    Intent intent = new Intent(MainActivity.this, HomeWork1.class);
                    startActivity(intent);
                    break;
                case R.id.homework_2:
                    Intent intent2 = new Intent(MainActivity.this, HomeWork2.class);
                    startActivity(intent2);
                    break;
                case R.id.homework_3:
                    Intent intent3 = new Intent(MainActivity.this, HomeWork3.class);
                    startActivity(intent3);
                    break;
                case R.id.homework_4:
                    Intent intent4 = new Intent(MainActivity.this, HomeWork4.class);
                    startActivity(intent4);
                    break;
                case R.id.homework_5:
                    Intent intent5 = new Intent(MainActivity.this, HomeWork5.class);
                    startActivity(intent5);
                    break;
                case R.id.homework_6:
                    Intent intent6 = new Intent(MainActivity.this, HomeWork5.class);
                    startActivity(intent6);
                    break;

            }
        }};
    homework1.setOnClickListener(oclBtn);
    homework2.setOnClickListener(oclBtn);
    homework3.setOnClickListener(oclBtn);
    homework4.setOnClickListener(oclBtn);
    homework5.setOnClickListener(oclBtn);
    homework6.setOnClickListener(oclBtn);
}
    public void  NavigationDraver(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        // Adding menu icon to Toolbar
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    // This method will trigger on item Click of navigation menu
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Set item in checked state
                        menuItem.setChecked(true);
                        int id = menuItem.getItemId();
                        switch (id){
                            case R.id.Main:
                                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.HV1:
                                Intent intent1 = new Intent(MainActivity.this, HomeWork1.class);
                                startActivity(intent1);
                                break;
                            case R.id.HV2:
                                Intent intent2 = new Intent(MainActivity.this, HomeWork2.class);
                                startActivity(intent2);
                                break;
                            case R.id.HV3:
                                Intent intent3 = new Intent(MainActivity.this, HomeWork3.class);
                                startActivity(intent3);
                                break;
                            case R.id.HV4:
                                Intent intent4 = new Intent(MainActivity.this, HomeWork4.class);
                                startActivity(intent4);
                                break;
                            case R.id.HV5:
                                Intent intent5 = new Intent(MainActivity.this, HomeWork5.class);
                                startActivity(intent5);
                                break;}


                        // TODO: handle navigation

                        // Closing drawer on item click
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }}
