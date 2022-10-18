package com.iset.loginsys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void goToDetailsActivity (View view){
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
        finish();
    }
}