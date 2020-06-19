
public class Parcel {
	
	private int number;
	private String description;
	private String destination;
	
	public Parcel(int number,String description, String destination) {
		this.setNumber(number);
		this.setDescription(description);
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
