package langage;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Polygone implements Chemin {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private int pointX[]; // coordonnees x
	private int pointY[]; // coordonnees y
	private int rayon; // rayon
	private int decalage; // decalage du polygone 
	private int nbPoint = 6; // nombre de point du polygone

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
	public Polygone(){

	}


	/**
	 * Cree une nouvelle instance de <i>Polygone</i> qui sera un clone de <i>chemin</i>.
	 * 
	 * @param chemin Chemin
	 */
	public Polygone(Chemin chemin) {	
		Polygone m = (Polygone) chemin;

		this.rayon = m.rayon;
		this.decalage = m.decalage;

		this.nbPoint = m.nbPoint;

		this.pointX = new int[this.nbPoint];
		this.pointY = new int[this.nbPoint];

		for(int i = 0; i < this.nbPoint; i++) {
			this.pointX[i] = m.pointX[i];
			this.pointY[i] = m.pointY[i];
		}

		this.minX = m.minX;
		this.minY = m.minY;

		this.maxX = m.maxX;
		this.maxY = m.maxY;
	}
	


	@Override
	public Instruction deplacer(int x, int y) {
//		this.x += x;		probleme ici
//		this.y += y;		probleme ici
		
		this.minX += x;
		this.minY += y;
		this.maxX += x;
		this.maxY += y;
		
		for(int i = 0; i < this.nbPoint; i++) {
			this.pointX[i] += x;
			this.pointY[i] += y;
		}
		return null;
	}


	@Override
	public Instruction dessinerChemin(Crayon c) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public boolean contient(Point point) {
		return (this.x - this.rayon <= point.x) &&
				(this.y - this.rayon <= point.y) &&
				(point.x <= (this.x - this.rayon) + (this.rayon * 2)) &&
				(point.y <= (this.y - this.rayon) + (this.rayon * 2));
	}*/
}
