package Assignment;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(3.6);
		circle1.setX(0.0);
		circle1.setY(1.5);
		
		System.out.println(circle1.getRadius());
		System.out.println(circle1.getX()+","+circle1.getY());
		System.out.println(circle1.getArea());

		Circle circle2 = new Circle();
		circle2.setRadius(-5.0);
		circle2.setX(1.0);
		circle2.setY(2.2);
		
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getX()+","+circle2.getY());
		System.out.println(circle2.getArea());
	}

}
