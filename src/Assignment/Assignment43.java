package Assignment;

import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("프로그래밍 기초: ");
		int a = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int b = scanner.nextInt();
		System.out.print("화면 구현: ");
		int c = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int d = scanner.nextInt();
		System.out.print("머신러닝: ");
		int e = scanner.nextInt();
		
		System.out.print("총점: ");
		System.out.println(a+b+c+d+e);
		System.out.print("평균: ");
		System.out.println((a+b+c+d+e)/5);
		System.out.print("학점: ");
		
		if ((a+b+c+d+e)/5 >= 90) {
			System.out.println("A");
		} else if ((a+b+c+d+e)/5 >= 80) {
			System.out.println("B");
		} else if ((a+b+c+d+e)/5 >= 70) {
			System.out.println("C");
		} else if ((a+b+c+d+e)/5 >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
