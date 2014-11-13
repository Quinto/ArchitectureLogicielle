 package fabrique;

import langage.Dessin;
import langage.Etiqueter;
import langage.Objet;
import langage.Remplir;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Manipulations {

	/**
	 * Fabrique permettant de creer une instruction Remplir
	 * @param objet : objet a remplir
	 * @param couleur : couleur devant etre utilisee
	 * @return une instruction avec les donnes forunies
	 */
	public static Remplir Remplir(Objet objet, String couleur) {
		return new Remplir(objet, couleur);
	}
	
	/**
	 * Fabrique permettant de creer une instruction Etiqueter
	 * @param texte : texte a etiqueter
	 * @param origineX : abscisse de l'origine
	 * @param origineY : ordonnee de l'origine
	 * @param d : dessin permettant de sauvegarder l'instruction
	 * @return une instruction avec les donnees fournies
	 */
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d) {
		return new Etiqueter(texte, origineX, origineY, d);
	}
	
	/**
	 * Fabrique permettant de creer une instruction Etiqueter
	 * @param texte : texte a etiqueter
	 * @param origineX : abscisse de l'origine
	 * @param origineY : ordonnee de l'origine
	 * @param d : dessin permettant de sauvegarder l'instruction
	 * @param couleur : couleur devant etre utilisee
	 * @return une instruction avec les donnees fournies
	 */
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, String couleur) {
		return new Etiqueter(texte, origineX, origineY, d, couleur);
	}
	
	/**
	 * Fabrique permettant de creer une instruction Etiqueter
	 * @param texte : texte a etiqueter
	 * @param origineX : abscisse de l'origine
	 * @param origineY : ordonnee de l'origine
	 * @param d : dessin permettant de sauvegarder l'instruction
	 * @param taillePolice : taille de police devant etre utilisee
	 * @return une instruction avec les donnees fournies
	 */
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, int taillePolice) {
		return new Etiqueter(texte, origineX, origineY, d, taillePolice);
	}
	
	/**
	 * Fabrique permettant de creer une instruction Etiqueter
	 * @param texte : texte a etiqueter
	 * @param origineX : abscisse de l'origine
	 * @param origineY : ordonnee de l'origine
	 * @param d : dessin permettant de sauvegarder l'instruction
	 * @param taillePolice : taille de police devant etre utilisee
	 * @param couleur : couleur devant etre utilisee
	 * @return une instruction avec les donnees fournies
	 */
	public static Etiqueter Etiqueter(String texte, int origineX, int origineY, Dessin d, int taillePolice, String couleur) {
		return new Etiqueter(texte, origineX, origineY, d, taillePolice, couleur);
	}
}
