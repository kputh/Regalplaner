/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a square shelf
 * 
 * @author Kai Puth
 *
 */
public class SquareShelf extends Shelf {

	/**
	 * edge length in cm
	 */
	public float length;
	
	/**
	 * constructor
	 */
	public SquareShelf() {
		
		super();
		
		this.length = defaultLength;
	}
}
