package langage;

public class For implements Instruction {

	private int nbIterations;
	private Script script;
	
	public For(Script script, int nbIterations) {
		this.nbIterations = nbIterations;
		this.script = script;
	}
	
	public void executer() {
		for(int i = 0; i<nbIterations; i++) {
			script.executer();
		}
	}
}
