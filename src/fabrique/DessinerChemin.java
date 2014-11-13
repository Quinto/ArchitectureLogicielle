package fabrique;

import langage.Cercle;
import langage.Chemin;
import langage.Crayon;
import langage.Dessin;
import langage.Ligne;
import langage.Polygone;
import langage.Rectangle;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class DessinerChemin {

	/**
	 * Fabrique permettant de creer un cercle
	 * @param abscisseCentre : abscisse du centre
	 * @param ordonneeCentre : ordonnee du centre
	 * @param rayon : rayon du cercle
	 * @param c : crayon utilise
	 * @param d : dessin permettant de sauvegarder le cercle
	 * @return un cercle avec les donnees fournies
	 */
	public static Chemin creerCercle(int abscisseCentre, int ordonneeCentre, int rayon, Crayon c, Dessin d) {
		return new Cercle(abscisseCentre, ordonneeCentre, rayon, c, d);
	}
	
	/**
	 * Fabrique permettant de creer une ligne
	 * @param x1 : point origine
	 * @param x2 : point destination
	 * @param c : crayon utilise
	 * @param d : dessin permettant de sauvegarder le segment
	 * @return une ligne avec les donnees fournies
	 */
	
	public static Chemin creerLigne(int abscisseX1, int ordonneeX1, int abscisseX2, int ordonneeX2, Crayon c, Dessin d) {
		return new Ligne(abscisseX1, abscisseX2, ordonneeX1, ordonneeX2, c, d);
	}
	
	/**
	 * Fabrique permettant de creer un polygone
	 * @param pointsX : abscisses des points du polygone
	 * @param pointsY : ordonnees des points du polygone
	 * @param c : crayon utilise
	 * @param d : dessin permettant de sauvegarder le polygone
	 * @return un polygone avec les donnees fournies
	 */
	public static Chemin creerPolygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		return new Polygone(pointsX, pointsY, c, d);
	}
	
	/**
	 * Fabrique permettant de creer un rectangle
	 * @param abscisseOrigine : abscisse du point superieur gauche
	 * @param ordonneeOrigine : ordonnee du point superieur gauche
	 * @param longueur : longueur du rectangle
	 * @param largeur : largeur du rectangle
	 * @param c : crayon utilise
	 * @param d : dessin permettant de sauvegarder le rectangle
	 * @return un rectangle avec les donnees fournies
	 */
	public static Chemin creerRectangle(int abscisseOrigine, int ordonneeOrigine, int longueur, int largeur, Crayon c, Dessin d) {
		return new Rectangle(abscisseOrigine, ordonneeOrigine, longueur, largeur, c, d);
	}
}
