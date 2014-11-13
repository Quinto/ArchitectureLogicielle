package langage;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Dessin implements Objet {

	private int longueur;
	private int largeur;
	private boolean contour;
	private List<Objet> objetsDessin;
	private String name;

	public Dessin(String name, int longueur, int largeur) {
		this.name = name;
		this.longueur = longueur;
		this.largeur = largeur;
		this.contour = false;
		this.objetsDessin = new ArrayList<Objet>();
	}

	/**
	 * Methode permettant d'ajouter un objet dans l'ensemble des
	 * objets a dessiner
	 * @param objet : objet a ajouter
	 */
	public void dessiner(Objet objet) {
		objetsDessin.add(objet);
	}

	/**
	 * Methode permettant d'inserer un dessin dans le dessin courant
	 * @param dessin : dessin a inserer
	 */
	public void inserer(Dessin dessin) {
		objetsDessin.add(dessin);
	}

	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dessinFerme() {
		contour = true;
	}

	public boolean estFerme() {
		return contour;
	}

	public List<Objet> getObjets() {
		return objetsDessin;
	}
}
