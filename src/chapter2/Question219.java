package chapter2;

public class Question219 {

	public static void main(String[] args) {
		//1. 0 이상 5 이하에서 정수를 결과와 같이 출력하여라.
		// 0 1 2 3 4 5
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		// 3. 2 이상 10 이하의 정수를 합계를 구하여라.
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		long num = 1l;
		for (int i = 5; i < 15; i++) {
			num = num * i;
		}
		System.out.println(num);
		
		int x = 0;
		for (int i = 3; i <= 4462; i += 2) {
			x += i;
		}
		System.out.println(x);
		
		int y = 0;
		for (int i = 8; i < 57; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				y += i;
			}
		}
		System.out.println(y);
	}

}
