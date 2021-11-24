package chapter2;

public class Exercise410 {
	public static void main(String[] args) {
        int num1=1;
        int num2=1;
        int num3=0; 
        System.out.print(num1+","+num2);
 
        for(int i=0;i<4;i++) {
            num3 = num1 + num2;
            num1 = num3;
            num2 = num3 + num2;
            System.out.print(","+num1+","+num2);
 
        }
    }
}

