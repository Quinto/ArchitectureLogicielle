package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *																					
 */
public class Polygone extends Chemin {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private int[] pointsX; // coordonnees x
	private int[] pointsY; // coordonnees y
	private int nbPoints; // nombre de point du polygone
	
	private Dessin d;
	private Crayon crayon;
	private String couleurRemplissage;
	
	public Crayon getCrayon() {
		return crayon;
	}

	public void setCrayon(Crayon crayon) {
		this.crayon = crayon;
	}

	public String getCouleurRemplissage() {
		return couleurRemplissage;
	}

	public void setCouleurRemplissage(String couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}

	private int minX; // valeur minimal des coordonnees x
	private int minY; // valeur minimal des coordonnees y
	private int maxX; // valeur maximal des coordonnees x
	private int maxY; // valeur maximal des coordonnees y


	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Polygone</i> par defaut.
	 */
	public Polygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		this.pointsX = pointsX;
		this.pointsY = pointsY;
		this.crayon = c;
		this.d = d;
	}

	public void execute() {
		d.dessiner(this);
	}
}
