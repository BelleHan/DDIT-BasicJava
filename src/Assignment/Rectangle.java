package Assignment;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width*height;
	}
	
	@Override
	public double perimeter() {
		return (width+height)*2;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 사각형");
		builder.append(", 도형의 둘레: ");
		builder.append(perimeter());
		builder.append("cm, 도형의 넓이: ");
		builder.append(area());
		builder.append("cm²");
		return builder.toString();
	}
}
