package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RectangularShelfPropertiesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rectangular_shelf_properties);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rectangular_shelf_properties,
				menu);
		return true;
	}
	
	public void nextScreen(View view) {
		
		EditText heightText = (EditText) findViewById(R.id.heightText);
		float height = Float.parseFloat(heightText.getText().toString());
		
		EditText loadText = (EditText) findViewById(R.id.widthText);
		float width = Float.parseFloat(loadText.getText().toString());

    	Intent intent = new Intent(this, RoundShelfPropertiesActivity.class);

    	intent.putExtras(getIntent());
    		
       	intent.putExtra(GeneralShelfPropertiesActivity.EXTRA_SHELF_HEIGHT, height);
       	intent.putExtra(GeneralShelfPropertiesActivity.EXTRA_SHELF_WIDTH, width);

       	startActivity(intent);
	}
}
