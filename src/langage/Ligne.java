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

	private int abscisseX1;
	private int abscisseX2;
	private int ordonneeX1;
	private int ordonneeX2;

	private Dessin d;
	private Crayon crayon;

	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Ligne</i> par defaut.
	 */
	public Ligne() {
		this.abscisseX1 = 0;
		this.abscisseX2 = 1;
		this.ordonneeX1 = 0;
		this.ordonneeX2 = 1;

		this.crayon = new Crayon();
	}

	/**
	 * Cree une nouvelle instance de <i>Ligne</i> a partir de deux points.
	 */
	public Ligne(int abscisseX1, int abscisseX2, int ordonneeX1, int ordonneeX2, Crayon crayon, Dessin d) {
		this.abscisseX1 = abscisseX1;
		this.abscisseX2 = abscisseX2;
		this.ordonneeX1 = ordonneeX1;
		this.ordonneeX2 = ordonneeX2;
		this.crayon = crayon;
		this.d = d;
	}
	
	/**
	 * Procedure permettant d'ajouter la ligne dans les objets a dessiner
	 */
	public void execute() {
		d.dessiner(this);
	}
	
	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/

	public int getAbscisseX1() {
		return abscisseX1;
	}

	public void setAbscisseX1(int abscisseX1) {
		this.abscisseX1 = abscisseX1;
	}

	public int getAbscisseX2() {
		return abscisseX2;
	}

	public void setAbscisseX2(int abscisseX2) {
		this.abscisseX2 = abscisseX2;
	}

	public int getOrdonneeX1() {
		return ordonneeX1;
	}

	public void setOrdonneeX1(int ordonneeX1) {
		this.ordonneeX1 = ordonneeX1;
	}

	public int getOrdonneeX2() {
		return ordonneeX2;
	}

	public void setOrdonneeX2(int ordonneeX2) {
		this.ordonneeX2 = ordonneeX2;
	}

	public Crayon getCrayon(){
		return this.crayon;
	}

	public void setCrayon(Crayon crayon){
		this.crayon = crayon;
	}
}
