package langage;

import java.util.ArrayList;
import java.util.List;

public class Script {
	
	private List<Instruction> inst;
	
	public Script() {
		inst = new ArrayList<Instruction>();
	}

	public void executer() {
		// TODO Auto-generated method stub
		for(int i = 0; i<inst.size(); i++) {
			inst.get(i).executer();
		}
	}
	
	public void ajouterInstruction(Instruction i) {
		inst.add(i);
	}
	
	

}
