package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class SquareShelfPropertiesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_square_shelf_properties);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.activity_square_shelf_properties, menu);
		return true;
	}

	public void nextScreen(View view) {
		
		EditText lengthText = (EditText) findViewById(R.id.lengthText);
		float length = Float.parseFloat(lengthText.getText().toString());
		
    	Intent intent = new Intent(this, RoundShelfPropertiesActivity.class);

    	intent.putExtras(getIntent());
    		
       	intent.putExtra(GeneralShelfPropertiesActivity.EXTRA_SHELF_LENGTH, length);

       	startActivity(intent);
	}
}
