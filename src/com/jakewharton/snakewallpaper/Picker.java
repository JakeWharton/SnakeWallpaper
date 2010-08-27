package com.jakewharton.snakewallpaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Activity which launches the live wallpaper picker and prompts for the
 * user to install our wallpaper.
 * 
 * @author Jake Wharton
 */
public class Picker extends Activity {
	/**
	 * Intent for live wallpaper picker activity.
	 */
	private static final String LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
	
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Prompt to choose our wallpaper
		Toast.makeText(this, this.getResources().getString(R.string.welcome_picker_toast), Toast.LENGTH_LONG).show();
		
		//Display wallpaper picker
		this.startActivity(new Intent(Picker.LIVE_WALLPAPER_CHOOSER));
		
		//Close this helper activity
		this.finish();
	}
}
