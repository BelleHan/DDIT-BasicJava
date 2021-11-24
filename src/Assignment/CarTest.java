package Assignment;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("red");
		System.out.println(myCar.getColor());
		System.out.println(Car.getMaxSpeed());
		
		if (myCar.speedUp(190.0)) {
			System.out.println("변경 가능");
		} else {
			System.out.println("불가능");
		}
		System.out.println(myCar.getSpeed());

	}

}
