package fabrique;

import langage.Crayon;
import langage.Dessin;
import vue.Interpreteur;
import vue.InterpreteurSVG;
import langage.Script;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class FabriqueObjet {

	/**
	 * Fabrique permettant de creer un crayon
	 * @param largeurBordure : largeur de la bordure du crayon
	 * @param opaciteBordure : opacite de la bordure du crayon
	 * @param couleur : couleur du crayon
	 * @param opacite : opacite du crayon
	 * @return un crayon avec les donnees fournies
	 */
	public static Crayon creerCrayon(int largeurBordure, float opaciteBordure, String couleur, float opacite){
		return new Crayon(largeurBordure, opaciteBordure, couleur, opacite);
	}
	
	/**
	 * Fabrique permettant de creer un dessin
	 * @param name : nom du dessin
	 * @param longueur : longueur de la fenetre du dessin
	 * @param largeur : largeur de la fenetre du dessin
	 * @return un dessin avec les donnees fournies
	 */
	public static Dessin creerDessin(String name, int longueur, int largeur){
		return new Dessin(name, longueur, largeur);
	}
	
	/**
	 * Fabrique permettant de creer un script
	 * @return un script par default
	 */
	public static Script creerScript(){
		return new Script();
	}
	
	/**
	 * Fabrique permettant de creer un interpreteur SVG
	 * @return un interpreteur SVG par defaut
	 */
	public static Interpreteur creerInterpreteurSVG(){
		return new InterpreteurSVG();
	}
}
