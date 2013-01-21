package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class WallPropertiesActivity extends Activity {
	
	public final static String EXTRA_WALL_MATERIAL = "de.htw_berlin.ar.wall.material";
	public final static String EXTRA_WALL_THICKNESS = "de.htw_berlin.ar.wall.thickness";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wall_properties);
		
		Spinner spinner = (Spinner) findViewById(R.id.material_spinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.wall_materials, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_wall_properties, menu);
		return true;
	}
	
	public void nextScreen(View view) {
		
		Spinner materialSpinner = (Spinner) findViewById(R.id.material_spinner);
		int material = materialSpinner.getSelectedItemPosition();

		EditText thicknessText = (EditText) findViewById(R.id.thicknessText);
		float thickness = Float.parseFloat(thicknessText.getText().toString());
		
    	Intent intent = new Intent(this, GeneralShelfPropertiesActivity.class);
    	intent.putExtra(EXTRA_WALL_MATERIAL, material);
    	intent.putExtra(EXTRA_WALL_THICKNESS, thickness);
    	startActivity(intent);
	}

}
