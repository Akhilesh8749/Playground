package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

public class RequestList extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    ImageView img1;
    ListPopupWindow list1;
    TextView listpopup;
    ListView listView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_list);
        String[] status={"Clear", "Approved", "Draft", "Awaiting", "Rejected"};

        listView=findViewById(R.id.listVew);
        btn=findViewById(R.id.button3);


        String title[]={"PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056"};
        String date[]={"06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019"};
        String statusTitle[]={"APPROVED","APPROVED","APPROVED","APPROVED"};

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent3= new Intent(getApplicationContext(),Recycler.class);
            startActivity(intent3);
        }
        });

        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,statusTitle);
        listView.setAdapter(listAdapter);

        img1=findViewById(R.id.imageView6);
        listpopup= findViewById(R.id.listpopup);
        list1 = new ListPopupWindow(getApplicationContext());
        list1.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.list, status));
        list1.setAnchorView(img1);
        list1.setModal(true);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list1.show();
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.request_list, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}