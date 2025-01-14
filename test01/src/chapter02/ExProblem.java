package chapter02;

import java.util.Scanner;

public class ExProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("영문자 소문자를 입력하면 대문자를 출력합니다.");
		
		String in = scanner.next();
		char small = in.charAt(0);
		int big = (int)(small) - 32;
		
		System.out.println((char)big);
		
		scanner.close();

	}

}
