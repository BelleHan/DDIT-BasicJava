package chapter2;

public class Question225 {

	public static void main(String[] args) {

		int [] score = new int[5];

		score[0] = 0;

		score[1] = 10;

		score[2] = 20;

		score[3] = 30;

		score[4] = 40;

		//1. 위의 내용을 반복문을 이용하여 바꾸어라.

		for (int i = 0; i < score.length; i++) {

			i += 10;

		}

		// 2. 1에서 작성된 변수 score에 저장된 요소를 결과와 같이 출력하여라.

		System.out.println("score[0] :" +score[0]);

		System.out.println("score[1] :" +score[1]);

		System.out.println("score[2] :" +score[2]);

		System.out.println("score[3] :" +score[3]);

		System.out.println("score[4] :" +score[4]);

	}

	}