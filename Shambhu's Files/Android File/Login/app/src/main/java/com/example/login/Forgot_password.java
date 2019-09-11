package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Forgot_password extends AppCompatActivity {
    Button button3;
    ImageView img2,img3,img1,img4,img5;
    TextView text5,text6,text8,text10,text11,text7,text13,text14;
    TextView edittext3;
    AlertDialog.Builder alertBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        button3=findViewById(R.id.button3);
        img1=findViewById(R.id.imageView);
        img4=findViewById(R.id.imageView4);
        img5=findViewById(R.id.imageView5);

        text5=findViewById(R.id.textView5);
        text6=findViewById(R.id.textView6);
        edittext3=findViewById(R.id.editText3);
        text8=findViewById(R.id.textView8);
        text10=findViewById(R.id.textView10);
        text11=findViewById(R.id.textView11);
        text7=findViewById(R.id.textView7);
        text13=findViewById(R.id.textView13);
        text14=findViewById(R.id.textView14);

         alertBuilder=new AlertDialog.Builder(this);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext3.getText().toString().equals("")) {
                    text5.setVisibility(View.VISIBLE);
                    text6.setVisibility(View.VISIBLE);
                    edittext3.setVisibility(View.VISIBLE);
                    text8.setVisibility(View.VISIBLE);
                    text10.setVisibility(View.VISIBLE);
                    text11.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    text7.setVisibility(View.VISIBLE);
                    text13.setVisibility(View.VISIBLE);
                    text14.setVisibility(View.VISIBLE);
                } else {

                    final View alertView = getLayoutInflater().inflate(R.layout.alertdialog,null);

                    alertBuilder.setView(alertView);
                    final AlertDialog alertDialog = alertBuilder.create();
                    alertDialog.show();
                }
            }
        });

    }
    }

