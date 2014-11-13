package vue;

import java.io.File;

import langage.Dessin;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public interface Interpreteur {

	/**
	 * Methode permettant d'interpreter un dessin
	 * @param d : dessin a interpreter
	 * @return un fichier format svg correpondant au dessin
	 * interprete
	 */
	public File interpreter(Dessin d);

}
