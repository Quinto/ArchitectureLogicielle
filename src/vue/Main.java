package vue;

import fabrique.FabriqueChemin;
import fabrique.FabriqueObjet;
import fabrique.FabriqueStructure;
import langage.Crayon;
import langage.Dessin;
import langage.IScript;
import langage.Instruction;
import langage.Point;
import langage.Script;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Script scriptPrincipal = FabriqueStructure.creerScript();
		Script scriptBoucle = FabriqueStructure.creerScript();

		Crayon c1 = FabriqueObjet.creerCrayon(0, 0, null, 0);
//		Crayon c2 = FabriqueObjet.creerCrayon(...);

		Dessin d = FabriqueObjet.creerDessin("MonDessin.svg", 500, 500);
		Interpreteur i = FabriqueStructure.creerInterpreteurSVG();

		Instruction i1 = FabriqueChemin.creerLigne(new Point(1, 2), new Point(100, 200), c1, d);
		Instruction i2 = FabriqueChemin.creerLigne(new Point(4,0), new Point(3, 0), c1, d);
//		Instruction i3 = FabriqueChemin.creerPolygone(...);

//		scriptBoucle.add(i1);
//		scriptBoucle.add(i2);
//		scriptBoucle.add(i3);

//		Instruction i4 = FabriqueStructure.creerFor((Script) scriptBoucle, 3);
//		Instruction i5 = fab.creerInterpreteurSVG(d);

		scriptPrincipal.addInstruction(i1);
		scriptPrincipal.addInstruction(i2);

		scriptPrincipal.execute();
		try {
			i.interpreter(d);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
