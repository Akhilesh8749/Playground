package com.example.login;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
public class MyListAdapter extends BaseAdapter {
    String titles[]={},dates[]={},statusTitles[]={};
    private Context context;
    public MyListAdapter(Context context, String[] title, String[] date, String[] statusTitle) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.statusTitles=statusTitle;
    }
    @Override
    public int getCount() {
        return titles.length;
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
        TextView title,date,statusTitle;
        title=view.findViewById(R.id.title);
        date=view.findViewById(R.id.date);
        statusTitle=view.findViewById(R.id.statusTitle);

        title.setText(String.valueOf(titles[position]));
        date.setText(String.valueOf(dates[position]));
        statusTitle.setText(String.valueOf(statusTitles[position]));
        return view;
    }
}