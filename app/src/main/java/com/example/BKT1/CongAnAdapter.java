package com.example.BKT1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a2050531200246_doanthaiphien_baiktth1.R;

import java.util.List;

public class CongAnAdapter extends BaseAdapter {
    private Activity activity;
    private List<CongAn> items;

    public CongAnAdapter(Activity activity, List<CongAn> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.layout_congan, null);
        TextView tvName = (TextView) view.findViewById(R.id.tencasi);
        TextView tvNgheDanh = (TextView) view.findViewById(R.id.nghedanhcasi);
        TextView tvLuotThich = (TextView) view.findViewById(R.id.soluotthich);
        ImageView imageView = (ImageView) view.findViewById(R.id.hinhcasi);
        tvName.setText(items.get(i).getTen());
        tvNgheDanh.setText(items.get(i).getNoiCongTac()+" - "+ items.get(i).getCapBac()+" - "+items.get(i).getQuocGia());
        tvLuotThich.setText(String.valueOf(items.get(i).getSoSaoBinhChon()));
        imageView.setImageResource(items.get(i).getHinhAnh());
        return view;
    }
}
