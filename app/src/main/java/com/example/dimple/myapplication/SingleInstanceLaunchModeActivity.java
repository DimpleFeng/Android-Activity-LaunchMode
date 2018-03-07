package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleInstanceLaunchModeActivity extends BaseActivity {

    private android.widget.Button singleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance_launch_mode);
        this.singleInstance = (Button) findViewById(R.id.singleInstance);
        singleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SingleInstanceLaunchModeActivity.this,SingleInstanceLaunchModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
