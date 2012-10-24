/*
 * SiphonPagerAdapter.java
 * Make Coffee
 * Created By : Kyle McCurry
 * Date : 24 October 2012
 * Copyright (c) Kyle McCurry. All rights reserved.
 */

package com.make.coffee;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class SiphonPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
 
    public SiphonPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context=context;
 
        }
    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        // Each position is a tab that can be swiped to. So each tab has a different layout
        switch(position){
        case 0:
            f=Siphon_Activity_1.newInstance(_context);
            break;
        case 1:
            f=Siphon_Activity_2.newInstance(_context);
            break;
        case 2:
            f=Siphon_Activity_3.newInstance(_context);
            break;
        }
        return f;
    }
    @Override
    public int getCount() {
    	// Returns the total number of screens
        return 3;
    }
}