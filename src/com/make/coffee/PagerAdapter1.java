/*
 * PagerAdapter1.java
 * Make Coffee
 * Created By : Kyle McCurry
 * Date : 24 October 2012
 * Copyright (c) Kyle McCurry. All rights reserved.
 */

package com.make.coffee;

import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
* The <code>PagerAdapter</code> serves the fragments when paging.
* @author mwho
*/
public class PagerAdapter1 extends FragmentPagerAdapter {

	private List<Fragment> fragments;
	/**
	 * @param fm
	 * @param fragments
	 */
	public PagerAdapter1(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		this.fragments = fragments;
	}
	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int position) {
		return this.fragments.get(position);
	}

	/* (non-Javadoc)
	 * @see android.support.v4.view.PagerAdapter#getCount()
	 */
	@Override
	public int getCount() {
		return this.fragments.size();
	}
}
