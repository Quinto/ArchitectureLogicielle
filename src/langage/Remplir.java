package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *																					
 */
public class Remplir extends Instruction {

	private Objet objet;
	private String couleur;
	
	public Remplir(Objet objet, String couleur) {
		this.objet = objet;
		this.couleur = couleur;
	}
	
	/**
	 * Methode permettant d'executer un remplissage d'une forme
	 * suivant la nature de la forme : Cercle, Ligne...
	 */
	public void execute() throws UnsupportedOperationException {
		if(objet instanceof CheminFerme) {
			((CheminFerme) objet).setCouleurRemplissage(couleur);
		}
		else if(objet instanceof Etiqueter) {
			((Etiqueter) objet).setCouleurRemplissage(couleur);
		}
		else {
			throw new UnsupportedOperationException("Impossible de remplir un chemin non ferme");
		}
	}
}
