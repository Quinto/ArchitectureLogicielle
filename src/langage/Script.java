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

	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
	public ArrayList<IScript> getListe() {
		return liste;
	}

	public void setListe(ArrayList<IScript> liste) {
		this.liste = liste;
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
		for(IScript i : liste){
			i.execute();
		}
	}
	

	

}
