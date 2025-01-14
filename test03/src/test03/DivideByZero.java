package test03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend; // 나뉨수
		int divisor; // 제수(나누는 수)
		
		try {
			System.out.println("나뉨수를 입력하세요.");
			dividend = sc.nextInt();
			
			System.out.println("제수를 입력하세요.");
			divisor = sc.nextInt();
			
			System.out.printf("[ %d ]을/를 [ %d ]로 나누면 몫은 [ %d ] 입니다.%n", dividend, divisor, dividend / divisor);	
		} catch(ArithmeticException e) {
			e.printStackTrace();
//				개발할 때 주로 쓰는 함수
//				추적한 예외를 출력하고 그 뒤 로직을 실행함.
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
		} catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("정수가 아닌 문자를 입력했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {}
		
		System.out.println("끝.");
		sc.close();
	}

}
