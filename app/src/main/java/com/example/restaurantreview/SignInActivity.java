package com.example.restaurantreview;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    TextView signInText;
    Typeface tajawalMedFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signInText = findViewById(R.id.tvSignIn);
        tajawalMedFont = Typeface.createFromAsset(this.getAssets(),"fonts/Tajawal-Medium.ttf");
        signInText.setTypeface(tajawalMedFont);

    }

    public void btnFb(View view) {
        Intent intent = new Intent(SignInActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void btnGoogle(View view) {
        Intent intent = new Intent(SignInActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
