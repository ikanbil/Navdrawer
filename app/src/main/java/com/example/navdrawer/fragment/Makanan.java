package com.example.navdrawer.fragment;

// HomeFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;
import com.example.navdrawer.ListAdapter;
import com.example.navdrawer.R;
import com.example.navdrawer.Model;

import java.util.ArrayList;
import java.util.List;

public class Makanan extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewList;
    List<Model> listdatamakan;
    ListAdapter adapter;

    public Makanan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewList = view.findViewById(R.id.rvList2);
        listdatamakan = new ArrayList<>();


        Model gudeg = new Model();
        gudeg.setName("Gudeg");
        gudeg.setDesc("Gudeg terbuat dari nangka muda");
        gudeg.setImage(R.drawable.gudeg);
        listdatamakan.add(gudeg);

        Model bakpia = new Model();
        bakpia.setName("Bakpia");
        bakpia.setDesc("Bakpia pathok kue berbentuk bulat pipih,");
        bakpia.setImage(R.drawable.bakpia);
        listdatamakan.add(bakpia);

        Model kipo = new Model();
        kipo.setName("Kipo");
        kipo.setDesc("Kue kipo adalah kue berwarna hijau");
        kipo.setImage(R.drawable.kipo);
        listdatamakan.add(kipo);

        Model mie = new Model();
        mie.setName("Mie Lethek");
        mie.setDesc("Olahan Mie yang pengolahan nya yang masih tradisional dengan menggunakan bantuan sapi ");
        mie.setImage(R.drawable.mie);
        listdatamakan.add(mie);

        Model brongkos = new Model();
        brongkos.setName("Brongkos");
        brongkos.setDesc("Brongkos adalah sejenis makanan daging dan kacang berkuah bumbu keluak");
        brongkos.setImage(R.drawable.brongkos);
        listdatamakan.add(brongkos);

        Model tiwul = new Model();
        tiwul.setName("Tiwul");
        tiwul.setDesc("Thiwul , dapat dimakan bersama kelapa parut yang telah diberi garam sedikit");
        tiwul.setImage(R.drawable.tiwul);
        listdatamakan.add(tiwul);

        Model gatot = new Model();
        gatot.setName("Gatot");
        gatot.setDesc("Gatot adalah penganan kukus, dimakan dengan parutan kelapa.");
        gatot.setImage(R.drawable.gatot);
        listdatamakan.add(gatot);

        Model sate = new Model();
        sate.setName("Sate Klatak");
        sate.setDesc("kegiatan membakar sate di pembakaran terbuka disebut \"klathak\". ");
        sate.setImage(R.drawable.sate);
        listdatamakan.add(sate);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdatamakan, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onItemClick(View view, int position) {
    }
}
