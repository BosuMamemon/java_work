package homework_7th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

//	“그만”이 입력될 때까지 나라의 이름과 인구를 입력받아 저장하고,
//	다시 나라의 이름을 입력하면 인구를 출력하는 프로그램을 작성하시오.
//	다음의 해시맵을 이용하라. 
//	HashMap<String, Integer> nations = new HashMap<String, Integer>();

public class Ex01 {
	
	public static void main(String[] args) {
		
//		객체 등 선언 생성
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요.(예. Korea 5000)");
		
//		해쉬맵 삽입 반복문
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String input = scanner.nextLine();
			if(input.equals("그만")) break;
			
			StringTokenizer st = new StringTokenizer(input, " ");
			nations.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			
		}
		
//		해쉬맵 검색 반복문
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = scanner.next();
			if(search.equals("그만")) break;
			
			if(nations.containsKey(search)) {
				System.out.println(search + " 인구는 " + nations.get(search));
			} else {
				System.out.println(search + " 나라는 없습니다.");
			}
		}
		
		System.out.println("End");
		scanner.close();
		
	}

}
