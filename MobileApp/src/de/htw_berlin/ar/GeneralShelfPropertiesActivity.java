package de.htw_berlin.ar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GeneralShelfPropertiesActivity extends Activity implements OnItemSelectedListener {
	
	private enum Shape { ROUND, SQUARE, OVAL, RECTANGULAR, NULL }
	private Shape shape;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_general_shelf_properties);

		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.shelf_shapes, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
		
		spinner.setOnItemSelectedListener(this);
		
		shape = Shape.NULL;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_general_shelf_properties,
				menu);
		return true;
	}
	
	public void nextScreen(View view) {
		
    	Intent intent;
    	switch(shape) {
    		case ROUND:
    	    	intent = new Intent(this, RoundShelfPropertiesActivity.class);
    	    	startActivity(intent);
    	    	break;
    			
    		case SQUARE:
    	    	intent = new Intent(this, SquareShelfPropertiesActivity.class);
    	    	startActivity(intent);
    	    	break;

    		case OVAL:
    	    	intent = new Intent(this, OvalShelfPropertiesActivity.class);
    	    	startActivity(intent);
    	    	break;

    		case RECTANGULAR:
    	    	intent = new Intent(this, RectangularShelfPropertiesActivity.class);
    	    	startActivity(intent);
    	    	break;
    	    	
    	    default:
    	    	break;
    	}
	}
	
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		
		/*
		Object item = parent.getItemAtPosition(pos);
		if (item.toString() == "rund")
			shape = Shape.ROUND;
		if (item.toString() == "oval")
			shape = Shape.OVAL;
		if (item.toString() == "quadratisch")
			shape = Shape.SQUARE;
		if (item.toString() == "rechteckig")
			shape = Shape.RECTANGULAR;
		*/
		if (pos == 0)
			shape = Shape.ROUND;
		if (pos == 1)
			shape = Shape.OVAL;
		if (pos == 2)
			shape = Shape.SQUARE;
		if (pos == 3)
			shape = Shape.RECTANGULAR;
    }

    public void onNothingSelected(AdapterView<?> parent) {
    	
    	shape = Shape.NULL;
    }
}
