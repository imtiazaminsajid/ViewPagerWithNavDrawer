package com.example.beatniktechnology.nav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSix extends Fragment {

    static FragmentSix instance;

    public FragmentSix() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_six, container, false);
        return view;
    }

    public static FragmentSix getInstance() {
        if (instance == null)
            instance = new FragmentSix();
        return instance;
    }

}
