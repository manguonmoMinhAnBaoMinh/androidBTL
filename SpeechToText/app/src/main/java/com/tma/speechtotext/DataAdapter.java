package com.tma.speechtotext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<Data> dataList;

    public DataAdapter(Context context, int layout, List<Data> dataList) {
        this.context = context;
        this.layout = layout;
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtdata = (TextView) view.findViewById(R.id.textViewHoTenCustom);
            holder.imgDelete = (ImageView) view.findViewById(R.id.imageviewdel);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        Data data = dataList.get(i);
        holder.txtdata.setText(data.getDATA());
        return view;
    }//xnxx.com

    private class ViewHolder{
        TextView txtdata;
        ImageView imgDelete;
    }//pornhub.es


}
