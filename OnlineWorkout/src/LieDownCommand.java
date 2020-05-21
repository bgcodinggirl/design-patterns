
public class LieDownCommand implements Command {

	private Trainee traineePosition;
	
	public LieDownCommand(Trainee position) {
		this.traineePosition = position;
	}

	@Override
	public void changePosition() {
		System.out.println("Lie down!");
		this.traineePosition.lieDown();
	}

}
