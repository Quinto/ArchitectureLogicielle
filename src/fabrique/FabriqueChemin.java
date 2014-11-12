package fabrique;

import langage.Cercle;
import langage.Chemin;
//import langage.Courbe;
import langage.Crayon;
import langage.Dessin;
import langage.Ligne;
import langage.Point;
import langage.Polygone;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class FabriqueChemin {

	public static Chemin creerCercle(int abscisseCentre, int ordonneeCentre, int rayon, Crayon c, Dessin d) {
		return new Cercle(abscisseCentre, ordonneeCentre, rayon, c, d);
	}
	
/*	public static Chemin creerCourbe(){
		return new Courbe();
	}*/
	
	public static Chemin creerLigne(Point x1, Point x2, Crayon c, Dessin d) {
		return new Ligne(x1, x2, c, d);
	}
	
	public static Chemin creerPolygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		return new Polygone(pointsX, pointsY, c, d);
	}
	
}
