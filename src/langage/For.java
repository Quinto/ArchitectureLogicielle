package langage;

public class For {

	private Script script;
	private int nbFois;
	
	public For(Script script){
		this.script = script;
		this.executer();
	}

	public Script getScript() {
		return script;
	}

	public void setI(Script s) {
		this.script = s;
	}

	public int getNbFois() {
		return nbFois;
	}

	public void setNbFois(int nbFois) {
		this.nbFois = nbFois;
	}
	
	public void executer(){
		for(int i=0; i<this.getNbFois(); i++){
			this.getScript().executer();
		}
		
	}
}
