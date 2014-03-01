package com.example.settingsapp;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class PreferenceSetting extends PreferenceActivity
{
	
	protected void onCreate(Bundle savedInstanceState) 
	{
			super.onCreate(savedInstanceState);
		 	addPreferencesFromResource(R.xml.settings);
	}

}
