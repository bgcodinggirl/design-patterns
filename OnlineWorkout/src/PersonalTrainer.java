
public class PersonalTrainer {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void giveExercise() {
		System.out.print("Personal trainer: ");
		this.command.changePosition();
	}

}
