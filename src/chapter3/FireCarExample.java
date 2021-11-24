package chapter3;

public class FireCarExample {
	public static void main(String[] args) {
		FireCar firecar = new FireCar();
		Car c = new FireCar();
		FireCar f = (FireCar) c;
		f.water();
		
		
	}
}
