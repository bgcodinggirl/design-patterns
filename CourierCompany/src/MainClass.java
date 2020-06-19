
public class MainClass {
	
	private static Counter getChain() {
		Counter internationalCounter = new InternationalCounter();
		Counter countryCounter = new CountryCounter();
		Counter cityCounter = new CityCounter();
		internationalCounter.setNextCounter(countryCounter);
		countryCounter.setNextCounter(cityCounter);
		return internationalCounter;
	}
	
	public static void main(String[] args) {

		Observer worker = new Courier("Worker 1");
		Counter chain = getChain();
		chain.subscribe(worker);
		chain.handleParcel(new Parcel(2,"nike sweatshirts","abroad"));
		chain.handleParcel(new Parcel(1,"white sneakers","city"));
		chain.handleParcel(new Parcel(3,"bermuda shorts","country"));
	}
	

}
