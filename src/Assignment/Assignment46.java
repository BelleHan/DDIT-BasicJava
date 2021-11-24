package Assignment;

import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
		System.out.print("몇 번째 항까지 출력하시겠습니까?(3 이상 입력): ");
		input = scanner.nextInt();

		if (input < 3) {
			System.out.println("3 이상의 수를 입력해 주세요.");
		}
		} while (input < 3);
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2);
		
		for (int i = 0 ; i < (input-2); i++) {
			num3 = num1 + num2;
			System.out.print(","+num3);
			
			num1 = num2;
			num2 = num3;			
		}
		
	}
}