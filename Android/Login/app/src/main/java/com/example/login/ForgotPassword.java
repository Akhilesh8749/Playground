package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import static com.example.login.R.layout.alertdialog;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ConstraintLayout c1;
    AlertDialog.Builder alertBuilder;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        button=findViewById(R.id.button2);
        et1=findViewById(R.id.editText2);
        c1=findViewById(R.id.hiddenThree);


        alertBuilder=new AlertDialog.Builder(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("")) {
                     c1.setVisibility(View.VISIBLE);
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
