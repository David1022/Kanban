package com.davidmendano.kanban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Class to manage the repos view. Will show a list of allowed repos
 */

public class ReposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos);
    }
}
