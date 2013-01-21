/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * the reference object in the image
 * 
 * @author Kai Puth
 *
 */
public class ReferenceObject {
	
	private static final float defaultLength = 20;
	private static final int defaultColor = 0xFF00000;
	
	/**
	 * height in cm
	 */
	public float height;
	
	/**
	 * width in cm
	 */
	public float width;
	
	/**
	 * the distance from the reference object's face to the wall in cm
	 */
	public float depth;
	
	/**
	 * color of the reference object's face as an RGB value
	 */
	public int color;
	
	/**
	 * constructor
	 */
	public ReferenceObject() {
		
		this.height = defaultLength;
		this.width = defaultLength;
		this.depth = defaultLength;
		this.color = defaultColor;
	}
}
