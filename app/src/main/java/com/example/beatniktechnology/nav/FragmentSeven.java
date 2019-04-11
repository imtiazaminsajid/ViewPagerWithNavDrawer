package com.example.beatniktechnology.nav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSeven extends Fragment {

    static FragmentSeven instance;

    public FragmentSeven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_seven, container, false);
    }

    public static FragmentSeven getInstance() {
        if (instance == null)
            instance = new FragmentSeven();
        return instance;
    }

}
