package com.carmel.bootcamp.akhilesh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

class PeopleFoundAdapter extends BaseAdapter {
    Context context;
    JSONArray jsonArray;
    ArrayList<String> arrayListName=new ArrayList<>();
    ArrayList<String> arrayListDescription=new ArrayList<>();
    public PeopleFoundAdapter(Context context, JSONArray jsonArray) {
        this.context=context;
        this.jsonArray=jsonArray;
    }

    @Override
    public int getCount() {
        return jsonArray.length();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1= LayoutInflater.from(context).inflate(R.layout.add_approver_list,viewGroup,false);
        TextView userName,userDetails;
        int count=0;
        userName=view1.findViewById(R.id.userName);
        userDetails=view1.findViewById(R.id.userDetails);

        for(int j=0;j<jsonArray.length();j++){
            try {
                JSONObject obj=jsonArray.getJSONObject(j);
                arrayListName.add(obj.getString("name"));
                arrayListDescription.add(obj.getString("description"));

                if(obj.getString("name").equals("Akhilesh")){


                    userName.setText(arrayListName.get(j));
                    userDetails.setText(arrayListDescription.get(j));
                }


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return view1;
    }
}
