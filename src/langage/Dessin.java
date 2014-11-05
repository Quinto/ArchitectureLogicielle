package langage;

import java.rmi.UnexpectedException;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Dessin {

	private int largeur;
	private int longueur;
	private boolean contour;
	private boolean dessinPrincipal;
	private Dessin dessinInsere;
	
	public Dessin(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		this.contour = false;
		this.dessinInsere = null;
	}
	
	public void dessiner(Chemin chemin, Crayon crayon) {
		chemin.dessinerChemin(crayon);
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
