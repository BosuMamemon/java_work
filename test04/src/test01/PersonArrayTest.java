package test01;

import java.util.Scanner;

public class PersonArrayTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person[] persons = new Person[5];
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println("이름 입력: ");
			String name = sc.next();
			System.out.println("나이 입력: ");
			int age = sc.nextInt();
			System.out.println("성별 입력: ");
			String gender = sc.next();
			persons[i] = new Person(name, age, gender);
			System.out.println((i + 1) + "번째 Person 입력 완료.\n");
		}
		
		for(Person p: persons) {
			p.display();
		}
		
		sc.close();

	}

}
