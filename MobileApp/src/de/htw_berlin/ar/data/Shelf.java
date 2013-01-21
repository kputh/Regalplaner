/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a shelf
 * 
 * @author Kai Puth
 *
 */
public class Shelf {
	
	/**
	 * the default length of each edge
	 */
	protected static final float defaultLength = 30; 
	
	/**
	 * weight of the shelf in kg
	 */
	public float weight;
	
	/**
	 * maximum load in kg
	 */
	public float maxBearingLoad;
	
	/**
	 * constructor
	 */
	public Shelf() {
		
		this.weight = 2;
		this.maxBearingLoad = 10;
	}
}
