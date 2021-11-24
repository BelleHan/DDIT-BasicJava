package Chapter4;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class ComparableExample {
	public static void main(String[] args) {
		//배열 정렬
		int[] numArr = {96, 4, 28, 89, 0, 32, 68, 39, 29, 84, 91};
		//Integer a = 10; 	//autoboxing
		//int b = a; 		//unboxing
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));
	}
	
	
}
