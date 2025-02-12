package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
//		객체 등 생성
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> scores = new HashMap<>();
		
//		해시맵 값 저장
		System.out.println("학생의 이름과 점수를 입력하세요.(예: 홍길동 80)");
		while(true) {
			System.out.printf("학생 이름, 점수 >> ");
			String name = sc.next();
			if(name.equals("그만")) break;
			int score = sc.nextInt();
			
			scores.put(name, score);
		}
		
//		성적 검색 반복문
		while(true) {
			System.out.print("학생의 성적 검색 >> ");
			String search = sc.next();
			if(search.equals("그만")) break;
			
			if(scores.containsKey(search))
				System.out.printf("%s의 점수는 %d점입니다.%n", search, scores.get(search));
			else
				System.out.println(search + "은(는) 등록된 데이터가 아닙니다.");
		}
		
		System.out.println("End");
		sc.close();
		
	}
	
}
