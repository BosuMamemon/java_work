package test03;

public class Employee {
	
	int eno;
	String name;
	String dept;
	String position;
	int sal;
	
	public Employee() {}

	public Employee(int eno, String name, String dept, String position, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.sal = sal;
	}
	
	public void display() {
		System.out.printf("%d	|	%s	|	%s	|	%s	|	%d%n", eno, name, dept, position, sal);
	}

}
