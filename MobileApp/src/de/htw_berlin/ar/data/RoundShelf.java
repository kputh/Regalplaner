/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a round shelf
 * 
 * @author Kai Puth
 *
 */
public class RoundShelf extends Shelf {

	/**
	 * radius of the shelf in cm
	 */
	public float radius;
	
	/**
	 * constructor
	 */
	public RoundShelf() {
		
		super();
		
		this.radius = defaultLength;
	}
}
