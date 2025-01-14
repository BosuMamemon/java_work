package chapter03;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("점수를 2개 입력하든지 흥");
		int score1 = scnr.nextInt();
		int score2 = scnr.nextInt();
		
		System.out.println( (((score1+score2)/2)>=70)?"합격!! 대박 ㅋㅋ":"불합격 ㅠㅠ" );
		
		scnr.close();
		

	}

}
