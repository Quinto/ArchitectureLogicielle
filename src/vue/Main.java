package vue;

import java.awt.Color;

import langage.Crayon;
import langage.FabriqueChemin;
import langage.Script;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabriqueChemin fab = new FabriqueChemin();
		Script s = fab.creerScript();
		s.Crayon c = fab.creerCrayon(1, 2, Color.RED, 0);
	}

}
