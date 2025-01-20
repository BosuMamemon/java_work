package packagepro;

public class StudentEx {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(1, "홍길동", "컴퓨터공학과");
		Student student3 = new Student();
		
		student1.setSno(2);
		student1.setName("성춘향");
		student1.setMajor("정보통신학과");
		
		System.out.println(student1.getSno());
		System.out.println(student1.getName());
		System.out.println(student1.getMajor());
		
		System.out.println(student2.getSno());
		System.out.println(student2.getName());
		System.out.println(student2.getMajor());
		
//		System.out.println(student1.getCount());
//		System.out.println(student2.getCount());
//		System.out.println(student3.getCount());
		System.out.println(Student.getCount());
//			심지어 객체를 안만들어도 그냥 클래스 이름으로도 static 멤버는 접근이 가능함
	}

}
