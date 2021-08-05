package com.moyvch.jzbbs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xuexiang.xui.XUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        XUI.initTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}