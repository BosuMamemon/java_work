package homework_6th;

import java.util.Scanner;

// p.281 6번 문제
 
public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) {
			System.out.print("\n가위(1), 바위(2), 보(3), 끝내기(4) >>");
			int input =  sc.nextInt();
			if(input == 4) exit = true;
			
			int rsp = (int)(Math.random() * 3) + 1;
			switch(input) {
			case 1:
				switch(rsp) {
				case 1:
					System.out.println("사용자 가위 : 컴퓨터 가위");
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("사용자 가위 : 컴퓨터 바위");
					System.out.println("사용자가 졌습니다.");
					break;
				case 3:
					System.out.println("사용자 가위 : 컴퓨터 보");
					System.out.println("사용자가 이겼습니다.");
					break;
				}
				break;
			case 2:
				switch(rsp) {
				case 1:
					System.out.println("사용자 바위 : 컴퓨터 가위");
					System.out.println("사용자가 이겼습니다.");
					break;
				case 2:
					System.out.println("사용자 바위 : 컴퓨터 바위");
					System.out.println("비겼습니다.");
					break;
				case 3:
					System.out.println("사용자 바위 : 컴퓨터 보");
					System.out.println("사용자가 졌습니다.");
					break;
				}
				break;
			case 3:
				switch(rsp) {
				case 1:
					System.out.println("사용자 보 : 컴퓨터 가위");
					System.out.println("사용자가 졌습니다.");
					break;
				case 2:
					System.out.println("사용자 보 : 컴퓨터 바위");
					System.out.println("사용자가 이겼습니다.");
					break;
				case 3:
					System.out.println("사용자 보 : 컴퓨터 보");
					System.out.println("비겼습니다.");
					break;
				}
				break;
			}
		}
		
//		System.out.println("게임을 종료합니다...");
		sc.close();
		
	}

}
