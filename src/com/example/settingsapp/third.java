package com.example.settingsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class third  extends Activity{
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
	}
	
	public void onStart()
	{
		super.onStart();
	}
	
	public void GoHome(View view)
	   {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	   }

}
