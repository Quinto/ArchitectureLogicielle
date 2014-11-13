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

	/**
	 * Fabrique permettant de creer une instruction For
	 * @param script : un script (instructions)
	 * @param nbIterations : le nombre de fois devant etre repete
	 * @return une instruction For
	 */
	public static Instruction For(Script script, int nbIterations){
		return new For(script, nbIterations);
	}
	
	/**
	 * Fabrique permettant de creer une sequence
	 * @return une sequence par default
	 */
	public static Sequence Sequence() {
		return new Sequence();
	}
	
	/**
	 * Fabrique permettant de creer une alternative
	 * @param condition : une condition valant true ou false
	 * @param res1 : premier script devant etre execute suivant la valeur de condition
	 * @param res2 : deuxieme script devant etre execute suivant la valeur de condition
	 * @return une instruction devant etre executee
	 */
	public static Instruction Alternative(boolean condition, IScript res1, IScript res2) {
		return new Alternative(condition, res1, res2);
	}
	
	/**
	 * Fabrique permettant de creer un script
	 * @return un script par default
	 */
	public static Script creerScript(){
		return new Script();
	}
	
	/**
	 * Fabrique permettant de creer un interpreteur svg
	 * @return un interpreteur svg par default
	 */
	public static Interpreteur creerInterpreteurSVG(){
		return new InterpreteurSVG();
	}
}
