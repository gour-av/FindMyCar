package com.masai_technology.findmycar.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.masai_technology.findmycar.R;
import com.masai_technology.findmycar.activities.MapsActivity;
import com.masai_technology.findmycar.activities.RetrieveMapsActivity;

public class LeatherFragment extends Fragment {

    ImageView find_car_leather,Save_Car_leather;


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
        return inflater.inflate(R.layout.fragment_leather, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        find_car_leather = view.findViewById(R.id.img_leather_find_car);
        find_car_leather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
            }
        });
        Save_Car_leather = view.findViewById(R.id.img_leather_save);
        Save_Car_leather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RetrieveMapsActivity.class);
                startActivity(intent);

            }
        });
    }
}