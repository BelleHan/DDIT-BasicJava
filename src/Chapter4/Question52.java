package Chapter4;

import java.util.regex.Pattern;

public class Question52 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z][2,3]", "ssss"));
		
		System.out.println(Pattern.matches("[a-zA-z]{3}[0-9]+", "xyz32"));
		
		System.out.println(Pattern.matches("\\d{3}-\\d{4}-\\d{4}", "010-4051-3806"));
		
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", "010-1234-4567"));
		
		System.out.println(Pattern.matches("01[01789]-[1-9]{3}-[0-9]{4}", "010-123-4567"));
		
		System.out.println(Pattern.matches("[0-9]{6}-[1-4][0-9]{6}", "991122-2845736"));
		
		System.out.println(Pattern.matches("[a-zA-Z]+[-_\\.]*[a-zA-Z0-9]*@[a-zA-Z]{1,7}.[a-zA-Z]{2,3}.?k?r?", "s_3274b@ddit.or.kr"));
		//선생님 모범답안
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z0-9-_\\.]*@[a-zA-Z0-9]{1,7}.[a-zA-Z0-9]{2,3}(.kr)?", "s_3274b@ddit.or.kr"));
		
	}
}
