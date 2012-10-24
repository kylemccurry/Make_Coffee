package com.make.coffee;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class French_Press_Activity_2 extends Activity {
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_layout, menu);
        return true;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.french_press_layout_2);
    }

	public static Fragment newInstance(Context _context) {
		// TODO Auto-generated method stub
		return null;
	}

}
