package Chapter01;

import java.util.Scanner;

public class ExProblem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("소문자를 입력하면 대문자로 변환합니다.");
//		System.out.println("quit라고 입력하면 종료됩니다.");
//		String in = sc.next();
//		
//		while(!in.equals("quit")) {
//			char small = in.charAt(0);
//			int big_int = (int)small - 32;
//			char big = (char)big_int;
//			
//			System.out.println(big);
//			System.out.println("소문자를 입력하면 대문자로 변환합니다.");
//			System.out.println("quit라고 입력하면 종료됩니다.");
//			in = sc.next();
//		}
//		
//		System.out.println("콘솔이 종료됩니다.");
		
//		do while문으로 고친 위의 코드!!
		
		System.out.println("소문자를 입력하면 대문자로 변환합니다.");
		System.out.println("소문자와 ?를 같이 입력하면, 변환할 대문자와 소문자의 아스키 코드값을 출력합니다.");
		System.out.println("quit를 입력하면 콘솔을 종료합니다. \n");
		String in = sc.next();
		
		do {
			char small = in.charAt(0);
			int big_int = (int)small - 32;
			char big = (char)big_int;
			
			if(in.equals(small+"?")) {
				System.out.println("\n입력한 소문자 [ "+small+" ]의 아스키 코드 = "+(int)small);
				System.out.println("변환할 대문자 [ "+big+" ]의 아스키 코드 = "+big_int+"\n");
			} else {
				System.out.println(big);	
			}
			
			System.out.println("\n소문자를 입력하면 대문자로 변환합니다.");
			System.out.println("소문자와 ?를 같이 입력하면, 변환할 대문자와 소문자의 아스키 코드값을 출력합니다.");
			System.out.println("quit를 입력하면 콘솔을 종료합니다.\n");
			in = sc.next();
		} while(!in.equals("quit"));
		
		System.out.println("콘솔이 종료됩니다.");
		
		sc.close();

	}

}
