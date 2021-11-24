package chapter3;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		String buho = sc.next();
		int secondNum = sc.nextInt();
		Calc c = new Calc();

		if (buho.equals("+")) {
			System.out.println(c.add(firstNum,secondNum));
		}
		else if (buho.equals("-")) {
			System.out.println(c.substract(firstNum, secondNum));
		}
		else if (buho.equals("*")) {
			System.out.println(c.multiply(firstNum, secondNum));
		}
		else if (buho.equals("/")) {
			System.out.println(c.divide(firstNum, secondNum));
		}
		else {
			System.out.println("연산종료");
		}
	}
}
