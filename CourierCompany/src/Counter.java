import java.util.ArrayList;
import java.util.List;

public abstract class Counter implements Observable{
	 public static int destination_city = 1;
	 public static int destination_country = 2;
	 public static int destination_abroad = 3;
	 
	 protected int type;
	 String name;
	 protected Counter nextCounter;
	 protected List<Observer> observers = new ArrayList<Observer>();
	 Context counterContext = new Context(this);
	 WaitingState waitingState = new WaitingState();
	
	public void setNextCounter(Counter nextCounter) {
		this.nextCounter = nextCounter;
	}
	public void resetState() {
		waitingState.applyState(counterContext);
		System.out.println("The counter's state is changed to: "+counterContext.getState().getStateName()+"\n");
	}
	public void handleParcel(Parcel parcel) {

		int type = 0;
		switch(parcel.getDestination().toLowerCase()) {
			case "city": {type=1;break;}
			case "country": {type=2;break;}
			default: {type=3;break;}
		}
		if(this.type <= type) {
			this.parcelInfo(parcel);
			resetState();
			return;
		}
		if(this.nextCounter!=null) {
			this.nextCounter.handleParcel(parcel);
		}
	}
	abstract protected void parcelInfo(Parcel parcel);
}
