package com.ymc.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShareFileUtils.shareImageToWX(this,"/storage/emulated/0/tupian_out.jpg");
        //ShareFileUtils.shareImageToWX(this,"/storage/emulated/0/1.jpg");
    }
}