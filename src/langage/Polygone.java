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
		super(chemin);
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

	//======================================================================//
	//==================== Ecriture methodes abstraites ====================//
	//======================================================================//
	
	@Override
	public void dessinerchemin(Graphics2D g) {
		g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, this.crayon.opacite));	
		g.setColor(this.crayon.couleur);
		g.fillPolygon(this.pointX, this.pointY, this.nbPoint);	
		
		if(this.crayon.largeurBordure > 0) {
			g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, this.crayon.opaciteBordure));
			g.setStroke(new BasicStroke(this.crayon.largeurBordure));
			g.drawPolygon(this.pointX, this.pointY, this.nbPoint);
		}
		
		g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 1.0f));
	}

	@Override
	public void deplacer(int x, int y) {
		this.x += x;
		this.y += y;
		
		this.minX += x;
		this.minY += y;
		this.maxX += x;
		this.maxY += y;
		
		for(int i = 0; i < this.nbPoint; i++) {
			this.pointX[i] += x;
			this.pointY[i] += y;
		}
	}

	@Override
	public boolean contient(Point point) {
		return (this.x - this.rayon <= point.x) &&
				(this.y - this.rayon <= point.y) &&
				(point.x <= (this.x - this.rayon) + (this.rayon * 2)) &&
				(point.y <= (this.y - this.rayon) + (this.rayon * 2));
	}

}
