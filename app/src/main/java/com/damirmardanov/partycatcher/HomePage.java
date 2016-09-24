package com.damirmardanov.partycatcher;

import android.graphics.PaintFlagsDrawFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by damir on 20.09.16.
 */
public class HomePage extends android.support.v4.app.Fragment implements View.OnClickListener{
    Button Profile;
    Button NewParty;
    Button NearbyParties;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.home_page, container, false);

        Profile = (Button) view.findViewById(R.id.profile_button);
        NewParty = (Button) view.findViewById(R.id.newparty_button);
        NearbyParties = (Button) view.findViewById(R.id.nearby_button);


        Profile.setOnClickListener(this);
        NewParty.setOnClickListener(this);
        NearbyParties.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.addToBackStack(null);
        switch (v.getId()) {
            case R.id.profile_button:
            {
                ft.add(R.id.FrameContent, new Profile()).hide(this).commit();
                break;
            }
            case R.id.newparty_button:
            {
                ft.add(R.id.FrameContent, new NewParty()).hide(this).commit();
                break;
            }
            case R.id.nearby_button:
            {
                NearbyParties mapFragment = new NearbyParties();
                ft.add(R.id.FrameContent, mapFragment).hide(this).commit();
                break;
            }
        }
    }
}
