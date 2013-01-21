/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * a dowel
 * 
 * @author Kai Puth
 *
 */
public class Dowel {
	
	/**
	 *  maximum load of the dowel in kg
	 */
	public final float load;
	
	/**
	 *  this dowel is suited for this material only
	 */
	public final Material material;
	
	/**
	 * distance to the next dowel in cm
	 */
	public final float distanceToNext;
	
	/**
	 * distance to the wall in cm
	 */
	public final float distanceToWall;
	
	/**
	 * constructor
	 */
	public Dowel(float load, Material material, float distToNext, float distToWall) {
		
		this.load = load;
		this.material = material;
		this.distanceToNext = distToNext;
		this.distanceToWall = distToWall;
	}

	/*
	public float getLoad() { return this.load; }
	public void setLoad(float load) { this.load = load; }
	
	public Material getMaterial() { return this.material; }
	public void setMaterial(Material material) { this.material = material; }
	
	public float getDistanceToNext() { return this.distanceToNext; }
	public void setDistanceToNext(float distance) { this.distanceToNext = distance; }
	
	public float getDistanceToWall() { return this.distanceToWall; }
	public void setDistanceToWall(float distance) { this.distanceToWall = distance; }
	*/

}
