package chapter3;

public class SingletonExample {
	public static void main(String[] args) {
		MySingleton instance1 = Mysingleton.getInstance();
		MySingleton instance2 = Mysingleton.getInstance();
		if (instance1 == instance2) {
			System.out.println("같다");
		}
		Car car1 = new Car("a");
		Car car2 = new Car("a");
		if (car1 == car2) {
			System.out.println("car는 같은 객체");
		}
	}
}
