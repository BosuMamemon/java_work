package chapter03_2;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요.");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		if((score1 >= 80) && (score2 >= 80)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		sc.close();

	}

}
