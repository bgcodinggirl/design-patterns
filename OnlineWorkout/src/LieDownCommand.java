
public class LieDownCommand implements Command {

	private Trainee position;
	
	public LieDownCommand(Trainee position) {
		this.position = position;
	}

	@Override
	public void changePosition() {
		System.out.println("Lie down!");
		this.position.lieDown();
	}

}
