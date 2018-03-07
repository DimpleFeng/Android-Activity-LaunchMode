package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherActivity extends BaseActivity {

    private android.widget.Button backToSingleTop;
    private Button backToSingleTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        this.backToSingleTask = (Button) findViewById(R.id.backToSingleTask);
        this.backToSingleTop = (Button) findViewById(R.id.backToSingleTop);
        backToSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, SingleTopLaunchModeActivity.class);
                startActivity(intent);
            }
        });

        backToSingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, SingleTaskLaunchModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
