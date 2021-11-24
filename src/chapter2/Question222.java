package chapter2;

public class Question222 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		while ( count <= 100) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);
	}
}
