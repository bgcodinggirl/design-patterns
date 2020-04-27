
public class StandUpCommand implements Command {

	private Trainee position;
	
	public StandUpCommand(Trainee position) {
		this.position = position;
	}

	@Override
	public void changePosition() {
		System.out.println("Stand up!");
		this.position.standUp();
	}

}
