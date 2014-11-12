package vue;

import fabrique.FabriqueChemin;
import fabrique.FabriqueObjet;
import fabrique.FabriqueStructure;
import fabrique.Manipulations;
import langage.Chemin;
import langage.Crayon;
import langage.Dessin;
import langage.IScript;
import langage.Instruction;
import langage.Point;
import langage.Script;
import langage.Sequence;

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

		Crayon c1 = FabriqueObjet.creerCrayon(10, 0, "red", 0);
//		Crayon c2 = FabriqueObjet.creerCrayon(...);

		Dessin d = FabriqueObjet.creerDessin("mon dessin", 500, 500);
		Interpreteur i = FabriqueStructure.creerInterpreteurSVG();

		Instruction i1 = FabriqueChemin.creerLigne(new Point(1, 2), new Point(100, 200), c1, d);
		Instruction i2 = FabriqueChemin.creerLigne(new Point(4,0), new Point(300, 0), c1, d);
		Instruction i3 = FabriqueChemin.creerCercle(40, 120, 30, c1, d);
		Instruction i4 = Manipulations.Remplir((Chemin) i3, "yellow");

//		scriptBoucle.add(i1);
//		scriptBoucle.add(i2);
//		scriptBoucle.add(i3);

//		Instruction i4 = FabriqueStructure.For((Script) scriptBoucle, 3);
//		Instruction i5 = fab.creerInterpreteurSVG(d);
		
		Sequence s = FabriqueStructure.Sequence();
		s.addToSequence(i2);
		s.addToSequence(i3);
		s.addToSequence(i1);
		s.addToSequence(i4);
		
		scriptPrincipal.addInstruction(s);
//		scriptPrincipal.addInstruction(i2);

		scriptPrincipal.execute();
		i.interpreter(d);
	}
}
