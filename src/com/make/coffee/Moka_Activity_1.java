/*
 * About.java
 * Feed Cost Calculator
 * Created By : Daniel Jamison
 * Date : August 03, 2012
 * Copyright (c) 2012 South Dakota State University. All rights reserved.
 */

package com.make.coffee;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class Moka_Activity_1 extends Fragment {
 
    public static Fragment newInstance(Context context) {
        Moka_Activity_1 f = new Moka_Activity_1();
        
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.moka_layout_1, null);
        //View root = inflater.inflate(R.layout.about, container, false);
        
	    
        return root;
    }
}