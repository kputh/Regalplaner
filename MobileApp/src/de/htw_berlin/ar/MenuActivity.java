package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
    
    public void createProject(View view) {
    	
    	Intent intent = new Intent(this, WallPropertiesActivity.class);
    	startActivity(intent);
    }
    
    /** Called when the user touches the button */
    public void showSettings(View view) {
    	
        // Do something in response to button click
    	Intent intent = new Intent(this, Settings2Activity.class);
    	startActivity(intent);
    }
}
