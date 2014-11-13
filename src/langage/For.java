package langage;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class For extends Instruction {

	private Script script;
	private int nbFois;
	
	public For(Script script, int nbFois){
		this.script = script;
		this.nbFois = nbFois;
	}

	/**
	 * Procedure permettant d'executer la boucle For
	 */
	@Override
	public void execute(){
		for(int i=0; i<this.getNbFois(); i++){
			this.getScript().execute();
		}
		
	}
	
	/************************************************************
	 ************************************************************
	 ******************** GETTERS AND SETTERS *******************
	 ************************************************************
	 ************************************************************/
	
	public Script getScript() {
		return script;
	}

	public void setScript(Script s) {
		this.script = s;
	}

	public int getNbFois() {
		return nbFois;
	}

	public void setNbFois(int nbFois) {
		this.nbFois = nbFois;
	}
}
