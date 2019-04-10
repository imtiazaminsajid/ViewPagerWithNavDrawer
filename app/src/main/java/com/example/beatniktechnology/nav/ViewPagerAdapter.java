package com.example.beatniktechnology.nav;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

//        FragmentOne fragmentOne =  new FragmentOne();
//        FragmentTwo fragmentTwo = new FragmentTwo();
//        FragmentFour fragmentFour = new FragmentFour();
        //i = i+1;

//        Bundle bundle = new Bundle();
//        bundle.putString("message", "Fragment: "+i);
//        fragmentOne.setArguments(bundle);

        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentTitle.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
//        position = position+1;
//        String name = null;
//        switch (position){
//            case 1:{
//                return "Imtiaz";
//            }
//
//            case 2:{
//                return "Amin";
//            }
//
//            case 3:{
//                return "Sajid";
//            }
//
//
//
//        }
//        if (position == 1){
//            name = "Imtiaz";
//        }
//        else if (position == 2){
//            name = "sajid";
//        } else {
//            name = "Amin";
//        }
//        return name;

    }
}
