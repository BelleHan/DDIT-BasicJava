package chapter3;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// 3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		// 단, names와 subject의 길이를 이용하여라.
		String[] names = new String[6];
		names[0] = "정현희";
		names[1] = "장하늘";
		names[2] = "노홍철";
		names[3] = "박명수";
		names[4] = "유재석";
		names[5] = "정준하";
		
		String[] subjects = new String[7];
		subjects[0] = "국어";
		subjects[1] = "영어";
		subjects[2] = "수학";
		subjects[3] = "사회";
		subjects[4] = "과학";
		subjects[5] = "Oracle";
		subjects[6] = "Java";
		
		int[][] scores = new int[names.length][subjects.length];
		// score의 모든 요소에 0 ~ 100 사이의 임의의 정수 값을 저장하여라.
		Random random = new Random();
		scores[0][0] = random.nextInt(101);
		for( int i = 0; i < scores.length; i++) {	
			
			for( int j = 0; j < scores[i].length; j++) {
				scores[i][j] = random.nextInt(101);
					
			}
		}
		
	}
}
