package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button standardLunchMode;
    private Button singleTopLaunchMode;
    private Button singleTaskLaunchMode;
    private Button singIntsanceLaunchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.singIntsanceLaunchMode = (Button) findViewById(R.id.singIntsanceLaunchMode);
        this.singleTaskLaunchMode = (Button) findViewById(R.id.singleTaskLaunchMode);
        this.singleTopLaunchMode = (Button) findViewById(R.id.singleTopLaunchMode);
        this.standardLunchMode = (Button) findViewById(R.id.standardLunchMode);
        //设置点击事件
        singIntsanceLaunchMode.setOnClickListener(this);
        singleTaskLaunchMode.setOnClickListener(this);
        singleTopLaunchMode.setOnClickListener(this);
        standardLunchMode.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            //点击进入单例模式测试界面
            case R.id.singIntsanceLaunchMode:
                intent.setClass(MainActivity.this, SingleInstanceLaunchModeActivity.class);
                break;
            //点击进入栈内复用模式测试界面
            case R.id.singleTaskLaunchMode:
                intent.setClass(MainActivity.this, SingleTaskLaunchModeActivity.class);
                break;
            //点击进入栈顶复用模式测试界面
            case R.id.singleTopLaunchMode:
                intent.setClass(MainActivity.this, SingleTopLaunchModeActivity.class);
                break;
            //点击进入默认模式测试界面
            case R.id.standardLunchMode:
                intent.setClass(MainActivity.this, StandardLunchModeActivity.class);
                break;
        }
        startActivity(intent);
    }
}
