package com.damirmardanov.partycatcher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by damir on 20.09.16.
 */
public class NearbyParties extends android.support.v4.app.Fragment /*implements View.OnClickListener*/ {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.nearby_parties, container, false);

        return view;
    }
}
