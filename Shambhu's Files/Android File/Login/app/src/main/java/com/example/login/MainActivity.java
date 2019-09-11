package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnn;
    ImageView img2,img3;
    TextView text1,text2,text3,text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnn=findViewById(R.id.button2);
        img2=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);
        text1=findViewById(R.id.textView);
        text2=findViewById(R.id.textView2);
        text3=findViewById(R.id.textView3);
        text4=findViewById(R.id.textView4);




        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
            }


        });

    }
}
