package langage;

import java.util.LinkedList;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Sequence extends Instruction {

	private LinkedList<Instruction> instructionSequence;
	
	/**
	 * Constructeur par default
	 */
	public Sequence() {
		this.instructionSequence = new LinkedList<Instruction>();
	}
	
	/**
	 * Contrcuteur surcharge
	 * @param instructionSequence : liste d'instruction pour definir
	 * la sequence
	 */
	public Sequence(LinkedList<Instruction> instructionSequence) {
		this.instructionSequence = instructionSequence;
	}
	
	/**
	 * Methode permettant d'executer une sequence
	 */
	public void execute() {
		for(Instruction i : instructionSequence) {
			i.execute();
		}
	}
	
	/**
	 * Methode permettant de rajouter une instruction a la sequence
	 * @param i : instruction a rajouter
	 */
	public void addToSequence(Instruction i) {
		instructionSequence.addLast(i);
	}
}
