package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *																					
 */
public class Polygone extends CheminFerme {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private int[] pointsX; // coordonnees x
	private int[] pointsY; // coordonnees y
	private int nbPoints; // nombre de point du polygone
	
	private Dessin d;
	private Crayon crayon;
	
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

	private int minX; // valeur minimale des coordonnees x
	private int minY; // valeur minimale des coordonnees y
	private int maxX; // valeur maximale des coordonnees x
	private int maxY; // valeur maximale des coordonnees y


	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	/**
	 * Cree une nouvelle instance de <i>Polygone</i> par defaut.
	 */
	public Polygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		this.pointsX = pointsX;
		this.pointsY = pointsY;
		this.crayon = c;
		this.d = d;
	}

	public int[] getPointsX() {
		return pointsX;
	}

	public void setPointsX(int[] pointsX) {
		this.pointsX = pointsX;
	}

	public int[] getPointsY() {
		return pointsY;
	}

	public void setPointsY(int[] pointsY) {
		this.pointsY = pointsY;
	}

	public void execute() {
		d.dessiner(this);
	}
}
