package langage;

import java.awt.Graphics2D;

public class Cercle extends Chemin {

	private int abscisseCentre;
	private int ordonneeCentre;
	private int rayon;
	private Crayon crayon;
	
	public Cercle(int abscisseCentre, int ordonneeCentre, int rayon) {
		this.abscisseCentre = abscisseCentre;
		this.ordonneeCentre = ordonneeCentre;
		this.rayon = rayon;
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

	@Override
	public void dessinerChemin(Dessin d) {
		d.dessiner(this);
	}
	
	
}
