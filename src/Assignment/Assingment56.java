package Assignment;

import java.util.Random;

public class Assingment56 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int [6];
	
		for(int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
				
	}

}
