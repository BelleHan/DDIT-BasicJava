package Assignment;

import java.util.Scanner;

public class Assignment54 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		
		int num = scanner.nextInt(10);
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(num + "*" + i + "=");
			System.out.println(num*i);
		}

	}

}
