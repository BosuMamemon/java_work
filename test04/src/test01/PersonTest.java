package test01;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = "남자";
		p1.display();

		System.out.println();
		
		Person p2 = new Person("홍길동", 30, "여자");
		p2.name = "성춘향";
		p2.display();
		p2.setName("선덕여왕");
		p2.display();

		System.out.println();

		System.out.println("p1 = p2? " + p1.nameEqual(p2));

	}

}
