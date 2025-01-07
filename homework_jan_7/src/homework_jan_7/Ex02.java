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
		System.out.println("1-99 사이의 정수를 입력하면, 그 수까지 3, 6, 9 게임을 합니다.");
		System.out.println("입력 종료를 원하시면 '종료'를 입력해주십시오.\n");
		
		while(true) {
			System.out.println("입력 = ");
			String input = sc.next();
			
			if(input.equals("종료")) {
				break;
			}
			
			try {
				int num = Integer.parseInt(input);
				
				while(!((num >= 1) && (num <= 99))) {
					System.out.println("\n값은 반드시 1-99 사이여야 합니다.\n");
					System.out.println("입력 = ");
					input = sc.next();
					num = Integer.parseInt(input);
				}
				
				System.out.println();
				for(int i = 1; i <= num; i ++) {
					int n1 = i / 10;
					int n2 = i % 10;
					int clap = 0;
					
					if((n1 == 3) || (n1 == 6) || (n1 == 9)) {
						clap++;
					}
					if((n2 == 3) || (n2 == 6) || (n2 == 9)) {
						clap++;
					}
					
					if(clap == 1) {
						System.out.println("<<< 박수짝! >>>");
					} else if(clap == 2) {
						System.out.println("<<<<< 박수짝짝!! >>>>>");
					} else {
						System.out.println("\" "+i+"! \"");
					}
				}
				
				System.out.println("\n또다른 정수를 입력해주십시오.\n");
			} catch(NumberFormatException e) {
				System.out.println("\n입력값은 반드시 정수여야만 합니다.");
			} finally {}
		}
		
		System.out.println("\n입력을 종료합니다.");
		sc.close();
	}
	
}
