package chapter03;

import java.util.Scanner;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("점수 2개를 입력하시오.");
		int score1 = scnr.nextInt();
		int score2 = scnr.nextInt();
		
		System.out.println(score1>=70 && score2>=70); // 논리 곱. AND의 의미라서 둘 다 참이어야 참 반환.
		System.out.println(score1>=70 || score2>=70); // 논리 합. OR의 의미라서 둘 중 하나가 참이면 참 반환.
		System.out.println(!(score1>=70 && score2>=70));
		System.out.println(!(score1>=70 || score2>=70)); // !는 부정. 해당 논리값을 거꾸로 만들어 줌.
		
		scnr.close();

	}

}
