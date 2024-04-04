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

public class Minuman extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewListMinum;
    List<Model> listdataMinum;
    ListAdapter adapter;
    public Minuman() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewListMinum = view.findViewById(R.id.rvList);
        listdataMinum = new ArrayList<>();


        Model wedang = new Model();
        wedang.setName("Kentang Goreng");
        wedang.setDesc("Campuran berbagai rempah herbal, itulah asal nama\"Uwuh\" ");
        wedang.setImage(R.drawable.wedang_uwuh);
        listdataMinum.add(wedang);

        Model bajigur = new Model();
        bajigur.setName("Bajigur");
        bajigur.setDesc("Santan, Gula Jawa dan jahe yang memberikan kehangatan");
        bajigur.setImage(R.drawable.bajigur);
        listdataMinum.add(bajigur);

        Model ronde = new Model();
        ronde.setName("Ronde");
        ronde.setDesc("Kuah jahe yang berisi gelondong yang didalam nya ada kacang nya");
        ronde.setImage(R.drawable.ronde);
        listdataMinum.add(ronde);

        Model kopi = new Model();
        kopi.setName("Kopi Josss");
        kopi.setDesc("Kopi yang di sajikan dengan arang yang menyala");
        kopi.setImage(R.drawable.kopi);
        listdataMinum.add(kopi);

        Model rujak = new Model();
        rujak.setName("Rujak Es Krim");
        rujak.setDesc("Rujak yang di beri toping es krim menambah sensasi.");
        rujak.setImage(R.drawable.rujak);
        listdataMinum.add(rujak);

        rviewListMinum.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdataMinum, getContext());
        rviewListMinum.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    public void onItemClick(View view, int position) {

    }
}
