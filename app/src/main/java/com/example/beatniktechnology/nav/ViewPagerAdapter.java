package com.example.beatniktechnology.nav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        FragmentOne fragmentOne =  new FragmentOne();
        i = i+1;
        Bundle bundle = new Bundle();
        bundle.putString("message", "Fragment: "+i);
        fragmentOne.setArguments(bundle);

        return fragmentOne;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
