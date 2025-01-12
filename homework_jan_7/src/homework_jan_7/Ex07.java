package homework_jan_7;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만들고,
//		사용자로부터 영어단어를 입력 받아 한글을 출력하는 프로그램을 작성하라.
//		"exit"을 입력하면 프로그램을 종료하라.
		
		String[] eng = { "student", "love", "java", "happy", "future" };
		String[] kor = { "학생", "사랑", "자바", "행복한", "미래" };
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("영어 단어를 입력하세요>>");
			String input = sc.next();
			
			if(input.equals("exit")) {
				break;
			}
			
			for(int i = 0; i < eng.length; i++) {
				if(input.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				} else {
					if(i == (eng.length - 1)) {
						System.out.println("그런 영어 단어가 없습니다.");
						break;
					}
				}
			}
		}
		
		System.out.println("종료합니다...");
		sc.close();
	}

}
