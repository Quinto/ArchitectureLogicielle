package langage;

import java.awt.Color;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Crayon {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	protected int largeurBordure; // largeur de la bordure
	protected float opaciteBordure; // opacite de la bordure
	protected Color couleur; // couleur du chemin
	protected float opacite; // opacite du chemin

	public Crayon(){
		this.largeurBordure = 1;
		this.opaciteBordure = 1.0f;
		this.couleur = Color.black;
		this.opacite = 1.0f;
	}

	public Crayon(int largeurBordure, float opaciteBordure, Color couleur, float opacite){
		this.largeurBordure = largeurBordure;
		this.opaciteBordure = opaciteBordure;
		this.couleur = couleur;
		this.opacite = opacite;
	}

	public int getLargeurBordure() {
		return largeurBordure;
	}

	public void setLargeurBordure(int largeurBordure) {
		this.largeurBordure = largeurBordure;
	}

	public float getOpaciteBordure() {
		return opaciteBordure;
	}

	public void setOpaciteBordure(float opaciteBordure) {
		this.opaciteBordure = opaciteBordure;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public float getOpacite() {
		return opacite;
	}

	public void setOpacite(float opacite) {
		this.opacite = opacite;
	}
}
