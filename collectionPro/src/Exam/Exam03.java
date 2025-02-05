package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("에스프레소", 2000);
		map.put("아메리카노", 2500);
		map.put("카푸치노", 3000);
		map.put("카페라떼", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		
		while(true) {
			System.out.print("주문 >> ");
			String input = scanner.next();
			
			if(input.equals("그만")) break;
			
			if(map.get(input) == null) System.out.println("다시 입력해주십시오.");
			else System.out.println(input + "는 " + map.get(input) + "원입니다.");
		}
		
		scanner.close();
		
	}

}
