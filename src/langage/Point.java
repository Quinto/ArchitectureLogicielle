package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Point {

	private int x;
	private int y;
	
	/**
	 * Contructeur par defaut : point origine
	 */
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * 
	 * @param x : abscisse
	 * @param y : ordonnee
	 */
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
