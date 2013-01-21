/**
 * 
 */
package de.htw_berlin.ar.data;

import android.graphics.Bitmap;

/**
 * this object ties all relevant data for a shelf and wall together
 * 
 * @author Kai Puth
 *
 */
public class Project {
	
	/**
	 * the image of the wall and reference object
	 */
	public Bitmap originalImage;
	
	/**
	 * the full view of the result
	 */
	public Bitmap fullResults;
	
	/**
	 * the detail view of the result
	 */
	public Bitmap detailResults;
	
	/**
	 * a list of recommended dowels
	 */
	public Bitmap dowelOverview;
	
	/**
	 * the reference object in the image
	 */
	public ReferenceObject reference;
	
	/**
	 * the shelf to be put on the wall
	 */
	public Shelf shelf;
	
	/**
	 * the wall
	 */
	public Wall wall;
	
	/**
	 * constructor
	 */
	public Project() {
		
		// ToDo: get reference object
		
		this.shelf = new Shelf();
		this.wall = new Wall();
	}

}
