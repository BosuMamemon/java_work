package test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
//		HashMap 선언 및 생성
		HashMap<String, String> kor = new HashMap<>();
		
//		요소 삽입
		kor.put("baby", "아기");
		kor.put("love", "사랑");
		kor.put("apple", "사과");
		
//		요소 출력
		System.out.println(kor.get("baby"));
		
//		System.out.println();
//		for(int i = 0; i < kor.size(); i++)
//			System.out.println(kor.get(i));
//			=> HashMap은 get의 패러미터가 key값이라서 for문으로 전체출력을 할 수가 없음
		
		System.out.println();
		Set<String> keys = kor.keySet();
		Iterator<String> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			String key = keysIt.next();
			System.out.println(key + " => " + kor.get(key));
		}
		
//		Scanner로 단어 찾기 프로그램 만들기
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("찾고 싶은 단어는?");
			String eng = scanner.next();
			String k = kor.get(eng);
			if(k == null) {
				System.out.println("등록되지 않은 단어입니다.");
			} else {
				System.out.println(k);
			}
		}
		scanner.close();
		
	}
	
}
