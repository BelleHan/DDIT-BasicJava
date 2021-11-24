package chapter2;

import java.util.Random;

public class Question226 {

	public static void main(String[] args) {
	      // 1. 정수 7개를 저장 할 수 있는 변수 score를 선언 및 생성하여라.
	      int[] score = new int[7];

	      // 2. 변수 score의 각 요소를 0이상 100이하인 임의의 정수를 저장하여라.
	      Random random = new Random();
	      for (int i = 0; i < score.length; i++) {

	         score[i] = random.nextInt(100) + 1;
	      }

	      // 3. 변수 score에 저장된 요소들의 합계를 구하여라.
	      int sum = 0;
	      System.out.print("score의 값:{ ");
	      for (int i = 0; i < score.length; i++) {
	         sum += score[i];

	         System.out.print(+score[i] + " ");
	         // System.out.println("score의 값: " + Arrays.toString(score));
	      }
	      System.out.print("}");
	      System.out.println();

	      System.out.println("총점: " + sum);

	      // 4. 변수 score에 저장된 요소들의 평균들을 구하여라.
	      // 단 소수점 세번째 자리에서 반올림 하여 두번쨰 자리까지 표현하여라.
	      float average = 0f;
	      average = sum / (float) score.length;
	      System.out.println("평균: " + (Math.round(average * 100) / 100.00));
	      // 5.
	      int max = score[0];
	      int min = score[0];
	      
	      for (int i = 0; i < score.length; i++) {
	         if (score[i] > max) {
	            max = score[i];
	         } else if (score[i] < min) {
	            min = score[i];
	         }
	      }
	      System.out.println("최대값: " + max);
	      System.out.println("최소값: " + min);

	   }

	}