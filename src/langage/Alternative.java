package langage;

public class Alternative extends Instruction {

	private boolean condition;
	private IScript res1;
	private IScript res2;
	
	public Alternative(boolean condition, IScript res1, IScript res2) {
		this.condition = condition;
		this.res1 = res1;
		this.res2 = res2;
	}
	
	public void execute() {
		if(condition) {
			res1.execute();
		}
		else {
			res2.execute();
		}
	}
}
