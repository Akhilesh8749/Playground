package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.example.login.Global.RequestStatus;
import com.example.login.Model.RequestModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmrntRequestList extends AppCompatActivity {


    ImageView img1;
    ListPopupWindow list1;
    TextView listpopup;
    ListView listView;
    Button btn, reqForm2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmrnt_request_list);



        String[] status = {"Clear", "Approved", "Draft", "Awaiting", "Rejected"};

        listView = findViewById(R.id.listVew);
        btn = findViewById(R.id.button3);
        reqForm2 = findViewById(R.id.button4);


        final ArrayList<RequestModel> requestList = new ArrayList<>();

        RequestModel requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR - 2019 - 056");
        requestModel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModel.setDate("06 Jul 2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR - 2019 - 057");
        requestModel.setRequestStatus(RequestStatus.REJECTED);
        requestModel.setDate("07 Jul 2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR - 2019 - 058");
        requestModel.setRequestStatus(RequestStatus.DRAFT);
        requestModel.setDate("08 Jul 2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR - 2019 - 059");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDate("09 Jul 2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR - 2019 - 060");
        requestModel.setRequestStatus(RequestStatus.CLOSED);
        requestModel.setDate("10 Jul 2019");
        requestList.add(requestModel);


        ListAdapter listAdapter = new MyListAdapter(getApplicationContext(),requestList);
        listView.setAdapter(listAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                RequestModel items= requestList.get(i);

                Intent intent=new Intent(getApplicationContext(),RequestView.class);


                Bundle dataBundle =new Bundle();

                dataBundle.putString("RequestNumber", items.getRequestNumber());
                dataBundle.putString("RequestDate", items.getDate());
                dataBundle.putString("RequestStatus", items.getRequestStatus().toString());

                intent.putExtra("request", dataBundle);

                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), RequisitionForm1.class);
                startActivity(intent3);
            }
        });

    }


    public void Click(View view){
        Fragment ReqList= new Request_List();
        FragmentManager FM=getSupportFragmentManager();
        FragmentTransaction FT=FM.beginTransaction();
        FT.replace(R.id.fragmentReqList,ReqList);
        FT.commit();
    }


    public void Second(View view){
        Fragment ReqView= new Request_View();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentReqView,ReqView);
        ft.commit();
    }
}
