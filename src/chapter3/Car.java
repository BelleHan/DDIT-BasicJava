package chapter3;

public class Car {
	String color;
	String gearType;
	int door;
	public Car() {
		
	}
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public static void main(String[] args) {
		new Car();
		Car car = new Car("파랑", "manual", 5 );
		
	}
	public void drive() {
		System.out.println("출발~");
	}
}
