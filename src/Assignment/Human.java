package Assignment;

public class Human {
	protected String name;
	protected int age;
	
	public Human() {
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("이름: ");
		builder.append(name);
		builder.append(", 나이: ");
		builder.append(age);
		return builder.toString();
	}
	
}
