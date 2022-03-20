package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGoods);

        arrayList= new ArrayList<>();
        arrayList.add(new Goods("Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.donut_yellow_1,R.drawable.plus_button));
        arrayList.add(new Goods("Pink Donut","Spicy tasty donut family","$20.00", R.drawable.tasty_donut_1,R.drawable.plus_button));
        arrayList.add(new Goods("Floating Donut","Spicy tasty donut family","$30.00",R.drawable.green_donut_1,R.drawable.plus_button));
        arrayList.add(new Goods("Tasty Donut",R.drawable.donut_red_1));

        adt = new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);

       Button button = (Button) findViewById(R.id.btndonut);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(button.isEnabled())
                    button.setBackgroundColor(getResources().getColor(R.color.black));
                else
                    button.setBackgroundColor(getResources().getColor(R.color.white));
            }

        });

//        lvGoods.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if(i==0) {
//                    Intent intent=new Intent();
//                    intent.setClass(MainActivity.this,MainActivityb.class);
//                    startActivity(intent);
//                }
//            }
//        });
    }
}