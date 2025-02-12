package exam;

import java.util.Scanner;

public class PhoneManager {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Phone 객체 배열 생성
		System.out.print("인원수 >> ");
		int n = sc.nextInt();
		Phone[] phones = new Phone[n];
		
//		Phone 객체 생성
		for(int i = 0; i < n; i++) {
		System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
		String name = sc.next();
		String tel = sc.next();
		String address = sc.next();
		phones[i] = new Phone(name, tel, address);
		}
		System.out.println("저장되었습니다...");
		
//		검색 반복문
		while(true) {
			System.out.print("검색할 이름 >> ");
			String search = sc.next();
			boolean flag = false;
			
			if(search.equals("exit")) break;
			
			for(int i = 0; i < phones.length; i++) {
				if(phones[i].getName().equals(search)) {
					System.out.printf("%s의 번호와 주소는 %s, %s입니다.%n", phones[i].getName(), phones[i].getTel(), phones[i].getAddress());
					flag = true;
				}
			}
			if(!flag) System.out.println(search + "은(는) 없습니다.");
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();
		
	}

}
