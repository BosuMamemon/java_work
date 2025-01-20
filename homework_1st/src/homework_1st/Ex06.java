package homework_1st;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		'일', '월' ,'화', '수', '목', '금', '토'로 초기화된 문자 배열 day를 선언하고
//		사용자로부터 정수를 입력받아 7(배열 day의 크기)로 나눈 나머지를 인덱스로 하여
//		배열 day에 저장된 문자를 출력하라.
//		음수가 입력되면 프로그램을 종료하라.
//		아래 실행결과와 같이 예외 처리하라.
		Scanner sc = new Scanner(System.in);
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		
		while(true) {
			try {
				System.out.println("정수를 입력하세요>>");
				String input = sc.next();
				
				int num = Integer.parseInt(input);
				
				if(num < 0) {
					break;
				}
				
				int index = num % 7;
				System.out.println(day[index]);
			} catch(NumberFormatException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
			}
		}
		
		System.out.println("프로그램 종료합니다...");
		sc.close();
	}

}
