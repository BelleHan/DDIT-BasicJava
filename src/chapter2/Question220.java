package chapter2;

public class Question220 {

	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
		//1. 구구단의 짝수단만 출력하여라
		for (int dan = 2; dan < 10; dan+=2) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
		//2. 구구단의 짝수 단의 홀수 곱을 출력하여라
		for (int dan = 2; dan < 10; dan+=2) {
			for (int i = 1; i < 10; i+=2) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}
	
}
