package langage;

import java.util.ArrayList;

public class Script {

	private ArrayList<Instruction> liste;

	public Script(){
		this.liste = new ArrayList<Instruction>();
	}
	
	public Script(ArrayList<Instruction> liste){
		this.liste = liste;
	}
	
	public ArrayList<Instruction> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Instruction> liste) {
		this.liste = liste;
	}
	
	public void executerInstruction(Instruction i){
		this.liste.add(i);
	}
	
	public void executer(){
		for(Instruction i : liste){
			i.executer();
		}
	}
}
