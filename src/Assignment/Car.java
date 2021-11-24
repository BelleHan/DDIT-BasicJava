package Assignment;

public class Car {
	private double speed;
	private String color;
	private static double MAX_SPEED = 200.0;
	
	Car() {
	}
	Car(String color) {
		this.color = color;
	}
	
	double getSpeed() {
		return speed;
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
		if (speed < 0 || speed > MAX_SPEED) {
			return false;
		} else {
			this.speed = speed;
			return true;
		}		
	}
	
	static double getMaxSpeed() {
		return MAX_SPEED;
	}
}
