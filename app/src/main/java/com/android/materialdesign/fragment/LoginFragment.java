package com.android.materialdesign.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.materialdesign.R;

/**
 * Created by vishal.kumar1 on 26/10/16.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    Button loginWithEmail;

    public LoginFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login,container,false);
        loginWithEmail =(Button) view.findViewById(R.id.login_with_Email);
        loginWithEmail.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_with_Email:
                Log.d("Email","Email");
        }
    }
}
