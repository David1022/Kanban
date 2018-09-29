package com.davidmendano.kanban.Loggin;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.davidmendano.kanban.BaseActivity;
import com.davidmendano.kanban.R;
import com.davidmendano.kanban.Repos.ReposActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Class to manage the loggin view
 */

public class LauncherActivity extends BaseActivity implements LoginCallback{

    @BindView(R.id.user)
    AutoCompleteTextView mUserView;

    @BindView(R.id.password)
    EditText mPasswordView;

    @BindView(R.id.login_progress)
    View mProgressView;

    @BindView(R.id.login_form)
    View mLoginFormView;

    @BindView(R.id.sign_in_button)
    Button mSignInButton;

    LoginBusinessLogicInterface loginBL;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        ButterKnife.bind(this);
    }

    @Override
    protected void initializeData() {
        super.initializeData();

         loginBL = new LoginBusinessLogic(this);

        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE || id == EditorInfo.IME_NULL) {
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });
    }

    private void attemptLogin() {
        loginBL.attemptToLogin(mUserView.getText().toString(), mPasswordView.getText().toString());
    }


    @Override
    public void succesfullyLoged() {
        startActivity(new Intent(this, ReposActivity.class));
    }
}
