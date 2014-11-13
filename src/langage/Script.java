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
	
	/**
	 * Methode permettant d'ajouter une instruction au script
	 * @param i : instruction a rajouter
	 */
	public void addInstruction(Instruction i){
		this.liste.add(i);
	}
	
	/**
	 * Methode permettant de supprimer une instruction du script
	 * @param i : instruction a supprimer
	 */
	public void removeInstruction(Instruction i) {
		this.liste.remove(i);
	}
	
	/**
	 * Methode permettant d'executer le script, c'est a dire toutes
	 * les instructions qu'il contient
	 */
	public void execute(){
		for(Instruction i : liste){
			i.execute();
		}
	}
	
	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
	public ArrayList<Instruction> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Instruction> liste) {
		this.liste = liste;
	}
}
