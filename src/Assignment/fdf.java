package Assignment;

import java.util.Random;

public class fdf {

	public static void main(String[] args) {
	Random random = new Random();
	int[] arr = new int[6];
	
	for(int i = 0; i < 10000; i++) {
		int num = random.nextInt(6) + 1;
		
	if (num == 1) {
		arr[0] = arr[0] + 1;
	} else if (num == 2) {
		arr[1] = arr[1] + 1;
	} else if (num == 3) {
		arr[2] = arr[2] + 1;
	} else if (num == 4) {
		arr[3] = arr[3] + 1;
	} else if (num == 5) {
		arr[4] = arr[4] + 1;
	} else if (num == 6) {
		arr[5] = arr[5] + 1;
	}					
	}
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println(arr[5]);
	
}

}
