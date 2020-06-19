
public class CountryCounter extends Counter {
	
	Context countryContext = new Context(this);
	WaitingState waitingState = new WaitingState();
	PreparationState preparationState = new PreparationState();
	
	public CountryCounter() {
		this.type = Counter.destination_country;
		waitingState.applyState(countryContext);
		System.out.println("Country counter's current state: "+countryContext.getState().getStateName()+"\n");
	}
	
	@Override
	protected void parcelInfo(Parcel parcel) {
		preparationState.applyState(countryContext);
		System.out.println("Country counter's current state: "+countryContext.getState().getStateName());
		System.out.println("Country counter is preparing parcel  (-> No: "+parcel.getNumber()+" ("+parcel.getDescription()+") <-).");
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
		return countryContext.getState().getStateName();
	}

	@Override
	public String getCounterName() {
		return "country counter";
	}

}
