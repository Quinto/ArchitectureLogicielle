package langage;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Ligne extends Chemin{

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private int x2; // coordonnees de l'axe des abscisses du deuxieme point
	private int y2; // coordonnees de l'axe des ordonnees du deuxieme point


	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Ligne</i> par defaut.
	 */
	public Ligne() {
		this.x2 = -1;
		this.y2 = -1;
	}


	/**
	 * Cree une nouvelle instance de <i>Ligne</i> qui sera un clone de <i>chemin</i>.
	 * 
	 * @param chemin Chemin
	 */
	public Ligne(Chemin chemin) {	
		super(chemin);
		Ligne l = (Ligne) chemin;

		this.x2 = l.x2;
		this.y2 = l.y2;
	}

	//======================================================================//
	//==================== Ecriture methodes abstraites ====================//
	//======================================================================//
	
	@Override
	public void dessinerchemin(Graphics2D g) {
		g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, this.crayon.opacite));	
		g.setColor(this.crayon.couleur);
		g.setStroke(new BasicStroke(this.crayon.largeurBordure));
		
		g.drawLine(this.x, this.y, this.x2, this.y2);
		g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 1.0f));
	}

	@Override
	public void deplacer(int x, int y) {
		this.x += x;
    	this.y += y;
    	this.x2 += x;
    	this.y2 += y;
	}

	@Override
	public boolean contient(Point point) {
		if(this.x <= this.x2 && this.y <= this.y2) {
			return ((point.x >= this.x) && (point.y >= this.y) && (point.x <= this.x2) && (point.y <= this.y2));
		} else if(this.x >= this.x2 && this.y >= this.y2) {
			return ((point.x <= this.x) && (point.y<= this.y) && (point.x >=this.x2) && (point.y >=this.y2));
		} else if(this.x <= this.x2 && this.y >= this.y2) {
			return ((point.x >= this.x) && (point.y<= this.y) && (point.x <=this.x2) && (point.y >=this.y2));
		} else if(this.x >= this.x2 && this.y <= this.y2) {
			return ((point.x <= this.x) && (point.y>= this.y) && (point.x >=this.x2) && (point.y <=this.y2));
		} else {
			return false;
		}
	}

}
