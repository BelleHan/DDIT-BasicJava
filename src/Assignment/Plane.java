package Assignment;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	Plane() {
	}
	Plane(String manufacture, String model, int maxNumberOfPassengers) {		
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	String getManufacture() {
		return manufacture;
	}
	void setManufacture() {
		this.manufacture = manufacture;
	}
	
	String getModel() {
		return model;
	}
	void setModel() {
		this.model = model;
	}
	
	int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	void setMaxNumberOfPassengers() {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	static int getNumberOfPlanes() {
		
		return numberOfPlanes;
	}
	

	}

