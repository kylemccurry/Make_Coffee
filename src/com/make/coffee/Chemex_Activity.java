/*
 * Chemex_Activity.java
 * Make Coffee
 * Created By : Kyle McCurry
 * Date : 24 October 2012
 * Copyright (c) Kyle McCurry. All rights reserved.
 */

package com.make.coffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;


public class Chemex_Activity extends FragmentActivity {
	private ViewPager _mViewPager;
	private ChemexPagerAdapter _adapter;
    Intent intent;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemex_layout);
        
        setUpView();
        setTab();
        
        
    }
    
    private void setUpView(){
        _mViewPager = (ViewPager) findViewById(R.id.viewPager);
        _adapter = new ChemexPagerAdapter(getApplicationContext(),getSupportFragmentManager());
        _mViewPager.setAdapter(_adapter);
        _mViewPager.setCurrentItem(0);
       }
    
    private void setTab(){
    	_mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
 
	        public void onPageScrollStateChanged(int position) {}
	        public void onPageScrolled(int arg0, float arg1, int arg2) {}
	        public void onPageSelected(int position) {
	        // Changes which tab is highlighted
	              
	        }
        });
    }
    
}