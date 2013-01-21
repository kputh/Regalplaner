/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a rectangular shelf
 * 
 * @author Kai Puth
 *
 */
public class RectangularShelf extends Shelf {
	
	/**
	 * the height of the shelf in cm
	 */
	public float height;
	
	/**
	 * the width of the shelf in cm
	 */
	public float width;
	
	/**
	 * constructor
	 */
	public RectangularShelf() {
		
		super();
		
		this.height = defaultLength;
		this.width = defaultLength;
	}

}
