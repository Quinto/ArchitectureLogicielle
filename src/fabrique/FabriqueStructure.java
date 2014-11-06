package fabrique;

import java.util.ArrayList;

import langage.For;
import langage.IScript;
import langage.Instruction;
import langage.Script;

public class FabriqueStructure {

	public static Instruction creerFor(Script script, int nbIterations){
		return new For(script, nbIterations);
	}
	
	public static IScript creerScript(){
		return new Script();
	}
}
