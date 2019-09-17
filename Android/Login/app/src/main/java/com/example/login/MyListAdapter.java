package com.example.login;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> proNum;
    ArrayList<String> proDate;
    ArrayList<String> proStatus;
    public MyListAdapter(Context context, ArrayList<String> title, ArrayList<String> date, ArrayList<String> status) {
        this.context=context;
        this.proNum=title;
        this.proDate=date;
        this.proStatus=status;
    }
    @Override
    public int getCount() {
        return proNum.size();
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(context).inflate(R.layout.list_display,parent,false);
        TextView PN,PD,PS;
        ImageView IV;
        PN=view.findViewById(R.id.title);
        PD=view.findViewById(R.id.date);
        PS=view.findViewById(R.id.statusTitle);
        IV=view.findViewById(R.id.imageView8);

        PN.setText(proNum.get(position));
        PD.setText(proDate.get(position));
        PS.setText(proStatus.get(position));
        IV.setImageResource(R.drawable.notification);

        return view;
    }
}