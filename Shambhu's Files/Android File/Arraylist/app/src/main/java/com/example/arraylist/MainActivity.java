package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add1;
    Button remove1;
    Button show;
    TextView numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        add1=findViewById(R.id.button);
        remove1=findViewById(R.id.button2);
        show=findViewById(R.id.button3);
        numbers=findViewById(R.id.textView);

        final ArrayList<String> arrayList=new ArrayList<>();
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add("hi");
                arrayList.add("hello");
                arrayList.add("carmel");
                arrayList.add("software");
                arrayList.add("solutions");
            }
        });
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.remove(2);
                arrayList.remove(0);
                arrayList.remove(4);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i< arrayList.size();i++){
                    numbers.setText(numbers.getText()+arrayList.get(i)+",");
                }
            }
        });




    }
}
