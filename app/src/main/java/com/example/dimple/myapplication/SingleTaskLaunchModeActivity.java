package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTaskLaunchModeActivity extends BaseActivity {

    private android.widget.Button singleTask;
    private Button othersingleTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_launch_mode);
        this.othersingleTask = (Button) findViewById(R.id.other_singleTask);
        this.singleTask = (Button) findViewById(R.id.singleTask);
        singleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleTaskLaunchModeActivity.this, SingleTaskLaunchModeActivity.class);
                startActivity(intent);
            }
        });
        othersingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleTaskLaunchModeActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
    }
}
