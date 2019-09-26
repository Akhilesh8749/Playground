package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.Deligate.DeligeteInterface;
import com.example.login.Global.RequestStatus;
import com.example.login.Model.RequestModel;

import java.util.ArrayList;


public class Request_List extends Fragment {

    ListView listView;
    DeligeteInterface delInterface;
    Button btn, reqForm2;
    ImageView img1;
    ListPopupWindow list1;
    TextView listpopup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_request__list, container, false);
        String[] status = {"Clear", "Approved", "Draft", "Awaiting", "Rejected"};

        img1 = view.findViewById(R.id.imageView6);
        listpopup = view.findViewById(R.id.listpopup);
        list1 = new ListPopupWindow(getContext());
        list1.setAdapter(new ArrayAdapter(getContext(), R.layout.list, status));
        list1.setAnchorView(img1);
        list1.setModal(true);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list1.show();
            }
        });

        listView =view.findViewById(R.id.listVew);
        btn = view.findViewById(R.id.button3);
        reqForm2 = view.findViewById(R.id.button4);


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


        ListAdapter listAdapter = new MyListAdapter(view.getContext(),requestList);
        listView.setAdapter(listAdapter);




//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                RequestModel items= requestList.get(i);
//
//                Intent intent=new Intent(view.getContext(),RequestView.class);
//
//
//                Bundle dataBundle =new Bundle();
//
//                dataBundle.putString("RequestNumber", items.getRequestNumber());
//                dataBundle.putString("RequestDate", items.getDate());
//                dataBundle.putString("RequestStatus", items.getRequestStatus().toString());
//
//                intent.putExtra("request", dataBundle);
//
//                startActivity(intent);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), RequisitionForm1.class);
                startActivity(intent3);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RequestModel requestModel=requestList.get(i);

                if (delInterface !=null)
                {
                    delInterface.deligeteMethod(requestModel);

                }
            }
        });
        return view;
    }



    public  void setDeligeteInterface(DeligeteInterface deligeteInterface){
        this.delInterface=deligeteInterface;
    }
}
