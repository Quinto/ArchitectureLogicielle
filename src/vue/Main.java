package vue;

import fabrique.FabriqueChemin;
import fabrique.FabriqueObjet;
import fabrique.FabriqueStructure;
import langage.Crayon;
import langage.Dessin;
import langage.IScript;
import langage.Instruction;
import langage.Script;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IScript scriptPrincipal = FabriqueStructure.creerScript();
		IScript scriptBoucle = FabriqueStructure.creerScript();

		Crayon c1 = FabriqueObjet.creerCrayon(...);
		Crayon c2 = FabriqueObjet.creerCrayon(...);

		Dessin d = FabriqueObjet.creerDessin("mon dessin");
		Interpreteur i = FabriqueStructure.creerInterpreteurSVG();

		Instruction i1 = FabriqueChemin.dessinerLigne((1, 2), (3, 1), c1, d);
		Instruction i2 = FabriqueChemin.dessinerLigne((4,0), (3, 0), c1, d);
		Instruction i3 = FabriqueChemin.dessinerPolygone(...);

		scriptBoucle.add(i1);
		scriptBoucle.add(i2);
		scriptBoucle.add(i3);

		Instruction i4 = FabriqueStructure.creerFor((Script) scriptBoucle, 3);
		Instruction i5 = fab.creerInterpreteurSVG(d);

		scriptPrincipal.add(i4);
		scriptPrincipal.add(i5);

		scriptPrincipal.execute();
	}

}
