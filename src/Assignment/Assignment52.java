package Assignment;

import java.util.Scanner;

public class Assignment52 {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		if (age >= 20 && age <= 29) {
			System.out.println("20대입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
		

	}

}
