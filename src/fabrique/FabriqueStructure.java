package fabrique;

import vue.Interpreteur;
import vue.InterpreteurSVG;
import langage.Alternative;
import langage.For;
import langage.IScript;
import langage.Instruction;
import langage.Script;
import langage.Sequence;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class FabriqueStructure {

	public static Instruction For(Script script, int nbIterations){
		return new For(script, nbIterations);
	}
	
	public static Sequence Sequence() {
		return new Sequence();
	}
	
	public static Instruction Alternative(boolean condition, IScript res1, IScript res2) {
		return new Alternative(condition, res1, res2);
	}
	
	public static Script creerScript(){
		return new Script();
	}
	
	public static Interpreteur creerInterpreteurSVG(){
		return new InterpreteurSVG();
	}
}
