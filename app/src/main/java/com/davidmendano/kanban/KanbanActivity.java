package com.davidmendano.kanban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Class to manage the kanban board view. Will show the issues for each panel
 *
 *
 *
 * I have no time to finish this screen so I try to explain what I thought to solve.
 * This class will comunicate with its businessLogic by an interface (like in login activity) to get the data to fill its view
 *
 * The business logic will manage all the logic to get, update, etc kanban from(or to) github
 *
 * The business logic will comunicate the end of its business logic by a callback interface
 *
 * P.S.: The layout is a copy of the default layout from tabbedActivity
 */

public class KanbanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanban);
    }
}
