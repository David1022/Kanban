package com.davidmendano.kanban.Repos;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.davidmendano.kanban.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerItemComponent extends ConstraintLayout {

    @BindView(R.id.repo_name)
    TextView mRepoName;

    @BindView(R.id.repo_author)
    TextView mRepoAuthor;

    @BindView(R.id.repo_add_new)
    ImageView mIconAdd;

    public RecyclerItemComponent(Context context) {
        super(context);
        init();
    }

    public RecyclerItemComponent(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RecyclerItemComponent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.recycler_item_component, this);
        ButterKnife.bind(this);
    }

    public void setupData(ItemComponentModelInterface model) {
        mRepoName.setText(model.getRepoName());
        mRepoAuthor.setText(model.getRepoAuthor());
    }

    public void setListener(OnClickListener listener) {
        mIconAdd.setOnClickListener(listener);
    }
}
