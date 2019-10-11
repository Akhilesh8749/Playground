package com.carmel.bootcamp.akhilesh;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

public class PeopleFound extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_people_found, container, false);

        String json;
        try {
            InputStream inputStream = getActivity().getAssets().open("people.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer, "UTF-8");
            JSONArray jsonArray=new JSONArray(json);

            ListAdapter listAdapter=new PeopleFoundAdapter(view.getContext(),jsonArray);
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
