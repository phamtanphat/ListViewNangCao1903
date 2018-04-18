package com.ptp.phamtanphat.listviewnangcao1903;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 18/4/2018.
 */

public class MonanAdapter extends BaseAdapter {
    ArrayList<Monan> mangmonan;
    Context context;

    public MonanAdapter(ArrayList<Monan> mangmonan , Context context) {
        this.mangmonan = mangmonan;
        this.context = context;
    }

    //Tra ve so luong item duoc ve len listview
    @Override
    public int getCount() {
        return mangmonan.size();
    }

    //Tra ve du lieu monan tai vi tri position
    @Override
    public Object getItem(int position) {
        return mangmonan.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Gan layout vao cho adapter
        //Nhan vao layout => man hinh de hien thi
        LayoutInflater inflater = LayoutInflater.from(context);
        //Con tro chuot dung de di den cac view trong layout
        convertView = inflater.inflate(R.layout.dong_mon_an,null);

        TextView txtTen = convertView.findViewById(R.id.textviewitemtenmonan);
        TextView txtGia = convertView.findViewById(R.id.textviewitemgiamonan);
        ImageView img = convertView.findViewById(R.id.imageviewitemmonan);

        //Tra ve gia tri cua monan tai moi item
        Monan monan = (Monan) getItem(position);

        txtTen.setText(monan.getTenmonan());
        txtGia.setText("Gia : " +monan.getGiamonan());
        img.setImageResource(monan.getHinhanh());

        return convertView;
    }

}
