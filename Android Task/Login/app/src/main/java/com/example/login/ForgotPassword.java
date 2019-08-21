package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.login.R.layout.alertdialogforgot;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ImageView iv3, iv4;
    TextView tv4, tv5;
    AlertDialog.Builder alertBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(alertdialogforgot,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();

        button=findViewById(R.id.button2);
        iv3=findViewById(R.id.imageView5);
        iv4=findViewById(R.id.imageView6);
        tv4=findViewById(R.id.textView9);
        tv5=findViewById(R.id.textView10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv3.setVisibility(1);
                iv4.setVisibility(1);
                tv4.setVisibility(1);
                tv5.setVisibility(1);

                alertDialog.show();
            }
        });
    }
}