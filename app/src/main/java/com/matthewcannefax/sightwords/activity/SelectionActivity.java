package com.matthewcannefax.sightwords.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.matthewcannefax.sightwords.R;

public class SelectionActivity extends AppCompatActivity {
    private RecyclerView rvWordGroupList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        rvWordGroupList = findViewById(R.id.rvWordGroupList);
    }
}
