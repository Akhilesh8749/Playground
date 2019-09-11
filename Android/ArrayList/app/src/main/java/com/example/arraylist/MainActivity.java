package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> list = new ArrayList<>();
    int count=0;
    Button add,delete,show;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.addBtn);
        delete=findViewById(R.id.deleteBtn);
        show=findViewById(R.id.showBtn);
        tv=findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display ();
            }
        });
    }


    private  void add(){
        count=count+1;
        list.add(count);
        Toast.makeText(this, "Added", Toast.LENGTH_LONG).show();
    }
    private  void delete(){
        list.remove(list.size()-1);
        count=count-1;

    }
    private void display() {
        tv.setText(" ");
       for (int i=0;i<list.size();i++) {
           tv.setText(tv.getText()+String.valueOf(list.get(i))+",");
       }
    }
}