package test01;

public class Student {

    int sno;
    String name;
    String major;

    public Student() {
    	this(0, "", "");
    	System.out.println("기본 생성자 호출됨");
    }
    
    public Student(int sno) {
		super();
		this.sno = sno;
	}

	public Student(int sno, String name) {
    	super();
    	this.sno = sno;
    	this.name = name;
    }

	public Student(int sno, String name, String major) {
    	super();
    	this.sno = sno;
    	this.name = name;
    	this.major = major;
    }
    		

	public void display() {
        System.out.printf("%d, %s, %s%n", sno, name, major);
    }

    

}
