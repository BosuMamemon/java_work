package personPackage;

public class Student extends Person {

//	필드
	private int sno;
	private String major;
//	생성자
	public Student() { super(); }
	public Student(int sno, String name, int age, String gender, String major) {
		super(name, age, gender);
		this.sno = sno;
		this.major = major;
	}
//	메소드
	public void show() {
		System.out.printf("%d %s %d %s %s%n", sno, super.getName(), super.getAge(), super.getGender(), major);
	}
	
}
