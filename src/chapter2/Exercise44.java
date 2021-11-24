package chapter2;


public class Exercise44 {

	public static void main(String[] args) {
	
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
				if (x + y == 6) {
					System.out.print(x);
					System.out.print(" + ");
					System.out.print(y);
					System.out.println(" = 6");
				}
			}
		}
	}
}
