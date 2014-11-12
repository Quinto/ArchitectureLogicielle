 package fabrique;

import langage.Chemin;
import langage.Dessin;
import langage.Etiqueter;
import langage.Objet;
import langage.Point;
import langage.Remplir;

public class Manipulations {

	public static Remplir Remplir(Objet objet, String couleur) {
		return new Remplir(objet, couleur);
	}
	
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d) {
		return new Etiqueter(texte, origineX, origineY, d);
	}
	
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, String couleur) {
		return new Etiqueter(texte, origineX, origineY, d, couleur);
	}
	
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, int taillePolice) {
		return new Etiqueter(texte, origineX, origineY, d, taillePolice);
	}
	
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, int taillePolice, String couleur) {
		return new Etiqueter(texte, origineX, origineY, d, taillePolice, couleur);
	}
}
