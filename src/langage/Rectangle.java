package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *																					
 */
public class Rectangle extends Chemin {

	private int abscisseOrigine;
	private int ordonneeOrigine;
	
	private int longueur;
	private int largeur;
	
	private Dessin d;
	private Crayon c;
	private String couleurRemplissage;
	
	public Rectangle(int abscisseOrigine, int ordonneeOrigine, int longueur, int largeur, Crayon c, Dessin d) {
		this.abscisseOrigine = abscisseOrigine;
		this.ordonneeOrigine = ordonneeOrigine;
		this.longueur = longueur;
		this.largeur = largeur;
		this.c = c;
		this.d = d;
	}
	
	/**
	 * Procedure permettant de rajouter le rectangle courant dans
	 * les objets a dessiner
	 */
	public void execute() {
		d.dessiner(this);
	}
	
	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
	public Crayon getCrayon() {
		return c;
	}

	public void setCrayon(Crayon c) {
		this.c = c;
	}

	public int getAbscisseOrigine() {
		return abscisseOrigine;
	}

	public void setAbscisseOrigine(int abscisseOrigine) {
		this.abscisseOrigine = abscisseOrigine;
	}

	public int getOrdonneeOrigine() {
		return ordonneeOrigine;
	}

	public void setOrdonneeOrigine(int ordonneeOrigine) {
		this.ordonneeOrigine = ordonneeOrigine;
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

	public String getCouleurRemplissage() {
		return couleurRemplissage;
	}

	public void setCouleurRemplissage(String couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}
}
