package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyRecyclerListAdapter extends RecyclerView.Adapter {
    String titles[]={},dates[]={},status[]={};
    private Context context;
    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] statusTitle) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.status=statusTitle;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_display,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder , int position) {
        MyRecyclerListAdapter.MyViewHolder myViewHolder = (MyRecyclerListAdapter.MyViewHolder) viewHolder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(status[position]));
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,date,statusTitle;
        public ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
            date=itemView.findViewById(R.id.date);
            statusTitle=itemView.findViewById(R.id.statusTitle);
            imageView=itemView.findViewById(R.id.imageView8);
        }

        public void setUpData(String titles, String dates, String status) {
            title.setText(titles);
            date.setText(dates);
            statusTitle.setText( status);
            imageView.setImageResource(R.drawable.notification);
        }
    }
}
