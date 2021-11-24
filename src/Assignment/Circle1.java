package Assignment;

public class Circle1 extends Shape {
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public double perimeter() {
		return Math.PI*2*radius;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 원");
		builder.append(", 도형의 둘레: ");
		builder.append(perimeter());
		builder.append("cm, 도형의 넓이: ");
		builder.append(area());
		builder.append("cm²");
		return builder.toString();
	}
}
