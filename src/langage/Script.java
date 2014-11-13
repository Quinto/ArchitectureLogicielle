package langage;

import java.util.ArrayList;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Script implements IScript {

	private ArrayList<IScript> liste;

	public Script(){
		this.liste = new ArrayList<IScript>();
	}
	
	public ArrayList<IScript> getListe() {
		return liste;
	}

	public void setListe(ArrayList<IScript> liste) {
		this.liste = liste;
	}
	
	public void addInstruction(Instruction i){
		this.liste.add(i);
	}
	
	public void removeInstruction(Instruction i) {
		this.liste.remove(i);
	}
	
	public void execute(){
		for(IScript i : liste){
			i.execute();
		}
	}
}
