package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */

public abstract class Chemin extends Instruction implements Objet {

	//======================================================================//
	//======================== Methodes abstraites =========================//
	//======================================================================//

	/**
	 * Cette methode permet de dessiner un chemin dans la fenetre grace a  <i>g</i>.
	 * 
	 * @param g Variable permettant de dessiner dans une fenetre.
	 */
	public abstract void dessinerChemin(Dessin d);


	/**
	 * Cette methode permet d'appliquer les modifications necessaires lors du deplacement d'un chemin par l'utilisateur.
	 * 
	 * @param x Valeur du deplacement du chemin sur l'axe des abscisses.
	 * @param y	Valeur du deplacement du chemin sur l'axe des ordonnees.
	 */
//	public abstract Instruction deplacer(int x, int y);


	/**
	 * Cette methode permet de savoir si le <i>point</i> est dans le chemin.
	 * 
	 * @param point Coordonnee du point duquel on veut savoir si il est dans le chemin ou non.
	 * @return vrai si le <i>point</i> est dans le chemin, sinon faux. 
	 */
	//public boolean contient(Point point);


}
