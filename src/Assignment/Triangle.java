package Assignment;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side*side*Math.sqrt(3)/4;
	}
	
	@Override
	public double perimeter() {
		return side*3;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 삼각형");
		builder.append(", 도형의 둘레: ");
		builder.append(perimeter());
		builder.append("cm, 도형의 넓이: ");
		builder.append(area());
		builder.append("cm²");
		return builder.toString();
	}
}
