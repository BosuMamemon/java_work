package Chapter01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		while문의 무한반복 테스트
		while(true) {
			System.out.println("대소문자 변환, 소문자 입력, 종료조건: quit 입력");
			String s = sc.next();
			if(s.equals("quit")) {
				break;
			}
			char ch = s.charAt(0);
			System.out.println((char)(ch-32));
		}
		
//		do {
//			System.out.println("do while");
//			
//			int a = 10;
//			
//			if(a==10)
//				break;
//		} while(true);
//		
//		for() {
//			System.out.println("for");
//		}

	}

}
