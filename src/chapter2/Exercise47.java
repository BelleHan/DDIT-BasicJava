package chapter2;

public class Exercise47 {

	public static void main(String[] args) {
		int count = 0;
		for(int num = 1; num <= 10; num++) {
			for(int sum = 1; sum <= num; sum++) {
				count = count + sum;	
			}
		}
		System.out.println(count);
	}
}	

