
public class Trainee {
	private boolean position;
	
	public void lieDown() {
		System.out.println("The trainee is lying down.");
		this.position = true;
	}
	
	public void standUp() {
		System.out.println("The trainee is standing up.");
		this.position = false;
	}

	public boolean getPosition() {
		return position;
	}
}
