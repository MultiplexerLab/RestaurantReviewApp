package com.example.restaurantreview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantreview.Model.Merchant;
import com.example.restaurantreview.R;

import java.util.List;

public class MerchantAdapter extends RecyclerView.Adapter<MerchantAdapter.ViewHolder>  {

    List<Merchant> merList;


    public MerchantAdapter(List<Merchant> List) {

        this.merList = List;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_merchant, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Merchant merchant = merList.get(i);

        viewHolder.name.setText(merchant.getName());
        viewHolder.rate.setText(merchant.getRating());
        viewHolder.numTrainee.setText(merchant.getNumTrainee());
        viewHolder.startTime.setText(merchant.getStartTime());
        viewHolder.endTime.setText(merchant.getEndTime());
    }

    @Override
    public int getItemCount() {
        return merList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView logo;
        TextView name, rate, startTime, endTime, numTrainee;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            rate = itemView.findViewById(R.id.rating);
            startTime = itemView.findViewById(R.id.trainingStart);
            endTime = itemView.findViewById(R.id.trainingEnd);
            numTrainee = itemView.findViewById(R.id.totalTrainee);

        }
    }
}
