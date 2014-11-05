package langage;

import java.awt.BasicStroke;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Ligne implements Chemin{

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
	public Ligne(Point x1, Point x2) {
		this.x1 = x1;
		this.x2 = x2;

		this.crayon = new Crayon();
	}


	/**
	 * Cree une nouvelle instance de <i>Ligne</i> qui sera un clone de <i>chemin</i>.
	 * 
	 * @param chemin Chemin
	 */
	public Ligne(Chemin chemin) {	
		Ligne l = (Ligne) chemin;

		this.x1 = l.getX1();
		this.x2 = l.getX2();
	}

	//======================================================================//
	//==================== Ecriture methodes abstraites ====================//
	//======================================================================//

	@Override
	public Instruction dessinerChemin(Crayon c) {

		return null;
	}

	@Override
	public Instruction deplacer(int x, int y) {
		this.setX1(new Point(this.getX1().getX()+x, this.getX1().getY()+y));
		this.setX2(new Point(this.getX2().getX()+x, this.getX2().getY()+y));
		return null;
	}

//	@Override
//	public boolean contient(Point point) {
//		if(this.getX1().getX() <= this.getX2().getX() && this.getX1().getY() <= this.getX2().getY()) {
//			return ((point.getX() >= this.getX1().getX()) && (point.getY() >= this.getX1().getY()) &&
//					(point.getX() <= this.getX2().getX()) && (point.getY() <= this.getX2().getY()));
//		} else if(this.getX1().getX() >= this.getX2().getX() && this.getX1().getY() >= this.getX2().getY()) {
//			return ((point.getX() <= this.getX1().getX()) && (point.getY()<= this.getX1().getY()) &&
//					(point.getX() >=this.getX2().getX()) && (point.getY() >=this.getX2().getY()));
//		} else if(this.getX1().getX() <= this.getX2().getX() && this.getX1().getY() >= this.getX2().getY()) {
//			return ((point.getX() >= this.getX1().getX()) && (point.getY()<= this.getX1().getY()) &&
//					(point.getX() <=this.getX2().getX()) && (point.getY() >=this.getX2().getY()));
//		} else if(this.getX1().getX() >= this.getX2().getX() && this.getX1().getY() <= this.getX2().getY()) {
//			return ((point.getX() <= this.getX1().getX()) && (point.getY()>= this.getX1().getY()) &&
//					(point.getX() >=this.getX2().getX()) && (point.getY() <=this.getX2().getY()));
//		} else {
//			return false;
//		}
//	}

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
