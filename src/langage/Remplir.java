package langage;

public class Remplir extends Instruction {

	private Objet objet;
	private String couleur;
	
	public Remplir(Objet objet, String couleur) {
		this.objet = objet;
		this.couleur = couleur;
	}
	
	public void execute() throws UnsupportedOperationException {
		if(objet instanceof Cercle) {
			((Cercle) objet).setCouleurRemplissage(couleur);
		}
		else if(objet instanceof Polygone) {
			((Polygone) objet).setCouleurRemplissage(couleur);
		}
		else if(objet instanceof Rectangle) {
			((Rectangle) objet).setCouleurRemplissage(couleur);
		}
		else if(objet instanceof Etiqueter) {
			((Etiqueter) objet).setCouleurRemplissage(couleur);
		}
		else {
			throw new UnsupportedOperationException("Impossible de remplir un chemin non ferme");
		}
	}
}
