package langage;

import java.awt.Graphics2D;
import java.awt.Point;

public class Cercle implements Chemin {

	private int abscisseCentre;
	private int ordonneeCentre;
	private int rayon;
	
	public Cercle(int abscisseCentre, int ordonneeCentre, int rayon) {
		this.abscisseCentre = abscisseCentre;
		this.ordonneeCentre = ordonneeCentre;
		this.rayon = rayon;
	}
	
	@Override
	public boolean contient(Point point) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deplacer(int x, int y) {
		// TODO Auto-generated method stub
		setAbscisseCentre(getAbscisseCentre() + x);
		setOrdonneeCentre(getOrdonneeCentre() + y);
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
	public void dessinerChemin(Crayon c) {
		// TODO Auto-generated method stub
		
	}
	
	
}
