package fabrique;

import langage.Cercle;
import langage.Chemin;
//import langage.Courbe;
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

	public static Chemin creerCercle(int abscisseCentre, int ordonneeCentre, int rayon, Crayon c, Dessin d) {
		return new Cercle(abscisseCentre, ordonneeCentre, rayon, c, d);
	}
	
/*	public static Chemin creerCourbe(){
		return new Courbe();
	}*/
	
	public static Chemin creerLigne(int abscisseX1, int ordonneeX1, int abscisseX2, int ordonneeX2, Crayon c, Dessin d) {
		return new Ligne(abscisseX1, abscisseX2, ordonneeX1, ordonneeX2, c, d);
	}
	
	public static Chemin creerPolygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		return new Polygone(pointsX, pointsY, c, d);
	}
	
	public static Chemin creerRectangle(int abscisseOrigine, int ordonneeOrigine, int longueur, int largeur, Crayon c, Dessin d) {
		return new Rectangle(abscisseOrigine, ordonneeOrigine, longueur, largeur, c, d);
	}
}
