package Assignment;

import java.util.Scanner;

public class Assignment44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cs = sc.next();
		System.out.print("영희: ");
		String yh = sc.next();
		System.out.print("결과: ");
		
		if (cs.equals("가위")) {
			if (yh.equals("가위")) {
				System.out.println("비김!");
			} else if (yh.equals("바위")) {
				System.out.println("영희 승리!");
			} else if (yh.equals("보")) {
				System.out.println("철수 승리!");
		    } else {
		    	System.out.println("잘못 입력");
		    }
		}
		
		if (cs.equals("바위")) {
			if (yh.equals("가위")) {
				System.out.println("철수 승리!");
			} else if (yh.equals("바위")) {
				System.out.println("비김!");
			} else if (yh.equals("보")) {
				System.out.println("영희 승리!");
		    } else {
		    	System.out.println("잘못 입력");
		    }
		}
		
		if (cs.equals("보")) {
			if (yh.equals("가위")) {
				System.out.println("영희 승리!");
			} else if (yh.equals("바위")) {
				System.out.println("철수 승리!");
			} else if (yh.equals("보")) {
				System.out.println("비김!");
		    } else {
		    	System.out.println("잘못 입력");
		    }
		}
		
	}

}
