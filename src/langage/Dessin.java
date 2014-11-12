package langage;

import java.rmi.UnexpectedException;
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
		//objetsDessin.add(this);
	}
	
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

	public void dessiner(Chemin chemin) {
		objetsDessin.add(chemin);
	}
	
	public void inserer(Dessin dessin) {
		objetsDessin.add(dessin);
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
