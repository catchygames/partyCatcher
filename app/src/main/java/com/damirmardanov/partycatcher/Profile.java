package com.damirmardanov.partycatcher;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

/**
 * Created by damir on 20.09.16.
 */
public class Profile extends android.support.v4.app.Fragment /*implements View.OnClickListener*/ {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.profile, container, false);

        return view;
    }
}
