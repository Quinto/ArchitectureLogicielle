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

}
