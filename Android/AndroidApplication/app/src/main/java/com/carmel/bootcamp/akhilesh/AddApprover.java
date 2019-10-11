package com.carmel.bootcamp.akhilesh;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import Model.UserDataModel;


public class AddApprover extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_approver, container, false);


        final EditText searchEditText=view.findViewById(R.id.searchEditText);
        ImageView searchImage=view.findViewById(R.id.searchImage);

        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(searchEditText.getText().toString().equals("Akhilesh")){
                    Toast.makeText(getContext(),"Correct",Toast.LENGTH_LONG).show();

                    PeopleFound peopleFound=new PeopleFound();
                    FragmentManager fragmentManager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout,peopleFound);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                else {
                    AddApproverNoSearchFound addApproverNoSearchFound=new AddApproverNoSearchFound();
                    FragmentManager fragmentManager=getFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.mainLayout,addApproverNoSearchFound);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });

//        ArrayList<UserDataModel> approverDataList=new ArrayList<>();
//
//        UserDataModel userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh M");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh M M");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Akhilesh m m");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Parvati");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Shambhu");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Dinesh");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);
//
//
//        userDataModel=new UserDataModel();
//        userDataModel.setUserName("Prerana");
//        userDataModel.setUserDetails("Lorem ipsum doler sit amet.");
//        approverDataList.add(userDataModel);

        String json;
        try {
            InputStream inputStream = getActivity().getAssets().open("people.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer, "UTF-8");
            JSONArray jsonArray=new JSONArray(json);

            ListAdapter listAdapter=new UserDataApproverAdapter(view.getContext(),jsonArray);
            ListView listView=view.findViewById(R.id.approverList);
            listView.setAdapter(listAdapter);

            // Toast.makeText(getContext(),arrayList.toString(),Toast.LENGTH_LONG).show();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return  view;
    }
}
