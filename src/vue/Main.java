package vue;

import fabrique.DessinerChemin;
import fabrique.FabriqueObjet;
import fabrique.FabriqueStructure;
import fabrique.Manipulations;
import langage.Crayon;
import langage.Dessin;
import langage.Instruction;
import langage.Objet;
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

		Crayon c1 = FabriqueObjet.creerCrayon(1, 1, "red", 0);

		Dessin d = FabriqueObjet.creerDessin("MonDessin", 10000, 10000);
		Interpreteur i = FabriqueObjet.creerInterpreteurSVG();

		Instruction i1 = DessinerChemin.creerLigne(1, 2, 100, 200, c1, d);
		Instruction i2 = DessinerChemin.creerLigne(4,0, 300, 0, c1, d);
		Instruction i3 = DessinerChemin.creerCercle(40, 120, 30, c1, d);
		Instruction i4 = Manipulations.Remplir((Objet) i3, "yellow");
		
//		scriptBoucle.add(i1);
//		scriptBoucle.add(i2);
//		scriptBoucle.add(i3);

//		Instruction i4 = FabriqueStructure.For((Script) scriptBoucle, 3);
		
		Instruction i5 = Manipulations.Etiqueter("Hello world", 350, 350, d, 200, "red");

		Instruction i6 = Manipulations.Remplir((Objet) i5, "orange");
		
		Sequence s = FabriqueStructure.Sequence();
		s.addToSequence(i2);
		s.addToSequence(i3);
		s.addToSequence(i1);
		s.addToSequence(i4);
		
		scriptPrincipal.addInstruction(s);
		scriptPrincipal.addInstruction(i5);
		scriptPrincipal.addInstruction(i6);

		scriptPrincipal.execute();
		i.interpreter(d);
	}
}
