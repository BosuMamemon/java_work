package test01;

public class Person {
	
	public String name;
	public int age;
	public String gender;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.print("name = " + this.name + " / ");
		System.out.print("age = " + this.age + " / ");
		System.out.print("gender = " + this.gender + " / ");
		System.out.println();
	}

	public boolean nameEqual(Person p) {
		if(this.name.equals(p.name)) {
			return true;
		} else {
			return false;
		}
	}

}
