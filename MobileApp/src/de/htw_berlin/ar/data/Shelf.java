/**
 * 
 */
package de.htw_berlin.ar.data;

/**
 * @author Kai Puth
 *
 */
public class Shelf {
	
	public enum Shape { ROUND, SQUARE, OVAL, RECTANGULAR }
	
	public float weight;
	public float maxBearingLoad;
	public Shape shape;
}
