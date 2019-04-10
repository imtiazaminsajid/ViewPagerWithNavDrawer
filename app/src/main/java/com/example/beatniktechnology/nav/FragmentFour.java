package com.example.beatniktechnology.nav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFour extends Fragment {

    static FragmentFour instance;


    public FragmentFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_four, container, false);
        return view;
    }

    public static FragmentFour getInstance() {
        if (instance == null)
            instance = new FragmentFour();
        return instance;
    }

}
