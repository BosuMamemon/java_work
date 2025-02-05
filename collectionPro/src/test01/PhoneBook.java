package test01;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	
	public static void main(String[] args) {
		
		HashMap<String, String> pb = new HashMap<>();
		
		pb.put("홍길동", "010-0000-0000");
		pb.put("김태영", "010-1111-1111");
		pb.put("이준목", "010-2222-2222");
		pb.put("정현민", "010-3333-3333");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n전화번호를 검색할 이름을 입력하십시오.");
			System.out.println("입력을 종료하고 싶으시면 '종료'라고 입력하십시오. >>\n");
			String name = sc.next();
			if(name.equals("종료")) break;
			
			String phoneNum = pb.get(name);
			if(phoneNum == null) System.out.println("등록된 데이터가 없습니다.");
			else System.out.println(phoneNum);
		}
		
		System.out.println("\n입력을 종료합니다.");
		sc.close();
		
	}

}
