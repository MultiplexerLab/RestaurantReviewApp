package com.example.restaurantreview.Fragment;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.example.restaurantreview.Adapter.ReviewAdapter;
import com.example.restaurantreview.AddReviewActivity;
import com.example.restaurantreview.Model.Review;
import com.example.restaurantreview.R;

import java.util.ArrayList;
import java.util.List;


public class ReviewFragment extends Fragment implements View.OnClickListener {

    private List<Review> revList = new ArrayList<>();

    public ReviewFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);

        Button sort = view.findViewById(R.id.btnSort);
        sort.setOnClickListener(this);
        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(this);
        RecyclerView recyclerView = view.findViewById(R.id.RVreview);

        Review review = new Review("Name: Takeout", "Address: Banani", "000", "4.8");
        revList.add(review);
        revList.add(review);
        revList.add(review);
        revList.add(review);
        ReviewAdapter reviewAdapter = new ReviewAdapter(revList);
        recyclerView.setAdapter(reviewAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        reviewAdapter.notifyDataSetChanged();

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSort:
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_sort);
                dialog.show();
                TextView btn1 = dialog.findViewById(R.id.HtoL);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
                TextView btn2 = dialog.findViewById(R.id.LtoH);
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });

                break;
            case R.id.fab:
                Intent intent = new Intent(getActivity(), AddReviewActivity.class);
                startActivity(intent);
                break;

        }
    }
}
