package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */

public interface Chemin extends Objet {

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


}
