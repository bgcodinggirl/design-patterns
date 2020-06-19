
public class InternationalCounter extends Counter{
	
	Context internationalContext = new Context(this);
	WaitingState waitingState = new WaitingState();
	PreparationState preparationState = new PreparationState();
	
	public InternationalCounter() {
		this.type = Counter.destination_abroad;
		waitingState.applyState(internationalContext);
		System.out.println("International counter's current state: "+internationalContext.getState().getStateName()+"\n");
	}
	
	@Override
	protected void parcelInfo(Parcel parcel) {
		preparationState.applyState(internationalContext);
		System.out.println("International counter's current state: "+internationalContext.getState().getStateName());
		System.out.println("International counter is preparing parcel  (-> No: "+parcel.getNumber()+" ("+parcel.getDescription()+") <-).");
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);	
		observer.setState(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return internationalContext.getState().getStateName();
	}

	@Override
	public String getCounterName() {
		return "international counter";
	}


}
