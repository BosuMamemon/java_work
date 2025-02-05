package homework_7th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//	학생 정보를 나타내는 Student 클래스에 이름, 학과, 학번, 학점, 학점을 평균저장하는 필드를 작성하라.  
//	(1) 학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student> 컬렉션에 저장한 후에, 
//	ArrayList<Student>의 모든 학생(5명)의 정보를 출력하고,
//	학생의 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
//	(2) ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라.
//	해시맵의 키는 학생이름으로 한다.

public class Ex03_2 {
	
	public static void main(String[] args) {
		
//		객체 등 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> students = new HashMap<>();
		
//		Student 객체 5개 HashMap 삽입 및 출력
		System.out.println("학생 이름, 학과, 학번, 평균학점을 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print(" >> ");
			String name = scanner.next();
			String major = scanner.next();
			int sNum = scanner.nextInt();
			double credit = scanner.nextDouble();
			
			students.put(name, new Student(name, major, sNum, credit));
		}
		
		Set<String> keys = students.keySet();
		Iterator<String> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			System.out.println("--------------------------------------------");
			System.out.println(students.get(keysIt.next()).toString());
		}
		
//		학생 검색 및 평균학점 출력
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.print("학생 이름 >> ");
			String input = scanner.next();
			if(input.equals("그만")) break;
			
			if(students.containsKey(input)) {
				System.out.println(students.get(input).toString());
			} else System.out.println("데이터가 없습니다.");
		}
		
		System.out.println("종료합니다...");
		scanner.close();
		
	}

}
