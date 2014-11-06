package fabrique;

import java.util.ArrayList;

import langage.For;
import langage.IScript;
import langage.Instruction;
import langage.Script;

public class FabriqueStructure {

	public static Instruction creerFor(Script script){
		return new For(script);
	}
	
	public static IScript creerScript(ArrayList<Instruction> liste){
		return new Script(liste);
	}
}
