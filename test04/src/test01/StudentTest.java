package test01;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "성춘향", "철학과");
		
		s1.display();
		s2.display();
		s3.display();
		
	}
	
}
