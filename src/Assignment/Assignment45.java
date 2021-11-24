package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
		System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
		num = sc.nextInt();
		
		if (num < answer) {
			System.out.println("정답은 더 큰 수입니다.");
		} else if (num > answer) {
			System.out.println("정답은 더 작은 수입니다.");
		}	
		} while (num != answer);
		System.out.println("정답입니다.");
	}
}
