package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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

}
