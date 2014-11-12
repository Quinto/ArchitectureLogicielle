package langage;

public class Etiqueter extends Instruction implements Objet {

	private String texte;
	private Point origine;
	private Dessin dessin;
	
	public Etiqueter(String texte, Point origine, Dessin dessin) {
		this.texte = texte;
		this.origine = origine;
		this.dessin = dessin;
	}
	
	public void execute() {
		dessin.dessiner(this);
	}
}
