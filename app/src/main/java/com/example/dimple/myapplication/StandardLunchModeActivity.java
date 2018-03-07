package com.example.dimple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StandardLunchModeActivity extends BaseActivity {

    private android.widget.Button standard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_lunch_mode);
        this.standard = (Button) findViewById(R.id.standard);
        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StandardLunchModeActivity.this,StandardLunchModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
