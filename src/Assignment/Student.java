package Assignment;

public class Student extends Human {
	private String major;
	
	Student(String name, int age, String major) {
		super.name = name;	//super(name, age) 부모객체를 private으로 선언시 super생성자를 만들어서 사용
		super.age = age;
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 전공: ");
		builder.append(major);
		return builder.toString();
	}
}
