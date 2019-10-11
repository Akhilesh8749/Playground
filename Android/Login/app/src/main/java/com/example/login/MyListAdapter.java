package com.example.login;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.Model.RequestModel;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    private final Context context;
    ArrayList<RequestModel> reqList;

    public MyListAdapter(Context context, ArrayList<RequestModel> requestList) {
        this.reqList=requestList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return reqList.size();
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
        View view1 = LayoutInflater.from(context).inflate(R.layout.list_display, viewGroup, false);


        TextView productNumber,status,date;
        ImageView imageView;
        RequestModel request = this.reqList.get(i);

        productNumber=view1.findViewById(R.id.title);
        status=view1.findViewById(R.id.statusTitle);
        date=view1.findViewById(R.id.date);
        imageView=view1.findViewById(R.id.imageView8);


        productNumber.setText(String.valueOf(request.getRequestNumber()));
        status.setText(String.valueOf(request.getRequestStatus()));
        date.setText(String.valueOf(request.getDate()));
        imageView.setImageResource(R.drawable.notification);

        return view1;
    }
}