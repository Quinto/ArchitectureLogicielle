package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Crayon implements Objet{

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	protected int largeurBordure; // largeur de la bordure
	protected float opaciteBordure; // opacite de la bordure
	protected String couleur; // couleur du chemin
	protected float opacite; // opacite du chemin

	public Crayon(){
		this.largeurBordure = 1;
		this.opaciteBordure = 1.0f;
		this.couleur = "black";
		this.opacite = 1.0f;
	}

	public Crayon(int largeurBordure, float opaciteBordure, String couleur, float opacite){
		this.largeurBordure = largeurBordure;
		this.opaciteBordure = opaciteBordure;
		this.couleur = couleur;
		this.opacite = opacite;
	}

	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
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

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getOpacite() {
		return opacite;
	}

	public void setOpacite(float opacite) {
		this.opacite = opacite;
	}
}
