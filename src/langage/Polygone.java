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
	
	/**
	 * Cree une nouvelle instance de <i>Polygone</i> par defaut.
	 */
	public Polygone(int[] pointsX, int[] pointsY, Crayon c, Dessin d) {
		this.pointsX = pointsX;
		this.pointsY = pointsY;
		this.crayon = c;
		this.d = d;
	}
	
	/**
	 * Procedure permettant de rajouter le polygone courant dans les
	 * objets a dessiner
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

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
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
}
