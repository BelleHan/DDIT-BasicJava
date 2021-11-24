package Assignment;

public class Assignment55 {

	public static void main(String[] args) {
		int[] arr = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}

}
