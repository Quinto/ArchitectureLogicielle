package langage;

import java.util.LinkedList;
import java.util.List;

public class Sequence extends Instruction {

	private LinkedList<Instruction> instructionSequence;
	
	public Sequence() {
		this.instructionSequence = new LinkedList<Instruction>();
	}
	public Sequence(LinkedList<Instruction> instructionSequence) {
		this.instructionSequence = instructionSequence;
	}
	
	public void execute() {
		for(Instruction i : instructionSequence) {
			i.execute();
		}
	}
	
	public void addToSequence(Instruction i) {
		instructionSequence.addLast(i);
	}
}
