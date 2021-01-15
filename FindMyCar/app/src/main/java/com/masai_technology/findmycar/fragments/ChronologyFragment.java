package com.masai_technology.findmycar.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masai_technology.findmycar.LocationAdapter;
import com.masai_technology.findmycar.LocationHelper;
import com.masai_technology.findmycar.R;

import java.util.ArrayList;


public class ChronologyFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<LocationHelper> modelList=new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chronology, container, false);
        recyclerView=view.findViewById(R.id.recycler_view);
        buildModelList();
        setRecyclerViewAdapter();
        return view;
    }

    private void setRecyclerViewAdapter() {
        LocationAdapter locationAdapter=new LocationAdapter(modelList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(locationAdapter);
    }

    private void buildModelList() {
        modelList.add(new LocationHelper(86.7322,23.7727));
        modelList.add(new LocationHelper(89.7322,25.7727));
        modelList.add(new LocationHelper(83.7322,21.7727));
        modelList.add(new LocationHelper(82.7322,20.7727));
        modelList.add(new LocationHelper(81.7322,19.7727));
        modelList.add(new LocationHelper(12.7322,23.7727));
        modelList.add(new LocationHelper(86.7322,22.7727));
    }
}