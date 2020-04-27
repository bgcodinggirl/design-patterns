
public interface Observable {
	public void subscribe(OnlineViewer viewer);
	public void unsubscribe(OnlineViewer viewer);
	public void notifyViewers();
	public boolean getUpdate();
}
