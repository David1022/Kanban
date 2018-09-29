package com.davidmendano.kanban.Repos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

import com.davidmendano.kanban.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Class to manage the repos view. Will show a list of allowed repos
 */

public class ReposActivity extends FragmentActivity {

    @BindView(android.R.id.tabhost)
    FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos);
        ButterKnife.bind(this);
        fillViews();
    }

    protected void fillViews() {
        mTabHost.setup(this,
                getSupportFragmentManager(), android.R.id.tabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getResources().getString(R.string.explore)),
                ExploreFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getResources().getString(R.string.local)),
                LocalFragment.class, null);
    }
}
