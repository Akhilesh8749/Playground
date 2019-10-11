package com.carmel.bootcamp.akhilesh;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import Delegate.DelegateInterface;
import Model.UserDataModel;


public class RequisitionFormFive extends Fragment {

    ListView listView;
    DelegateInterface delegateInterface;
    Button nextButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_requisition_form_five, container, false);

//        final ArrayList<UserDataModel> userDataList=new ArrayList<>();

//        UserDataModel userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        userDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh M");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        userDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh M M");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        userDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh m m");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        userDataList.add(userDataModel);
//
//        ListAdapter listAdapter=new UserDataAdapter(view.getContext(),userDataList);
//        listView=view.findViewById(R.id.userDataLayout);
//        listView.setAdapter(listAdapter);
//
        ImageView addImageToNext =view.findViewById(R.id.imageView);

        addImageToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (delegateInterface!=null){
                    delegateInterface.delegateMethod();
                }
            }
        });

        String json;
        try {
            InputStream inputStream = getActivity().getAssets().open("people.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer, "UTF-8");
            JSONArray jsonArray=new JSONArray(json);


            ListAdapter listAdapter=new UserDataAdapter(view.getContext(),jsonArray);
            listView=view.findViewById(R.id.userDataLayout);
            listView.setAdapter(listAdapter);

           // Toast.makeText(getContext(),arrayList.toString(),Toast.LENGTH_LONG).show();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return view;
    }

//    public void get_json(){
//        String json;
//        try {
//            InputStream inputStream = getActivity().getAssets().open("people.json");
//            int size = inputStream.available();
//            byte[] buffer = new byte[size];
//            inputStream.read(buffer);
//            inputStream.close();
//
//            json = new String(buffer, "UTF-8");
//            JSONArray jsonArray=new JSONArray(json);
//
//
//            for(int i=0;i<jsonArray.length();i++){
//
//                JSONObject obj=jsonArray.getJSONObject(i);
//
//                if(obj.getString("description").equals("Lorem ipsum dolor sit amet, consectetur adipiscing elit")){
//                    arrayList.add(obj.getString("name"));
//                }
//
//            }
//            Toast.makeText(getContext(),arrayList.toString(),Toast.LENGTH_LONG).show();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }

    public void setDelegateInterface(DelegateInterface delegateInterface){
        this.delegateInterface=delegateInterface;
    }
}
