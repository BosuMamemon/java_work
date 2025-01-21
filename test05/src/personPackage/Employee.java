package personPackage;

public class Employee extends Person {
	
//	필드
	private int eno;
	private String dept;
	private String position;
	private int sal;
//	생성자
	public Employee() { super(); }
	public Employee(int eno, String name, int age, String gender, String dept, String position, int sal) {
		super(name, age, gender);
		this.eno = eno;
		this.dept = dept;
		this.position = position;
		this.sal = sal;
	}
//	getter, setter
	public int getEno() {
		return eno;
	}
	public String getDept() {
		return dept;
	}
	public String getPosition() {
		return position;
	}
	public int getSal() {
		return sal;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	//	메소드
	public void show() {
		System.out.printf("%d %s %d %s %s %s %d%n", eno, super.getName(), super.getAge(), super.getGender(), dept, position, sal);
	}

}
