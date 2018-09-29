package com.davidmendano.kanban;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Base activity with main methods to implement
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initializeData();
        fetchData();
        fillViews();
    }

    protected void initializeData() {
    }

    protected void fillViews() {
    }

    protected void fetchData() {
    }
}
