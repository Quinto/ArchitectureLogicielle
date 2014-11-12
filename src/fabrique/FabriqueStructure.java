package fabrique;

import vue.Interpreteur;
import vue.InterpreteurSVG;
import langage.For;
import langage.IScript;
import langage.Instruction;
import langage.Script;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class FabriqueStructure {

	public static Instruction creerFor(Script script, int nbIterations){
		return new For(script, nbIterations);
	}
	
	public static IScript creerScript(){
		return new Script();
	}
	
	public static Interpreteur creerInterpreteurSVG(){
		return new InterpreteurSVG();
	}
}
