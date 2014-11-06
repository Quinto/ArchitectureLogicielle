package fabrique;

import java.awt.Color;

import langage.Crayon;
import langage.Dessin;
import langage.Objet;

public class FabriqueObjet {

	public static Objet creerCrayon(int largeurBordure, float opaciteBordure, Color couleur, float opacite){
		return new Crayon(largeurBordure, opaciteBordure, couleur, opacite);
	}
	
	public static Dessin creerDessin(String name){
		return new Dessin(name);
	}
}
