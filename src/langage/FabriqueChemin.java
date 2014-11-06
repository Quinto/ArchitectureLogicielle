package langage;

import java.awt.Color;

public class FabriqueChemin {

	public FabriqueChemin() {
		
	}
	
	public static Chemin creerLigne(Point x1, Point x2) {
		return new Ligne(x1, x2);
	}
	
	public static Chemin creerPolygone(Chemin chemin) {
		return new Polygone(chemin);
	}
	
	public static Dessin creerDessin(int largeur, int longueur, String name) {
		return new Dessin(largeur, longueur, name);
	}
	
	public static Crayon creerCrayon(int largeurBordure, float opaciteBordure, Color couleur, float opacite) {
		return new Crayon(largeurBordure, opaciteBordure, couleur, opacite);
	}
	
	public static Script creerScript() {
		return new Script();
	}
}
