package langage;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */

public abstract class Chemin {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//
	
	// On met les variables en protected pour qu'elles soient visibles par
	// les classes etendant Chemin
	
	protected int x;
	protected int y;

	protected Crayon crayon;
	
	/**
	 * Constructeur par defaut
	 */
	public Chemin(){
		this.x = -1;
		this.y = -1;
		this.crayon = new Crayon();
	}

	/**
	 * Cree une nouvelle instance Chemin qui sera un clone de c
	 * @param c : Chemin a cloner
	 */
	public Chemin(Chemin c){
		this.x = c.getX();
		this.y = c.getY();
		
		this.crayon = c.getCrayon();
	}

	//======================================================================//
	//======================== Methodes abstraites =========================//
	//======================================================================//

	/**
	 * Cette methode permet de dessiner un chemin dans la fenetre grace a  <i>g</i>.
	 * 
	 * @param g Variable permettant de dessiner dans une fenetre.
	 */
	public abstract void dessinerchemin(Graphics2D g);


	/**
	 * Cette methode permet d'appliquer les modifications necessaires lors du deplacement d'un chemin par l'utilisateur.
	 * 
	 * @param x Valeur du deplacement du chemin sur l'axe des abscisses.
	 * @param y	Valeur du deplacement du chemin sur l'axe des ordonnees.
	 */
	public abstract void deplacer(int x, int y);


	/**
	 * Cette methode permet de savoir si le <i>point</i> est dans le chemin.
	 * 
	 * @param point Coordonnee du point duquel on veut savoir si il est dans le chemin ou non.
	 * @return vrai si le <i>point</i> est dans le chemin, sinon faux. 
	 */
	public abstract boolean contient(Point point);


	//======================================================================//
	//========================= Getters et Setters =========================//
	//======================================================================//

	/**
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @return
	 */
	public Crayon getCrayon(){
		return this.crayon;
	}
	
	/**
	 * 
	 * @param crayon
	 */
	public void setY(Crayon crayon) {
		this.crayon = crayon;
	}

}
