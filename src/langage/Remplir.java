package langage;

public class Remplir extends Instruction {

	private Chemin chemin;
	private String couleur;
	
	public Remplir(Chemin chemin, String couleur) {
		this.chemin = chemin;
		this.couleur = couleur;
	}
	
	public void execute() throws UnsupportedOperationException {
		if(chemin instanceof Cercle) {
			((Cercle) chemin).setCouleurRemplissage(couleur);
		}
		else if(chemin instanceof Polygone) {
			((Polygone) chemin).setCouleurRemplissage(couleur);
		}
		else if(chemin instanceof Rectangle) {
			
		}
		else {
			throw new UnsupportedOperationException("Impossible de remplir un chemin non ferme");
		}
	}
}
