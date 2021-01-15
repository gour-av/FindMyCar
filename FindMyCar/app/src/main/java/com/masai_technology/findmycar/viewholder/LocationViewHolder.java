package com.masai_technology.findmycar.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai_technology.findmycar.LocationHelper;
import com.masai_technology.findmycar.R;

import java.text.NumberFormat;

public class LocationViewHolder  extends RecyclerView.ViewHolder {

    private TextView tv_Lat,tv_Long;


    public LocationViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        tv_Lat = itemView.findViewById(R.id.tv_lat_locate);
        tv_Long = itemView.findViewById(R.id.tv_long_locate);

    }

    public void setData(LocationHelper model) {
        Double lat = (model.getLatitude());
        Double longit =  model.getLongitude();
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        tv_Lat.setText(numberFormat.format(lat));
        tv_Long.setText((numberFormat.format(longit)));

    }



}

