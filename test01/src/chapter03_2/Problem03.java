package chapter03_2;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요.");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int avg = (score1 + score2) / 2;
		
		System.out.println("평균 점수: " + avg);
		if (avg>=70 && score1>=60 && score2>=60) {
			if(avg >= 90) {
				System.out.println("1등급");
			} else if(avg >= 80) {
				System.out.println("2등급");
			} else if(avg >= 70) {
				System.out.println("3등급");
			}
		} else {
			System.out.println("불합격");
		}
		
		sc.close();

	}

}
