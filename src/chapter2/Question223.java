package chapter2;

public class Question223 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 1;
		while (sum <= 200) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
