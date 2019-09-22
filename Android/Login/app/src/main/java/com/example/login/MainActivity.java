package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView tv1;
    EditText et1;
    ConstraintLayout c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        et1=findViewById(R.id.editText);
        tv1=findViewById(R.id.textView2);

        c1=findViewById(R.id.hiddenOne);
        c2=findViewById(R.id.hiddenTwo);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("")) {
                    c1.setVisibility(View.VISIBLE);
                    c2.setVisibility(View.VISIBLE);
                }

                else{
                    Intent intent1=new Intent(getApplicationContext(),FragmrntRequestList.class);
                    startActivity(intent1);
                }
            }
        });


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
}
