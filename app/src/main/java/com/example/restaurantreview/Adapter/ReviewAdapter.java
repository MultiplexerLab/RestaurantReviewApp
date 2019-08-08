package com.example.restaurantreview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantreview.Model.Review;
import com.example.restaurantreview.R;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    List<Review> revList;


    public ReviewAdapter(List<Review> List) {

        this.revList = List;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_review, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Review review = revList.get(i);

        viewHolder.name.setText(review.getName());
        viewHolder.rating.setText(review.getRating());
        viewHolder.address.setText(review.getAddress());

    }

    @Override
    public int getItemCount() {
        return revList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView name, address, rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.imgR);
            name = itemView.findViewById(R.id.nameR);
            rating = itemView.findViewById(R.id.ratingR);
            address = itemView.findViewById(R.id.addressR);
        }
    }
}
