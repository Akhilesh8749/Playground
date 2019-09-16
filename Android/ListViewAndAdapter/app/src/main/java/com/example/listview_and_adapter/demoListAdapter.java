package com.example.listview_and_adapter;

import android.content.Context;

import java.util.ArrayList;

public class demoListAdapter {

    private final Context context;
    ArrayList<String> proNum;// = new ArrayList<>();
    ArrayList<String> proDate;// = new ArrayList<>();
    ArrayList<String> proStatus;// = new ArrayList<>();
    demoListAdapter(Context context, ArrayList<String> productNumber, ArrayList<String> date, ArrayList<String> status) {
        this.context=context;
        this.proNum=productNumber;
        this.proDate=date;
        this.proStatus=status;
    }

}
