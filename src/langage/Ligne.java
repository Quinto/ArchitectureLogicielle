package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Ligne extends Chemin {

	//======================================================================//
	//============================ Variables ===============================//
	//======================================================================//

	private Point x1;
	private Point x2;

	private Crayon crayon;

	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Ligne</i> par defaut.
	 */
	public Ligne() {
		this.x1 = new Point(0, 0);
		this.x2 = new Point(1, 1);

		this.crayon = new Crayon();
	}

	/**
	 * Cree une nouvelle instance de <i>Ligne</i> a partir de deux points.
	 */
	public Ligne(Point x1, Point x2, Crayon crayon) {
		this.x1 = x1;
		this.x2 = x2;
		this.crayon = crayon;
	}


	//======================================================================//
	//==================== Ecriture methodes abstraites ====================//
	//======================================================================//

	@Override
	public void dessinerChemin(Dessin d) {
		d.dessiner(this);
	}
	
	
	//======================================================================//
	//======================= Getters and Setters ==========================//
	//======================================================================//

	/**
	 * 
	 * @return
	 */
	public Point getX1() {
		return x1;
	}

	/**
	 * 
	 * @param points
	 */
	public void setX1(Point x1) {
		this.x1 = x1;
	}

	/**
	 * 
	 * @return
	 */
	public Point getX2() {
		return x2;
	}

	/**
	 * 
	 * @param points
	 */
	public void setX2(Point x2) {
		this.x2 = x2;
	}

	/**
	 * 
	 * @return
	 */
	public Crayon getCrayon(){
		return this.crayon;
	}

	/**
	 * 
	 * @param crayon
	 */
	public void setCrayon(Crayon crayon){
		this.crayon = crayon;
	}

}
