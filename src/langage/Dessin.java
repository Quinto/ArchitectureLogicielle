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

	private boolean contour;
	private List<Objet> objetsDessin;
	private String name;
	
	public Dessin(String name) {
		this.name = name;
		this.contour = false;
		this.objetsDessin = new ArrayList<Objet>();
		objetsDessin.add(this);
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
}
