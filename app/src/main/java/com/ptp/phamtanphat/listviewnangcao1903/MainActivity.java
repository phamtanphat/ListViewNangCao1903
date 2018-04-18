package com.ptp.phamtanphat.listviewnangcao1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonan;
    MonanAdapter monanAdapter;
    ArrayList<Monan> mangmonan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonan = findViewById(R.id.listviewmonan);
        mangmonan = new ArrayList<>();
        //anonymosclass
        mangmonan.add(new Monan(1,R.drawable.bunbo,"Bun bo Hue",35000));
        mangmonan.add(new Monan(2,R.drawable.bunthitnuong,"Bun thit nuong",25000));
        mangmonan.add(new Monan(3,R.drawable.comsuon,"Com suon",22000));
        mangmonan.add(new Monan(4,R.drawable.tauhuky,"Tau hu ky",30000));
        mangmonan.add(new Monan(5,R.drawable.thitech,"Ech kho",40000));
        mangmonan.add(new Monan(6,R.drawable.trangmieng,"Trang mieng",15000));
        mangmonan.add(new Monan(7,R.drawable.trangmieng1,"Trang mieng 1",18000));
        mangmonan.add(new Monan(8,R.drawable.xienque,"Xien que",5000));

        monanAdapter = new MonanAdapter(mangmonan,MainActivity.this);
        lvMonan.setAdapter(monanAdapter);

//        Bai tap ve nha : listview nang cao cho du lieu gi do
//            + Moi item so co 1 button cho xoa du lieu
    }
}
