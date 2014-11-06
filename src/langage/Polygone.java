package langage;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author Sylla & Zaninetti
 *																					
 */
public class Polygone extends Chemin {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private int[] pointsX; // coordonnees x
	private int[] pointsY; // coordonnees y
	private int nbPoints; // nombre de point du polygone
	private Crayon crayon;
	
	private int minX; // valeur minimal des coordonnees x
	private int minY; // valeur minimal des coordonnees y
	private int maxX; // valeur maximal des coordonnees x
	private int maxY; // valeur maximal des coordonnees y


	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Polygone</i> par defaut.
	 */
	public Polygone(int[] pointsX, int[] pointsY, Crayon c) {
		this.pointsX = pointsX;
		this.pointsY = pointsY;
		this.crayon = c;
	}
	
	@Override
	public void dessinerChemin(Dessin d) {
		// TODO Auto-generated method stub
		d.dessiner(this);
	}
}
