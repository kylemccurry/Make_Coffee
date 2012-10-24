package com.make.coffee;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main_Activity extends Activity {
	
	public static boolean resetFlag;
	private Button chemex_button=null;
	private Button hario_button=null;
	private Button french_press_button=null;
	private Button siphon_button=null;
	private Button moka_button=null;
	Intent intent;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_layout, menu);
        return true;
    }
    
//***START of buttons
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        
//CHEMEX
        chemex_button = (Button) findViewById(R.id.chemexbutton);
    	chemex_button.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View view){
    			intent = new Intent(Main_Activity.this,Chemex_Activity.class);
    		//Give a toast popup if activity is not found
    			 try {
    	                startActivity(intent);
    	            }
    	         catch (ActivityNotFoundException e){
    	                Toast.makeText(Main_Activity.this, "NO Viewer", Toast.LENGTH_SHORT).show();
    	            }
    		}
    	}
    	);
    	
//HARIO
    	hario_button = (Button) findViewById(R.id.hariobutton);
    	hario_button.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View view){
    			//
    			intent = new Intent(Main_Activity.this,HarioPagerAdapter.class);
    		
    			 try {
    	                startActivity(intent);
    	            }
    	         catch (ActivityNotFoundException e){
    	                Toast.makeText(Main_Activity.this, "NO Viewer", Toast.LENGTH_SHORT).show();
    	            }
    		}
    	}
    	);
    	
//FRENCH PRESS
    	french_press_button = (Button) findViewById(R.id.frenchpressbutton);
    	french_press_button.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View view){
    			//
    			intent = new Intent(Main_Activity.this,FrenchPressPagerAdapter.class);
    		
    			 try {
    	                startActivity(intent);
    	            }
    	         catch (ActivityNotFoundException e){
    	                Toast.makeText(Main_Activity.this, "NO Viewer", Toast.LENGTH_SHORT).show();
    	            }
    		}
    	}
    	);
    	
//SIPHON
    	siphon_button = (Button) findViewById(R.id.siphonbutton);
    	siphon_button.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View view){
    			//
    			intent = new Intent(Main_Activity.this,SiphonPagerAdapter.class);
    			try {
    	                startActivity(intent);
    	            }
    	         catch (ActivityNotFoundException e){
    	                Toast.makeText(Main_Activity.this, "NO Viewer", Toast.LENGTH_SHORT).show();
    	            }
    		}
    	}
    	);
    	
//MOKA
    	moka_button = (Button) findViewById(R.id.mokabutton);
    	moka_button.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View view){
    			intent = new Intent(Main_Activity.this,MokaPagerAdapter.class);
    			try {
    	                startActivity(intent);
    	            }
    	         catch (ActivityNotFoundException e){
    	                Toast.makeText(Main_Activity.this, "NO Viewer", Toast.LENGTH_SHORT).show();
    	            }
    		}
    	}
    	);
//***END of buttons
    	
    	
    }

}
