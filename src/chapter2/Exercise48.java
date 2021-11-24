package chapter2;

public class Exercise48 {

	public static void main(String[] args) {
		 int sum=0;
	        int num=0;
	 
	        while(sum<100) {
	            ++num;
	            if(num%2==0) sum-=num;
	            else sum+=num;
	            //System.out.println("num="+num+"sum="+sum); // 과정을 볼 수 있다
	        }
	        System.out.println(num+"일 때, 총합이 "+sum+"이 된다.");	 
	    }
	}

