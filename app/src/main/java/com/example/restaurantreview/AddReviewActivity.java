package com.example.restaurantreview;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class AddReviewActivity extends AppCompatActivity {

    RatingBar simpleRatingBar;
    Dialog dlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);
        simpleRatingBar = findViewById(R.id.simpleRatingBar);
    }

    public void btnReview(View view) {
        finish();
    }

    public void btnRate(View view) {
        dlog = new Dialog(this);
        dlog.setContentView(R.layout.custom_rating_dialog);
        Button dialogButton = dlog.findViewById(R.id.btn_submit);
        simpleRatingBar = findViewById(R.id.simpleRatingBar);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*float rating = simpleRatingBar.getRating();
                Toast.makeText(getApplicationContext(),"You have Rated "+rating,Toast.LENGTH_SHORT).show();*/
                    dlog.dismiss();

            }
        });
        dlog.show();

    }
}
