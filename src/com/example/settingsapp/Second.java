package com.example.settingsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;


public class Second extends Activity
   {
	
	   Button button2; 
	
   protected void onCreate(Bundle savedInstanceState) 
       {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
		button2= (Button) findViewById(R.id.Btn2);
		}

	public void onStart()
	   {
		super.onStart();
		styleSetting();
		}
	
	
	public void switchToNewActivity(View view)
	  {
		Intent intent = new Intent(this, third.class);
		startActivity(intent);
		}
	
	
	public void styleSetting()
	   {

 		SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
 		
 		boolean boxChecked = preference.getBoolean("act2", false);
 		
 		if(boxChecked)  {button2.setTextAppearance(this, R.style.Alternate);}
 		
 		else            {button2.setTextAppearance(this, R.style.Default);}
 	   }
	
}