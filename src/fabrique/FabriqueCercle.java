package fabrique;

import langage.Cercle;

public class FabriqueCercle {

	public static Cercle creerCercle(){
		return new Cercle(0, 0, 1);
	}
}
