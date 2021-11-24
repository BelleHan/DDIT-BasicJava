package chapter3;
public class Calc {
	
	int add( int a, int b)
	{
		return a + b; //result  변수 선언 안하고 이렇게도 가능
	}
	
	int substract( int a, int b)
	{
		int result = a - b;
		return result;
	}
	
	long multiply( int a, int b)
	{
		long result = a * b;
		return result;
	}
	
	double divide( int a, int b)
	{
		double result = (double) a / b;
		
		return (int)(result * 10 + 0.5) / 10.0;
	}
}
