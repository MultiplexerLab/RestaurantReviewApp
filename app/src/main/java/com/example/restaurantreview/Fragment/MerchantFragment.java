package com.example.restaurantreview.Fragment;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.restaurantreview.Adapter.MerchantAdapter;
import com.example.restaurantreview.Model.Merchant;
import com.example.restaurantreview.R;

import java.util.ArrayList;
import java.util.List;


public class MerchantFragment extends Fragment implements View.OnClickListener {

    private List<Merchant> merList = new ArrayList<>();


    public MerchantFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_merchant, container, false);

        Button request = view.findViewById(R.id.requestbtn);
        request.setOnClickListener(this);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        Merchant merchant = new Merchant("Name: Takeout", "Rating: 4.8", "Total Trainee: 34", "Training Started: 12th Jan 2019", "Training Ended: 12th Apr 2019");
        merList.add(merchant);
        merList.add(merchant);
        merList.add(merchant);
        merList.add(merchant);
        MerchantAdapter merchantAdapter = new MerchantAdapter(merList);
        recyclerView.setAdapter(merchantAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        merchantAdapter.notifyDataSetChanged();
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.requestbtn:
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_request);
                dialog.show();
                Button btn = dialog.findViewById(R.id.submit);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });

                break;

        }
    }
}
