package com.example.dimple.myapplication;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        String TAG = "onCreate";
        /**
         * getClass().getSimpleName()用于显示当前的类名
         * getTaskId()用于显示任务栈ID
         * hashCode()用于说明Activity是不是同一个实例
         */
        Log.i(TAG, "onCreate: " +getClass().getSimpleName()+"  TaskId: "+getTaskId()+"  hashCode:  "+hashCode());
    }

    /**
     * 重写onNewIntent方法，便于提示是否回调了该方法。
     * @param intent
     */
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String TAG = "onNewIntent";
        Log.i(TAG, "onNewIntent: "+getClass().getSimpleName()+" TaskId: "+getTaskId()+"  hashCode:  "+hashCode());
    }

    /**
     * 重写返回方法，便于在log中显示
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String TAG = "onBackPressed";
        Log.i(TAG, "backPressed!");
    }
}
