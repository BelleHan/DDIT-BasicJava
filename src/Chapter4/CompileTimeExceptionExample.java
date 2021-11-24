package Chapter4;

public class CompileTimeExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
