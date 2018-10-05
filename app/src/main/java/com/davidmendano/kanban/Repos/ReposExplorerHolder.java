package com.davidmendano.kanban.Repos;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.davidmendano.kanban.R;

public class ReposExplorerHolder extends RecyclerView.ViewHolder {

    RecyclerItemComponent component;

    public ReposExplorerHolder(View itemView) {
        super(itemView);
        component = itemView.findViewById(R.id.item);
    }

    public void bindModel(ExplorerItemModel model) {
        component.setupData(model);
    }

    public void setListener(View.OnClickListener listener) {
        component.setListener(listener);
    }

}
