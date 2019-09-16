package com.example.listview_and_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> productNumber = new ArrayList<>();
        ArrayList<String> date = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
        ls = findViewById(R.id.demoLIstView);

        productNumber.add("PUR - 2019 - 056");
        productNumber.add("PUR - 2019 - 057");
        productNumber.add("PUR - 2019 - 058");
        productNumber.add("PUR - 2019 - 059");
        productNumber.add("PUR - 2019 - 060");

        date.add("06 Jul 2019");
        date.add("06 Jul 2018");
        date.add("06 Jul 2017");
        date.add("06 Jul 2016");
        date.add("06 Jul 20195");



        status.add("AWAITING APPROVAL");
        status.add("APPROVED");
        status.add("DRAFT");
        status.add("REJECTED");
        status.add("STILL DOING");

        demoListAdapter dla= new demoListAdapter(getApplicationContext(),productNumber,date,status);

        ls.setAdapter(dla);
    }
}
