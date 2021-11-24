package chapter2;

public class Example215 {

	public static void main(String[] args) {
		String str = "184520";
		int sum = 0;
		for ( int count = 0; count < str.length(); count ++) {
			sum += str.charAt(count)-'0';
		}
		System.out.println(sum);
	}
}
