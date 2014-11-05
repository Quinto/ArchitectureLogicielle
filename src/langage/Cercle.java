package langage;

import java.awt.Graphics2D;

public class Cercle implements Chemin {

	private int abscisseCentre;
	private int ordonneeCentre;
	private int rayon;
	private Crayon crayon;
	
	public Cercle(int abscisseCentre, int ordonneeCentre, int rayon) {
		this.abscisseCentre = abscisseCentre;
		this.ordonneeCentre = ordonneeCentre;
		this.rayon = rayon;
	}
	
	public Instruction deplacer(int x, int y) {
		// TODO Auto-generated method stub
		setAbscisseCentre(getAbscisseCentre() + x);
		setOrdonneeCentre(getOrdonneeCentre() + y);
		return new CreationObjet();
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
	public Instruction dessinerChemin(Crayon c) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
}
