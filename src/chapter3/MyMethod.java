package chapter3;

public class MyMethod {
	public static void main(String[] args) { //클래스의 공간과 메서드의 공간이 서로 다르기 때문에 다시 객체 생성 해줘야 함
		MyMethod method = new MyMethod();
		method.method2(100);
		MyMethod.method3(100);
	}
	void method1(int num) {
		System.out.println("입력된 값은 " + num + "입니다.");
	}
	void method2(int num) {
		MyMethod.method3(200); //static은 공적인 것이기 때문에 객체 생성 없이 불러올 수 있다.
		method1(20);
		System.out.println("입력된 값은 " + num + "입니다.");
	}
	static void method3(int num) {
		MyMethod method = new MyMethod(); //static에서 static이 아닌 것을 불러올려면 객체를 생성해 주거나 양쪽 다 static으로 만들어 주어야 함
		method.method2(200);
		System.out.println(num * 3);
	}
}
