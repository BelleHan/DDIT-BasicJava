package chapter3;

public class TVExample {
	public static void main(String[] args) {
		
		TV tv1 = new TV(); //new 연산자를 이용해 생성할 때마다 새로운 공간에 새로운 객체가 만들어짐
		TV tv2 = new TV();
		TV tv3 = new TV();
		TV tv4 = new TV();
		TV tv5 = new TV();
		TV tv6 = new TV();
		TV tv7 = new TV();
		tv1.channel = 10;
		tv1.volume = 30;
		System.out.println(tv2.model); //초기화가 되어있지 않은 상태에서는 디폴트값이 출력됨. (int - 0, boolean - false, String - null)
		
	}
}
