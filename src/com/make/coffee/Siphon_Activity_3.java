package com.make.coffee;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class Siphon_Activity_3 extends Activity {
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_layout, menu);
        return true;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siphon_layout_3);
    }

	public static Fragment newInstance(Context _context) {
		// TODO Auto-generated method stub
		return null;
	}

}
