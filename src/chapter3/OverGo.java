package chapter3;

public class OverGo extends OverUp {
	int z = 3;
	
	@Override
	String upMethod() {
		
		return x + y + z + ":오버라이딩";
	}
	
	String downMethod() {
		return "Basic";
	}
	
	String downMethod(int k) {
		return x + y + z + k + ": 오버로딩";
	}

}
