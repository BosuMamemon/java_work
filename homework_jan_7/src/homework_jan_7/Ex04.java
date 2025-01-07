package homework_jan_7;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		소문자 알파벳을 하나 입력받아서 다음과 같은 결과가 나타나도록 코드를 작성하시오.
//		소문자 알파벳 하나를 입력하시오>> e
//		abcde
//		abcd
//		abc
//		ab
//		a
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오");
		System.out.println("입력 종료를 원하시면 '종료'를 입력하시오>> ");
		
		while(true) {
			String input = sc.next();
			
			if(input.equals("종료")) {
				break;
			}
			
			while(true) {
				if(input.length() > 1) {
					break;
				}
				
				char cha = input.charAt(0);
				int cha_int = (int)cha - 96;
				
				if(!((cha_int >= 1) && (cha_int <= 26))) {
					break;
				}
				
				for(int i = cha_int; i > 0; i--) {
					for(int j = 0; j < i; j++) {
							System.out.print((char)(j + 97));
					}
					System.out.println();	
				}
				System.out.println("\n또다른 소문자 알파벳 하나를 입력하시오>> ");
				input = sc.next();
				cha = input.charAt(0);
				cha_int = (int)cha - 96;
			}
			
			System.out.println("\n입력값은 오직 소문자 알파벳 1글자여야 합니다.");
			System.out.println("소문자 알파벳 하나를 입력하시오>> ");
		}
		
		System.out.println("\n입력을 종료합니다.");
		sc.close();
	}

}
