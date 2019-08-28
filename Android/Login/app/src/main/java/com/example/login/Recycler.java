package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class Recycler extends AppCompatActivity {
    RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView=findViewById(R.id.recyclerView);

        String title[]={"PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056"};
        String date[]={"06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019"};
        String statusTitle[]={"APPROVED","APPROVED","APPROVED","APPROVED"};

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        MyRecyclerListAdapter myRecyclerListAdapter=new MyRecyclerListAdapter(getApplicationContext(),title,date,statusTitle);
        recyclerView.setAdapter(myRecyclerListAdapter);
    }

    public class Adapter {
    }

    public class ViewHolder {
        public ViewHolder(View itemView) {
        }
    }
}
