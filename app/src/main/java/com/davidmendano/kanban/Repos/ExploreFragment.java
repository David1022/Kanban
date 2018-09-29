package com.davidmendano.kanban.Repos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidmendano.kanban.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExploreFragment extends Fragment {

    @BindView(R.id.explore_recycler)
    RecyclerView mRecyclerView;


    public ExploreFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        ButterKnife.bind(this, view);

        initializeData();
        return view;
    }

    private void initializeData() {
        ReposExplorerAdapter adapter = new ReposExplorerAdapter(getContext(), getFakeList());

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    public List<ExplorerItemModel> getFakeList() {
        List<ExplorerItemModel> fakeList = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            fakeList.add(new ExplorerItemModel("Repo " + i, "Author " + i));
        }

        return fakeList;
    }
}
