package chapter2;

import java.util.Scanner;

public class Exercise46 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("시작값을 입력하시오.");
	      int start = sc.nextInt();            
	      System.out.print("종료값을 입력하시오.");
	      int end = sc.nextInt();               
	      int result = start;                  
	      for(int i = start+1; i <= end; i++) {   
	         result *= i;                  
	      }
	      System.out.println("결과 : " + result);  
	}
}
