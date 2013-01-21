package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RoundShelfPropertiesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_round_shelf_properties);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_round_shelf_properties, menu);
		return true;
	}

	public void nextScreen(View view) {
		
		EditText radiusText = (EditText) findViewById(R.id.radiusText);
		float radius = Float.parseFloat(radiusText.getText().toString());
		
    	Intent intent = new Intent(this, RoundShelfPropertiesActivity.class);

    	intent.putExtras(getIntent());
    		
       	intent.putExtra(GeneralShelfPropertiesActivity.EXTRA_SHELF_LENGTH, radius);

       	startActivity(intent);
	}
}
