package com.example.login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.Model.ReqViewModel;
import com.example.login.Model.RequestModel;

import java.util.ArrayList;


public class Request_View extends Fragment {
    TextView RQTitle,RQDate,RQStatus;
    ListView listView;
    RequestModel requestModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_request__view, container, false);


//        Bundle reqBundle=view.getIntent().getBundleExtra("request");
//        String reqNo=reqBundle.getString("RequestNumber");
//        String reqDate=reqBundle.getString("RequestDate");
//        String reqStatus=reqBundle.getString("RequestStatus");

        RQTitle=view.findViewById(R.id.textView35);
        RQDate=view.findViewById(R.id.textView42);
        RQStatus=view.findViewById(R.id.textView44);


        if(requestModel !=null){
            RQTitle.setText(requestModel.getRequestNumber());
            RQDate.setText(requestModel.getDate());
            RQStatus.setText(requestModel.getRequestStatus().toString());
        }



        listView=view.findViewById(R.id.scrollDownVales);



        ArrayList<ReqViewModel> reqViewList = new ArrayList<>();

        ReqViewModel reqViewModel=new ReqViewModel();
        reqViewModel.setItemDetails("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k SATA / STD. HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" +1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5,10 (RAID 121i).");
        reqViewModel.setItemNumber("01");
        reqViewModel.setItemDate("10 Jul 2019");
        reqViewModel.setItemPrice("45000");
        reqViewList.add(reqViewModel);


        reqViewModel=new ReqViewModel();
        reqViewModel.setItemDetails("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        reqViewModel.setItemNumber("01");
        reqViewModel.setItemDate("10 Jul 2019");
        reqViewModel.setItemPrice("45000");
        reqViewList.add(reqViewModel);


        reqViewModel=new ReqViewModel();
        reqViewModel.setItemDetails("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        reqViewModel.setItemNumber("01");
        reqViewModel.setItemDate("10 Jul 2019");
        reqViewModel.setItemPrice("45000");
        reqViewList.add(reqViewModel);

        reqViewModel=new ReqViewModel();
        reqViewModel.setItemDetails("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        reqViewModel.setItemNumber("01");
        reqViewModel.setItemDate("10 Jul 2019");
        reqViewModel.setItemPrice("45000");
        reqViewList.add(reqViewModel);




        ListAdapter itemInformation= new MyScrollViev(getContext(),reqViewList);
        listView.setAdapter(itemInformation);

       return view;
    }

    public  void setData(RequestModel requestModel){
        this.requestModel=requestModel;
    }
}
