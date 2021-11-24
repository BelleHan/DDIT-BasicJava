package chapter3;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	private MySingleton() {
	}
	MySingleton getInstance() {
		return instance;
	}
}
