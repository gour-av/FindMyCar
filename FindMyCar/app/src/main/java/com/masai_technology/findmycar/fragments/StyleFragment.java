package com.masai_technology.findmycar.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.masai_technology.findmycar.R;
import com.masai_technology.findmycar.activities.MapsActivity;
import com.masai_technology.findmycar.activities.RetrieveMapsActivity;


public class StyleFragment extends Fragment {

   TextView pos;
   TextView saved_car,tv_chronology;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_style, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pos = view.findViewById(R.id.tv_find_car_style);
          pos.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent = new Intent(getActivity(), MapsActivity.class);
                  startActivity(intent);
              }
          });
          saved_car = view.findViewById(R.id.tv_save_position);
          saved_car.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent = new Intent(getActivity(), RetrieveMapsActivity.class);
                  startActivity(intent);
              }
          });
       tv_chronology  = view.findViewById(R.id.tv_chronology);
        tv_chronology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChronologyFragment chronologyFragment  = new ChronologyFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame, chronologyFragment, "ChronologyFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });



    }
}