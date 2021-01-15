package com.masai_technology.findmycar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai_technology.findmycar.viewholder.LocationViewHolder;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationViewHolder> {
    private ArrayList<LocationHelper> modelList;

    public LocationAdapter(ArrayList<LocationHelper> modelList){
        this.modelList=new ArrayList<>();
        this.modelList.addAll(modelList);
    }


    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        LocationHelper model=modelList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }



}

