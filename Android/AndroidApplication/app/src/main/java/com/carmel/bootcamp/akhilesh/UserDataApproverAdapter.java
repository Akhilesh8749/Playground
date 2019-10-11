package com.carmel.bootcamp.akhilesh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import Model.UserDataModel;

class UserDataApproverAdapter extends BaseAdapter {

    Context context;
    JSONArray jsonArray;
    ArrayList<String> arrayListName=new ArrayList<>();
    ArrayList<String> arrayListDescription=new ArrayList<>();

    public UserDataApproverAdapter(Context context, JSONArray jsonArray) {
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
        TextView userName,userDetails;
        final ImageView profileImage,addImage;
        View view1= LayoutInflater.from(context).inflate(R.layout.add_approver_list,viewGroup,false);

        profileImage=view1.findViewById(R.id.userProfile);
        userName=view1.findViewById(R.id.userName);
        userDetails=view1.findViewById(R.id.userDetails);
        addImage=view1.findViewById(R.id.userAdd);

//        UserDataModel dataModel= this.userDataList.get(i);


        for(int j=0;j<jsonArray.length();j++){
            try {
                JSONObject obj=jsonArray.getJSONObject(j);
                arrayListName.add(obj.getString("name"));
                arrayListDescription.add(obj.getString("description"));

                userName.setText(arrayListName.get(i));
                userDetails.setText(arrayListDescription.get(i));

//                if(obj.getString("description").equals("Lorem ipsum dolor sit amet, consectetur adipiscing elit")){
//                    arrayList.add(obj.getString("name"));
//                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        addImage.setImageResource(R.drawable.add);

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addImage.setImageResource(R.drawable.minus);
            }
        });



        return view1;
    }
}
