package com.davidmendano.kanban.Repos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidmendano.kanban.R;

import java.util.List;

public class ReposExplorerAdapter extends RecyclerView.Adapter {

    List<ExplorerItemModel> mList;
    LayoutInflater inflater;

    public ReposExplorerAdapter(Context context, List<ExplorerItemModel> list) {
        inflater = LayoutInflater.from(context);
        this.mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, viewGroup, false);
        return new ReposExplorerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ReposExplorerHolder reposHolder = (ReposExplorerHolder) holder;
        reposHolder.bindModel(mList.get(position));
        reposHolder.setListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextScreen();
            }
        });
    }

    private void goToNextScreen() {
        //Take the model of the item clicked and launch the next screen passing the model
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
