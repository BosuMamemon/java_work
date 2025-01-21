package personPackage;

public class PersonMain {
	
	static void display(Person p, String str) {
		p.show();
		
//		if(str.equals("p")) p.show();
//		else if(str.equals("s")) {
//			Student s = (Student)p;
//			s.show();
//		} else if(str.equals("e")) {
//			Employee e = (Employee)p;
//			e.show();
//		}
	}
	
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("김", 20, "남자");
		persons[1] = new Student(1, "이", 30, "여자", "컴퓨터공학과");
		persons[2] = new Employee(1, "박", 40, "기타", "개발팀", "팀장", 4000000);
		for(Person p: persons) { p.show(); }
		
		Person p1 = new Person("김", 50, "남자");
		Student s1 = new Student(2, "이", 60, "여자", "컴퓨터공학과");
		Employee e1 = new Employee(2, "박", 70, "기타", "개발팀", "팀장", 4000000);
		display(p1, "p");
		display(s1, "s");
		display(e1, "e");
	}

}
