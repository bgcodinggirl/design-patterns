
public class Context {

	private Counter counter;
	private State state;
	
	public Context(Counter counter) {
		this.setCounter(counter);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

}
