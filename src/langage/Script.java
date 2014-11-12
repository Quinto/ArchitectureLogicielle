package langage;

import java.util.ArrayList;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Script implements IScript {

	private ArrayList<Instruction> liste;

	public Script(){
		this.liste = new ArrayList<Instruction>();
	}
	
	public ArrayList<Instruction> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Instruction> liste) {
		this.liste = liste;
	}
	
	public void addInstruction(Instruction i){
		this.liste.add(i);
	}
	
	public void removeInstruction(Instruction i) {
		this.liste.remove(i);
	}
	
	public void execute(){
		for(Instruction i : liste){
			i.execute();
		}
	}
}
