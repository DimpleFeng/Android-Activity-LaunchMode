package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTopLaunchModeActivity extends BaseActivity {

    private android.widget.Button singleTop;
    private Button otherSingleTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_launch_mode);
        this.otherSingleTop = (Button) findViewById(R.id.other_singleTop);
        this.singleTop = (Button) findViewById(R.id.singleTop);
        singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleTopLaunchModeActivity.this, SingleTopLaunchModeActivity.class);
                startActivity(intent);
            }
        });
        otherSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleTopLaunchModeActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
    }
}
