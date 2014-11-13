package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Cercle extends CheminFerme {

	private int abscisseCentre;
	private int ordonneeCentre;
	private int rayon;
	
	private Dessin d;
	private Crayon crayon;
	
	public Cercle(int abscisseCentre, int ordonneeCentre, int rayon, Crayon c, Dessin d) {
		this.abscisseCentre = abscisseCentre;
		this.ordonneeCentre = ordonneeCentre;
		this.rayon = rayon;
		this.crayon = c;
		this.d = d;
		couleurRemplissage = "none";
	}
	
	public String getCouleurRemplissage() {
		return couleurRemplissage;
	}

	public void setCouleurRemplissage(String couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}

	public int getAbscisseCentre() {
		return abscisseCentre;
	}

	public void setAbscisseCentre(int abscisseCentre) {
		this.abscisseCentre = abscisseCentre;
	}

	public int getOrdonneeCentre() {
		return ordonneeCentre;
	}

	public void setOrdonneeCentre(int ordonneeCentre) {
		this.ordonneeCentre = ordonneeCentre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	public Crayon getCrayon() {
		return crayon;
	}
	
	public void setCrayon(Crayon c) {
		crayon = c;
	}

	public void execute() {
		d.dessiner(this);
	}
}
