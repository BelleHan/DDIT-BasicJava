package chapter2;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static void main(String[] args) {
		// random한 수 구하기
		// 1. 공식: (int) Math.random() * 마지막수 + 1) + 처음 수
		System.out.println((int) (Math.random() * 10) + 1);
		// 2. Random이라는 클래스를 이용하는 방법
		Random random = new Random();
		int num = random.nextInt(10) + 1; // => 1부터 10까지
		System.out.println(num);
		
		//입력받기
		Scanner scanner = new Scanner(System.in);
	    int inputNum = scanner.nextInt();
		System.out.println("입력하신 숫자는: " + inputNum);
		
		
	}

}
