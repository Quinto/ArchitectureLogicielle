package fabrique;

import java.awt.Color;

import vue.Interpreteur;
import vue.InterpreteurSVG;

import langage.Crayon;
import langage.Dessin;
import langage.Objet;
import langage.Script;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class FabriqueObjet {

	public static Crayon creerCrayon(int largeurBordure, float opaciteBordure, String couleur, float opacite){
		return new Crayon(largeurBordure, opaciteBordure, couleur, opacite);
	}
	
	public static Dessin creerDessin(String name, int longueur, int largeur){
		return new Dessin(name, longueur, largeur);
	}
	
	public static Script creerScript(){
		return new Script();
	}
	
	public static Interpreteur creerInterpreteurSVG(){
		return new InterpreteurSVG();
	}
}
