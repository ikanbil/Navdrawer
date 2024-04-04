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

public class Jajan extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewList;
    List<Model> listdatamakan;
    ListAdapter adapter;

    public Jajan() {
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


        Model bakso = new Model();
        bakso.setName("Bakso");
        bakso.setDesc("Kalau Bakso malvinas juara nya");
        bakso.setImage(R.drawable.bakso);
        listdatamakan.add(bakso);

        Model indomie = new Model();
        indomie.setName("Indomie");
        indomie.setDesc("Indomie rendang paling favorite");
        indomie.setImage(R.drawable.indomie);
        listdatamakan.add(indomie);

        Model nasgor = new Model();
        nasgor.setName("Nasi Goreng");
        nasgor.setDesc("Nasi goreng ortega mantap");
        nasgor.setImage(R.drawable.nasgor);
        listdatamakan.add(nasgor);

        Model gorengan = new Model();
        gorengan.setName("Gorengan");
        gorengan.setDesc("Cireng, Mendoan, Tahu paling mantap");
        gorengan.setImage(R.drawable.gorengan);
        listdatamakan.add(gorengan);

        Model ayam = new Model();
        ayam.setName("Ayam Goreng");
        ayam.setDesc("Ayam goreng pastii");
        ayam.setImage(R.drawable.ayam);
        listdatamakan.add(ayam);

        Model sosis = new Model();
        sosis.setName("Sosis");
        sosis.setDesc("Kenzlerr sihh");
        sosis.setImage(R.drawable.sosis);
        listdatamakan.add(sosis);

        Model kambing = new Model();
        kambing.setName("Gulai Kaki Kambing");
        kambing.setDesc("Bersantan pedas mantap");
        kambing.setImage(R.drawable.gulai);
        listdatamakan.add(kambing);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdatamakan, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onItemClick(View view, int position) {
    }
}