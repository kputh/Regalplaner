/**
 * 
 */
package de.htw_berlin.ar.data;

import android.graphics.Bitmap;

/**
 * ein Projekt. F�hrt alle Daten f�r ein Regalprojekt zusammen.
 * 
 * @author Kai Puth
 *
 */
public class Project {
	
	/**
	 * das urspr�ngliche Bild der Wand mit dem Referenzobjekt.
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
	 * Liste mit Empfehlungen f�r die D�bel.
	 */
	public Bitmap dowelOverview;
	
	/**
	 * das Referenzobjekt im Bild.
	 */
	public ReferenceObject reference;
	
	/**
	 * das aufzuh�ngende Regal.
	 */
	public Shelf shelf;
	
	/**
	 * die Wand.
	 */
	public Wall wall;

}
