package com.make.coffee;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class Siphon_Activity_2 extends Fragment {
 
    public static Fragment newInstance(Context context) {
        Siphon_Activity_2 f = new Siphon_Activity_2();
        
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.siphon_layout_2, null);
        //View root = inflater.inflate(R.layout.about, container, false);
        
	    
        return root;
    }
}