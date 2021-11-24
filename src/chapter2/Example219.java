package chapter2;

public class Example219 {

	public static void main(String[] args) {
		// 1. 정수 7개를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		
		int[] score = new int[7];
		
		// 2. 변수 score의 각 요소를 0 이상 100 이하인 임의의 정수를 저장하여라.
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random()*100+1);			
		}
		
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += score[i];
		}
		System.out.println(sum/100);
	}

}
		// 3. 변수 score에 저장된 요소들의 합계를 구하여라.

		// 4. 변수 score에 저장된 요소들의 평균을 구하여라.

		// 5. 변수 score에 저장된 요소에서 최댓값을 구하여라.

		// 6. 변수 score에 저장된 요소에서 최솟값을 구하여라.

		// 7. 1~6번의 결과를 이용하여 결과와 같이 출력하여라.