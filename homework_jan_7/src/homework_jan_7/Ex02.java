package homework_jan_7;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		임의의 숫자를 입력하여 369게임을 간단하게 작성.
//		1-99까지 정수를 입력하고
//		3,6,9 중 하나가 있는 경우 ‘박수짝’을 출력하고,
//		두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3, 6, 9 게임 프로그램입니다.");
		System.out.println("1-99까지 정수를 입력해주십시오.");
		System.out.println("프로그램 종료를 원하시면 '종료'를 입력해주십시오.\n");
		String input = sc.next();
		
		while(!input.equals("종료")) {
			int num = Integer.parseInt(input);
			
			while((num < 1) || (num > 99) ) {
				System.out.println("\n잘못 입력하셨습니다. 다시 입력해주십시오.\n");
				input = sc.next();
				num = Integer.parseInt(input);
			}
			
			int n1 = num / 10;
			int n2 = num % 10;
			int clap = 0;
			
			if((n1 == 3) || (n1 == 6) || (n1 == 9)) {
				clap ++;
			}
			if((n2 == 3) || (n2 == 6) || (n2 == 9)) {
				clap ++;
			}
			
			if(clap == 1) {
				System.out.println("\n박수짝!\n또 입력해봐!\n");
			} else if(clap == 2) {
				System.out.println("\n박수짝짝!\n또 입력해봐!\n");
			} else {
				System.out.println("\n"+num+"!\n또 입력해봐!\n");
			}
			
			input = sc.next();
		}
		
		System.out.println("\n프로그램을 종료합니다.");
		sc.close();
	}

}
