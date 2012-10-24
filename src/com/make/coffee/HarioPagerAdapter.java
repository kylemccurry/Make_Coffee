/*
 * ViewPagerActivity.java
 * Feed Cost Calculator
 * Created By : Daniel Jamison
 * Date : August 03, 2012
 * Copyright (c) 2012 South Dakota State University. All rights reserved.
 */

package com.make.coffee;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class HarioPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
 
    public HarioPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context=context;
 
        }
    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        // Each position is a tab that can be swiped to. So each tab has a different layout
        switch(position){
        case 0:
            f=Hario_Activity_1.newInstance(_context);
            break;
        case 1:
            f=Hario_Activity_2.newInstance(_context);
            break;
        case 2:
            f=Hario_Activity_3.newInstance(_context);
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