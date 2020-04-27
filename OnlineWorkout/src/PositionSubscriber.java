
public class PositionSubscriber implements OnlineViewer {

	private Observable status;
	private String name;
 

	public PositionSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.status == null) {
			System.out.println(this.status+ "has no status/position set");
			return;
		}
		boolean latestPosition = this.status.getUpdate();
		if(latestPosition == false) {
			System.out.println("-> "+this.name+" is standing up.");
		}
		else {
			System.out.println("-> "+this.name+ " is lying down.");
		}

		}

	@Override
	public void setPosition(Observable status) {
		this.status = status;
	}

}
