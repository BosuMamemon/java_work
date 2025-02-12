package exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		알파벳 입력 받기
		System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
		String input = sc.next();
		
//		알파벳 아스키 코드 추출(a = 97)
		int ch = (int)input.charAt(0);
		int num = ch - 97;
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)(j + 97));
			}
			System.out.println();
		}
		
		sc.close();
	}
	
}
