
public class Courier implements Observer {
	
	private String name;
	private Observable state;
	
	public Courier(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(state == null || state.getUpdate().equals("")) {
			System.out.println("No state");
			return;
		}
		if(state.getUpdate().equals("Parcel preparation")) {
		System.out.println(this.name+" takes the parcel from the "+state.getCounterName()+" in order to ship it to the warehouse.");
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setState(Observable state) {
		this.state = state;
	}

}
