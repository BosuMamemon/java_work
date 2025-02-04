package collectionPro;

import java.util.Scanner;
import java.util.Vector;

public class ExProblem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Person> persons = new Vector<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("이름을 입력해주세요. >>");
			String name = sc.next();
			System.out.println("나이를 입력해주세요. >>");
			int age = sc.nextInt();
			System.out.println("성별을 입력해주세요. >>");
			String gender = sc.next();
			
			persons.add(new Person(name, age, gender));
			System.out.println((i + 1) + "번째 Person 컬렉션 삽입 완료.");
			System.out.println();
		}
		
		while(true) {
			System.out.println();
			System.out.println("1. 컬렉션 전체 출력\n2. 컬렉션 검색\n3. 종료");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println();
				for(Person p: persons) {
					p.print();
				}
			} else if (input == 2) {
				System.out.println("검색할 Person의 이름을 입력하세요");
				String search = sc.next();
				while(true) {
					boolean flag = false;
					for(Person p: persons) {
						if(search.equals(p.getName())) {
							p.print();
							flag = true;
						}
					}
					if(flag) break;
					System.out.println("검색 결과가 없습니다.");
					break;
				}
			} else if (input == 3)
				break;
		}
		
		System.out.println("입력을 종료합니다.");
		sc.close();
		
	}
	
}
