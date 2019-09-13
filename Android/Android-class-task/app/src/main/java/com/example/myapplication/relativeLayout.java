package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relativeLayout extends AppCompatActivity {
 Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    btn2=findViewById(R.id.button2);

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent frame_layout= new Intent(getApplicationContext(),FrameLayout.class);
            startActivity(frame_layout);
        }
    });
    }
}
