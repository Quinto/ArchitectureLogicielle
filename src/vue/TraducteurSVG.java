package vue;

import java.io.File;

import langage.Dessin;

public class TraducteurSVG {

	private Dessin dessin;
	
	public TraducteurSVG(Dessin dessin) {
		this.dessin = dessin;
	}
	
	public File creerFichierPourDessin() {
		File svg = new File(dessin.getName() + ".svg");
		// ecrire ds le fichier SVG
		return svg;
	}
}
