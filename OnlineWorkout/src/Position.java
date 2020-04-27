import java.util.ArrayList;
import java.util.List;

public class Position implements Observable {
	
	private List<OnlineViewer> onlineViewers = new ArrayList<OnlineViewer>();
	private boolean position;

	@Override
	public void subscribe(OnlineViewer viewer) {
		this.onlineViewers.add(viewer);
		viewer.setPosition(this);
	}

	@Override
	public void unsubscribe(OnlineViewer viewer) {
		this.onlineViewers.remove(viewer);
	}

	@Override
	public void notifyViewers() {
		for(OnlineViewer onlineViewer: this.onlineViewers) {
			onlineViewer.update();
		}
	}
	
	public void setNewPosition(boolean position) {
		this.position = position;
		notifyViewers();
	}
	
	@Override
	public boolean getUpdate() {
		return this.position;
	}

}
