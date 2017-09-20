package com.somthing.amarguriya.programming;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class NumberSystemContainer extends AppCompatActivity {
    TextView textView;
    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_container);
        Toolbar toolbar = (Toolbar) findViewById(R.id.programContainerToolbar);
        toolbar.setTitle("Program");
        toolbar.getDrawingCacheBackgroundColor();
        toolbar.setTitleTextColor(Color.parseColor("#7b1fa2"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView = (TextView) findViewById(R.id.program);
        Intent i = getIntent();
        String data = i.getStringExtra("data");
        textView.setText(data);
    }
}
