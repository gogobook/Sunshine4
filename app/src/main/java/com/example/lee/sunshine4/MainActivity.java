package com.example.lee.sunshine4;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
//            利用FragmentManager 的beginTransaction把 PlaceholderFragment的實例載入 R.id.container中，
//            commit實現。
//            查了文件，發現這是一堆的簡寫，難怪會看不懂了，我把繁寫的重新寫下。
//            由於用了不是android.support.v4.app，的組件，導致卡關。
//
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, new PlaceholderFragment()).commit();

//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();



        }
    }
    protected void displayQuantity(Integer quantity) {

    }
}
