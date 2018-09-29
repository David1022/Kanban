package com.davidmendano.kanban.Repos;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ReposExplorerHolder extends RecyclerView.ViewHolder {

    RecyclerItemComponent component;

    public ReposExplorerHolder(View itemView) {
        super(itemView);
        component = new RecyclerItemComponent(itemView.getContext());
    }

    public void bindModel(ExplorerItemModel model) {
        component.setupData(model);
    }

    public void setListener(View.OnClickListener listener) {
        component.setListener(listener);
    }

}
