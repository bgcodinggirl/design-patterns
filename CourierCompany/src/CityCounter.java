
public class CityCounter extends Counter {
	
	Context cityContext = new Context(this);
	WaitingState waitingState = new WaitingState();
	PreparationState preparationState = new PreparationState();
	
	public CityCounter() {
		this.type = Counter.destination_city;
		waitingState.applyState(cityContext);
		System.out.println("City counter's current state: "+cityContext.getState().getStateName()+"\n");
		
	}
	
	@Override
	protected void parcelInfo(Parcel parcel) {
		preparationState.applyState(cityContext);
		System.out.println("City counter's current state: "+cityContext.getState().getStateName());
		System.out.println("City counter is preparing parcel  (-> No: "+parcel.getNumber()+" ("+parcel.getDescription()+") <-).");
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
		return cityContext.getState().getStateName();
	}

	@Override
	public String getCounterName() {
		return "city counter";
	}

}
