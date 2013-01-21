/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a wall
 * 
 * @author Kai Puth
 *
 */
public class Wall {
	
	/**
	 *  thickness of the wall in cm
	 */
	public float thickness;
	
	/**
	 * the material, the wall is made from
	 */
	public Material material;
	
	/**
	 * constructor
	 */
	public Wall() {
		
		this.thickness = 20;
		this.material = Material.CONCRETE;
	}

}
