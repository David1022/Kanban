package com.davidmendano.kanban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Class to manage the kanban board view. Will show the issues for each panel
 */

public class KanbanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanban);
    }
}
