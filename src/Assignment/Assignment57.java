package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Assignment57 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String gamer = scanner.next();
		System.out.println("게이머: " + gamer);
	
		int com = random.nextInt(2);
		if (com == 0) {
			System.out.println("인공지능 컴퓨터: 가위" );
		} else if (com == 1) {
			System.out.println("인공지능 컴퓨터: 바위" );
		} else if (com == 2) {
			System.out.println("인공지능 컴퓨터: 보" );
		}
		
		if (gamer.equals("가위")) {
			if (com == 0) {
				System.out.println("결과: 비김!");
			} else if (com == 1) {
				System.out.println("결과: 컴퓨터 승리!");
			} else {
				System.out.println("결과: 게이머 승리!");
			}	
		} else if (gamer.equals("바위")) {
			if (com == 0) {
				System.out.println("결과: 게이머 승리!");
			} else if (com == 1) {
				System.out.println("결과: 비김!");
			} else {
				System.out.println("결과: 컴퓨터 승리!");
			}
		} else if (gamer.equals("보")) {
			if (com == 0) {
				System.out.println("결과: 컴퓨터 승리!");
			} else if (com == 1) {
				System.out.println("결과: 게이머 승리!");
			} else {
				System.out.println("결과: 비김!");
			}
		}

	}
}
