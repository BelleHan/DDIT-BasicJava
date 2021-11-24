package Assignment;

public class Circle {
		private double radius;
		private double x;
		private double y;
		
		public Circle() {
		}
		 double getRadius() { 
		 return radius;
		 }
		 void setRadius(double radius) { 
		 if (radius>0) {
		 this.radius = radius;
		 }
		 else {
		 radius = 0;
		 }
		 }
		 
		 double getX() { 
		 return x;
		 }
		 void setX(double x) { 
		 this.x = x;
		 }
		 
		 double getY() { 
		 return y;
		 }
		 void setY(double y) { 
		 this.y = y;
		 }
		 
		 double getArea() {
		 return Math.PI*radius*radius;
		 }
}
