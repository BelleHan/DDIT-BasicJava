package Assignment;

public class NewCarTest {
	public static void main(String[] args) {
			NewCar myCar = new NewCar("red");
			System.out.println(myCar.getColor());
			System.out.println(Car.getMaxSpeed());
			
			if (myCar.speedUp(100.0)) {
				System.out.println("변경 가능");
			} else {
				System.out.println("불가능");
			}
			System.out.println(myCar.getSpeed());

		}
	}

