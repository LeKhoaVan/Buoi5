package com.example.listview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;


public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layout;
    ArrayList<Goods> arrayList;
    ConstraintLayout layoutitem;


    public CustomGoodsAdapter(Context ctx, int layout, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;

    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        final Goods goods= arrayList.get(i);
        view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);

        TextView txt1= view.findViewById(R.id.txt1);
        TextView txt2 = view.findViewById(R.id.txt2);
        TextView txt3= view.findViewById(R.id.txt3);
        ImageView img = view.findViewById(R.id.img);
        ImageView img2=view.findViewById(R.id.img2);



        txt1.setText(arrayList.get(i).getName());
        txt2.setText(arrayList.get(i).getTxt1());
        txt3.setText(arrayList.get(i).getGia());
        img.setImageResource(arrayList.get(i).getImg1());
        img2.setImageResource(arrayList.get(i).getImg2());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0) {
                    onClickActivityB(goods);
                }
            }
        });




        return view;
    }

    public void onClickActivityB(Goods goods) {
        Intent intent = new Intent(ctx,MainActivityb.class);
        ctx.startActivity(intent);
    }




}
