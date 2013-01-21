/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * an oval shelf
 * 
 * @author Kai Puth
 *
 */
public class OvalShelf extends Shelf {

	/**
	 * the horizontal radius of the shelf in cm
	 */
	public float horizontalRadius;
	
	/**
	 * the vertical radius of the shelf in cm
	 */
	public float verticalRadius;
	
	/**
	 * constructor
	 */
	public OvalShelf() {
		
		super();
		
		this.horizontalRadius = defaultLength;
		this.verticalRadius = defaultLength;
	}
}
