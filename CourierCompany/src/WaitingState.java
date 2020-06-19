
public class WaitingState implements State {

	private String stateName = "Stand and wait...";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
