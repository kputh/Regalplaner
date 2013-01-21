/**
 * 
 */
package de.htw_berlin.ar.data;

import android.graphics.Bitmap;

/**
 * ein Projekt. Führt alle Daten für ein Regalprojekt zusammen.
 * 
 * @author Kai Puth
 *
 */
public class Project {
	
	/**
	 * das ursprüngliche Bild der Wand mit dem Referenzobjekt.
	 */
	public Bitmap originalImage;
	
	/**
	 * die Gesamtansicht des Bohrplans.
	 */
	public Bitmap fullResults;
	
	/**
	 * die Detailansicht des Bohrplans.
	 */
	public Bitmap detailResults;
	
	/**
	 * Liste mit Empfehlungen für die Dübel.
	 */
	public Bitmap dowelOverview;
	
	/**
	 * das Referenzobjekt im Bild.
	 */
	public ReferenceObject reference;
	
	/**
	 * das aufzuhängende Regal.
	 */
	public Shelf shelf;
	
	/**
	 * die Wand.
	 */
	public Wall wall;

}
