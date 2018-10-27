package com.example.pc.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.FrameLayout;

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    private Context context;

    public PageAdapter(FragmentManager fm,Context context, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.context = context;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                FragmentPage1 tab1 = new FragmentPage1();
                return tab1;
            case 1:
                FragmentPage2 tab2 = new FragmentPage2();
                return tab2;
            case 2:
                FragmentPage3 tab3 = new FragmentPage3();
                return  tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
