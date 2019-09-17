package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RequisitionFormTwoListView extends BaseAdapter {

    ArrayList<String> proNumber;
    ArrayList<String> proDates;
    ArrayList<String> proPrices;
    ArrayList<String> proDescriptions;
    Context context;
    RequisitionFormTwoListView(Context context, ArrayList<String> productNumber, ArrayList<String> productDate, ArrayList<String> productPrice, ArrayList<String> productDescription){
        this.proNumber=productNumber;
        this.proDates=productDate;
        this.proPrices=productPrice;
        this.proDescriptions=productDescription;
        this.context=context;
    }

    @Override
    public int getCount() {
        return proNumber.size();
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
        View view1= LayoutInflater.from(context).inflate(R.layout.requisition_list_display,parent,false);


        TextView proNum,proDate,proRate,proInfo;
        ImageView imageView;

        proNum=view1.findViewById(R.id.productNumber);
        proDate=view1.findViewById(R.id.productDate);
        proRate=view1.findViewById(R.id.productPrice);
        proInfo=view1.findViewById(R.id.productDesc);
        imageView=view1.findViewById(R.id.imageView10);

        proNum.setText(proNumber.get(i));
        proDate.setText(proDates.get(i));
        proRate.setText(proPrices.get(i));
        proInfo.setText(proDescriptions.get(i));
        imageView.setImageResource(R.drawable.equal);

        return view1;
    }
}
