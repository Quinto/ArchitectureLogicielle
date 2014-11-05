package langage;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */

public interface Chemin {

	//======================================================================//
	//======================== Methodes abstraites =========================//
	//======================================================================//

	/**
	 * Cette methode permet de dessiner un chemin dans la fenetre grace a  <i>g</i>.
	 * 
	 * @param g Variable permettant de dessiner dans une fenetre.
	 */
	public void dessinerChemin(Crayon c);


	/**
	 * Cette methode permet d'appliquer les modifications necessaires lors du deplacement d'un chemin par l'utilisateur.
	 * 
	 * @param x Valeur du deplacement du chemin sur l'axe des abscisses.
	 * @param y	Valeur du deplacement du chemin sur l'axe des ordonnees.
	 */
	public void deplacer(int x, int y);


	/**
	 * Cette methode permet de savoir si le <i>point</i> est dans le chemin.
	 * 
	 * @param point Coordonnee du point duquel on veut savoir si il est dans le chemin ou non.
	 * @return vrai si le <i>point</i> est dans le chemin, sinon faux. 
	 */
	public boolean contient(Point point);


}
