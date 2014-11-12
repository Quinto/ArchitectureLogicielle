 package fabrique;

import langage.Chemin;
import langage.Remplir;

public class Manipulations {

	public static Remplir Remplir(Chemin chemin, String couleur) {
		return new Remplir(chemin, couleur);
	}
}
