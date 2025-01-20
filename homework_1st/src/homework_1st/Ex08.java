package homework_1st;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//		컴퓨터와 사용자의 가위바위보 게임 프로그램을 작성하라.
//		사용자가 입력하고 <Enter>키를 치면, 컴퓨터는 랜덤하게 가위, 바위, 보 중 하나를 선택한다.
//		그리고 누가 이겼는지 출력한다.
//		"그만"을 입력하면 게임을 종료한다.
		
		String[] str = { "가위", "바위", "보" };
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위 바위 보!>>");
			String input = sc.next();
			
			if(input.equals("그만")) {
				break;
			}
			
			int num = (int)(Math.random() * 3);
			if(str[num].equals("가위")) {
				if(input.equals(str[num])) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 비겼습니다.");
				} else if(input.equals("바위")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
				} else if(input.equals("보")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
				}
			} else if(str[num].equals("바위")) {
				if(input.equals(str[num])) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 비겼습니다.");
				} else if(input.equals("보")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
				} else if(input.equals("가위")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
				}
			} else if(str[num].equals("보")) {
				if(input.equals(str[num])) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 비겼습니다.");
				} else if(input.equals("가위")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
				} else if(input.equals("바위")) {
					System.out.println("사용자 = "+input+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
				}
			}
		}
		
		System.out.println("게임을 종료합니다...");
		sc.close();
	}

}
