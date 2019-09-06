package com.example.activityinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DemoInterface,DemoInterface3 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFunction();
        myName();
        myAge();
    }

    @Override
    public void myFunction() {
        Toast.makeText(this, "Interface MyFunction", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void myName() {
        Log.d("Nmae","Akhilesh");
    }

    @Override
    public void myAge() {
        Toast.makeText(this, "Age:21", Toast.LENGTH_SHORT).show();
    }
}
