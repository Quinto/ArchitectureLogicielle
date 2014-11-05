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

	private int largeur;
	private int longueur;
	private boolean contour;
	private boolean dessinPrincipal;
	private Dessin dessinInsere;
	private List<Objet> objetsDessin;
	private String name;
	
	public Dessin(int largeur, int longueur, String name) {
		this.name = name;
		this.largeur = largeur;
		this.longueur = longueur;
		this.contour = false;
		this.dessinInsere = null;
		this.objetsDessin = new ArrayList<Objet>();
		objetsDessin.add(this);
	}
	
	public void dessiner(Chemin chemin) {
		
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
	
	public void inserer(Dessin d) throws UnsupportedOperationException {
		if(estFerme()) {
			setDessinInsere(d);
		}
		else {
			throw new UnsupportedOperationException("Impossible d'insérer un dessin dans un dessin sans contour");
		}
	}

	public boolean isDessinPrincipal() {
		return dessinPrincipal;
	}

	public void setDessinPrincipal(boolean dessinPrincipal) {
		this.dessinPrincipal = dessinPrincipal;
	}

	public Dessin getDessinInsere() {
		return dessinInsere;
	}

	public void setDessinInsere(Dessin dessinInsere) {
		this.dessinInsere = dessinInsere;
	}
}
