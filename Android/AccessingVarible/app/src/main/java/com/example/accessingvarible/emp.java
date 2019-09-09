package com.example.accessingvarible;


import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class emp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    emp() {
            System.out.println("Akhilesh M Malaganavar");
    }


 public void myFun(Context applicationContext){
     Toast.makeText(applicationContext, "Akhilesh", Toast.LENGTH_SHORT).show();
 }
}