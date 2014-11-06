package fabrique;

import langage.Cercle;
import langage.Chemin;
import langage.Courbe;
import langage.Ligne;
import langage.Point;
import langage.Polygone;

public class FabriqueChemin {

	public static Chemin creerCercle(int abscisseCentre, int ordonneeCentre, int rayon){
		return new Cercle(abscisseCentre, ordonneeCentre, rayon);
	}
	
	public static Chemin creerCourbe(){
		return new Courbe();
	}
	
	public static Chemin creerLigne(Point x1, Point x2) {
		return new Ligne(x1, x2);
	}
	
	public static Chemin creerPolygone(Chemin chemin) {
		return new Polygone(chemin);
	}
	
}
