package Assignment;

import java.util.Random;

public class Assignment58 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[6];
		
		for(int i = 0; i < 10000; i++) {
			int num = random.nextInt(6) + 1;
			
			for(int j = 1; j < 7; j++) {
				if (num == j) {
					arr[j-1] = arr[j-1] + 1;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i+1 + " : " + arr[i]);
		}
		
	}
}
