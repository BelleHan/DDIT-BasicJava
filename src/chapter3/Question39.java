package chapter3;

import java.util.Random;

public class Question39 {
		public static void main(String[] args) {
			int distance = doubleDice();
			System.out.println(distance);
		}
		
		static int doubleDice () 
		{	
		Random random = new Random();
		
		int firstDice = random.nextInt(6) + 1;
		int secondDice = random.nextInt(6) + 1;
		int result = firstDice + secondDice;
		System.out.println(firstDice + ", " + secondDice);
		if (firstDice == secondDice) {
			result += doubleDice();
		}
		return result; 
					
		}

	}


