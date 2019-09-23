package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.login.Model.ReqViewModel;

import java.util.ArrayList;

class MyScrollViev extends BaseAdapter {
    private final Context context;
    ArrayList<ReqViewModel> requestViewModel;
    public MyScrollViev(Context context, ArrayList<ReqViewModel> reqViewModel) {
        this.context=context;
        this.requestViewModel=reqViewModel;
    }

    @Override
    public int getCount() {
        return requestViewModel.size();
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
        View sv= LayoutInflater.from(context).inflate(R.layout.scrollviewvalues,viewGroup,false);

        TextView ITEMDETAILS,ITEMDATE,ITEMNUMBER,ITEMPRICE;
        ReqViewModel req= this.requestViewModel.get(i);

        ITEMDETAILS=sv.findViewById(R.id.itemDetails);
        ITEMNUMBER=sv.findViewById(R.id.itemNumber);
        ITEMDATE=sv.findViewById(R.id.itemDate);
        ITEMPRICE=sv.findViewById(R.id.itemPrice);

        ITEMDETAILS.setText(req.getItemDetails());
        ITEMNUMBER.setText(req.getItemNumber());
        ITEMDATE.setText(req.getItemDate());
        ITEMPRICE.setText(req.getItemPrice());

        return sv;
    }
}
