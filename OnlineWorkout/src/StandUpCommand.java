
public class StandUpCommand implements Command {

	private Trainee traineePosition;
	
	public StandUpCommand(Trainee traineePosition) {
		this.traineePosition = traineePosition;
	}

	@Override
	public void changePosition() {
		System.out.println("Stand up!");
		this.traineePosition.standUp();
		
	}

}
