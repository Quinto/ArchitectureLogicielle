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
		// TODO Auto-generated method stub
		FabriqueObjet fabO = new FabriqueObjet();
		FabriqueStructure fabS = new FabriqueStructure();
		FabriqueChemin fabC = new FabriqueChemin();

		IScript scriptPrincipal = fabS.creerScript();
		IScript scriptBoucle = fabS.creerScript();

		Crayon c1 = fabO.creerCrayon(...);
		Crayon c2 = fabO.creerCrayon(...);

		Dessin d = fabO.creerDessin("mon dessin");

		Instruction i1 = fabC.dessinerLigne((1, 2), (3, 1), c1, d);
		Instruction i2 = fabC.dessinerLigne((4,0), (3, 0), c1, d);
		Instruction i3 = fabC.dessinerPolygone(...);

		scriptBoucle.add(i1);
		scriptBoucle.add(i2);
		scriptBoucle.add(i3);

		Instruction i4 = fabS.creerFor((Script) scriptBoucle, 3);
		Instruction i5 = fab.creerInterpreteurSVG(d);

		scriptPrincipal.add(i4);
		scriptPrincipal.add(i5);

		scriptPrincipal.execute();
	}

}
