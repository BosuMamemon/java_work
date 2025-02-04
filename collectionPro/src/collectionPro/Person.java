package collectionPro;

public class Person {
	
//	필드
	private String name;
	private int age;
	private String gender;
	
//	생성자
	public Person() {}
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
//	getters, setters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.printf("%s / %d / %s%n", this.getName(), this.getAge(), this.getGender());
	}
	
}
