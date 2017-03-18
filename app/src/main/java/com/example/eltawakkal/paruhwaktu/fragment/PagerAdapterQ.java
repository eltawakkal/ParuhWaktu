package com.example.eltawakkal.paruhwaktu.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by eltawakkal on 3/17/17.
 */

public class PagerAdapterQ extends FragmentStatePagerAdapter {

    int pageNumb;

    public PagerAdapterQ(FragmentManager fm, int pageNumb) {
        super(fm);
        this.pageNumb = pageNumb;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                tabProfil tabProfil = new tabProfil();
                return tabProfil;
            case 1:
                tabChat tabChat = new tabChat();
                return tabChat;
            case 2:
                tabHome tabHome = new tabHome();
                return tabHome;
            case 3:
                tabBookMark tabBookMark = new tabBookMark();
                return tabBookMark;
            case 4:
                tabSetting tabSetting = new tabSetting();
                return tabSetting;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return pageNumb;
    }
}
