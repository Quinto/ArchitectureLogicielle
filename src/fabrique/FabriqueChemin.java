package fabrique;

import langage.Cercle;
import langage.Chemin;
//import langage.Courbe;
import langage.Crayon;
import langage.Dessin;
import langage.Ligne;
import langage.Point;
import langage.Polygone;

public class FabriqueChemin {

	public static Chemin creerCercle(int abscisseCentre, int ordonneeCentre, int rayon, Crayon c, Dessin d) {
		Chemin ch = new Cercle(abscisseCentre, ordonneeCentre, rayon, c);
		ch.dessinerChemin(d);
		return ch;
	}
	
/*	public static Chemin creerCourbe(){
		return new Courbe();
	}*/
	
	public static Chemin creerLigne(Point x1, Point x2, Crayon c, Dessin d) {
		Chemin ch = new Ligne(x1, x2, c);
		ch.dessinerChemin(d);
		return ch;
	}
	
	public static Chemin creerPolygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		Chemin ch = new Polygone(pointsX, pointsY, c);
		ch.dessinerChemin(d);
		return ch;
	}
	
}
