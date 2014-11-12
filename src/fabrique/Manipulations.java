 package fabrique;

import langage.Chemin;
import langage.Dessin;
import langage.Etiqueter;
import langage.Point;
import langage.Remplir;

public class Manipulations {

	public static Remplir Remplir(Chemin chemin, String couleur) {
		return new Remplir(chemin, couleur);
	}
	
	public static Etiqueter Etiqueter(String texte, Point origine, Dessin d) {
		return new Etiqueter(texte, origine, d);
	}
}
