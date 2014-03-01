package com.example.settingsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	
	      Button button1;
	
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		button1 = (Button) findViewById(R.id.Btn1);
		styleSetting();
		}
	

	public void onStart()
	   {
		super.onStart();
		styleSetting();
		}
	

	public void switchToNewActivity(View view)
	   {
		Intent intent = new Intent(this, Second.class);
		startActivity(intent);
	   }
	
	public boolean onCreateOptionsMenu(Menu menu)
	  {
		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.alt_menu, menu);
		
		return true;
	   }
	
	
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		 		
		 		if(item.getItemId()== R.id.item1 )
		 		{
		 			
		 			Intent prefIntent = new Intent(this, PreferenceSetting.class );
		 			this.startActivity(prefIntent);
		 			
		 		}
		 	
		 		return super.onOptionsItemSelected(item);
		 	}
	 
	
	 
	 
	    
	   public void styleSetting()
	         
	          {
		 		SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
		 		
		 	    boolean boxChecked = pref.getBoolean("act1", false);
		 		
		 		     if(boxChecked) {button1.setTextAppearance(this, R.style.Alternate);}
		 		     else            { button1.setTextAppearance(this, R.style.Default);}
		 		}
}
