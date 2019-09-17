package com.example.listview_and_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class demoListAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> proNum;// = new ArrayList<>();
    ArrayList<String> proDate;// = new ArrayList<>();
    ArrayList<String> proStatus;// = new ArrayList<>();
    demoListAdapter(Context context, ArrayList<String> productNumber, ArrayList<String> date, ArrayList<String> status) {
        this.context=context;
        this.proNum=productNumber;
        this.proDate=date;
        this.proStatus=status;
    }

    @Override
    public int getCount() {
        return proNum.size();
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
    public View getView(int i, View view, ViewGroup parent) {

        View v= LayoutInflater.from(context).inflate(R.layout.demolistitems,parent,false);

        TextView PN,PD,PS;
        ImageView IV;

        PN=v.findViewById(R.id.productNumber);
        PD=v.findViewById(R.id.productDate);
        PS=v.findViewById(R.id.productStatus);
        IV=v.findViewById(R.id.imageView2);

        PN.setText(proNum.get(i));
        PD.setText(proDate.get(i));
        PS.setText(proStatus.get(i));
        IV.setImageResource(R.drawable.bell);
        return v;
    }
}
