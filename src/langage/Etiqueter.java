package langage;

public class Etiqueter extends Instruction implements Objet {

	private String texte;
	private int origineX;
	private int origineY;
	
	private String couleur;
	private int taillePolice;
	private String couleurRemplissage;
	private Dessin dessin;
	
	public String getCouleurRemplissage() {
		return couleurRemplissage;
	}

	public void setCouleurRemplissage(String couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}

	public Etiqueter(String texte, int origineX, int origineY, Dessin dessin) {
		this.texte = texte;
		this.origineX = origineX;
		this.origineY = origineY;
		this.dessin = dessin;
		this.taillePolice = 0;
	}
	
	public Etiqueter(String texte, int origineX, int origineY, Dessin dessin, String couleur) {
		this.texte = texte;
		this.origineX = origineX;
		this.origineY = origineY;
		this.dessin = dessin;
		this.taillePolice = 0;
	}
	
	public Etiqueter(String texte, int origineX, int origineY, Dessin dessin, int taillePolice) {
		this.texte = texte;
		this.origineX = origineX;
		this.origineY = origineY;
		this.dessin = dessin;
		this.taillePolice = taillePolice;
	}
	
	public Etiqueter(String texte, int origineX, int origineY, Dessin dessin, int taillePolice, String couleur) {
		this.texte = texte;
		this.origineX = origineX;
		this.origineY = origineY;
		this.dessin = dessin;
		this.taillePolice = taillePolice;
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getTaillePolice() {
		return taillePolice;
	}

	public void setTaillePolice(int taillePolice) {
		this.taillePolice = taillePolice;
	}

	public void execute() {
		dessin.dessiner(this);
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public int getOrigineX() {
		return origineX;
	}

	public void setOrigineX(int origineX) {
		this.origineX = origineX;
	}
	
	public int getOrigineY() {
		return origineY;
	}
	
	public void setOrigineY(int origineY) {
		this.origineX = origineX;
	}
}
