package com.make.coffee;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class Hario_Activity_3 extends Fragment {
 
    public static Fragment newInstance(Context context) {
        Hario_Activity_3 f = new Hario_Activity_3();
        
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.hario_layout_3, null);
        //View root = inflater.inflate(R.layout.about, container, false);
        
	    
        return root;
    }
}