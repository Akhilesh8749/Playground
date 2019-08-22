package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.login.R.layout.alertdialog;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ImageView iv3, iv4;
    TextView tv4, tv5;
    AlertDialog.Builder alertBuilder;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        button=findViewById(R.id.button2);
        iv3=findViewById(R.id.imageView3);
        iv4=findViewById(R.id.imageView4);
        tv4=findViewById(R.id.textView7);
        tv5=findViewById(R.id.textView8);
        et1=findViewById(R.id.editText2);

        alertBuilder=new AlertDialog.Builder(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("")) {
                    iv3.setVisibility(View.VISIBLE);
                    iv4.setVisibility(View.VISIBLE);
                    tv4.setVisibility(View.VISIBLE);
                    tv5.setVisibility(View.VISIBLE);
                }

                else{
                    final View alertView=getLayoutInflater().inflate(alertdialog,null);
                    alertBuilder.setView(alertView);
                    final AlertDialog alertDialog=alertBuilder.create();
                    alertDialog.show();
                }

            }
        });

    }
}
