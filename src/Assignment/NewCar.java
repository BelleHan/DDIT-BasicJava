package Assignment;

public class NewCar {
	private double speed;
	private String color;
	private static double MAX_SPEED = 200.0;
	
	NewCar() {
	}
	NewCar(String color) {
		this.color = color;
	}
	
	double getSpeed() {
		return killoToMile(speed);
	}
	void setSpeed(double speed) {
		this.speed = speed;
	}
	
	String getColor() {
		return color;
	}
	void setSpeed(String color) {
		this.color = color;
	}
	
	boolean speedUp(double speed) {
		if (speed < MAX_SPEED) {
			this.speed = speed;
			return true;
		} else {			
			return false;
		}		
	}
	
	static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	double MileToKillo(double distance) {
		return distance*1.6;
	}
}


