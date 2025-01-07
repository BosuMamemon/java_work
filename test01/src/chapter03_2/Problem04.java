package chapter03_2;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("서로 다른 숫자 3개를 입력하면 가장 큰 값을 출력합니다.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("가장 큰 수는 "+a+"입니다.");
			} else {
				System.out.println("가장 큰 수는 "+c+"입니다.");
			}
		} else {
			if(b>c) {
				System.out.println("가장 큰 수는 "+b+"입니다.");
			} else {
				System.out.println("가장 큰 수는 "+c+"입니다.");
			}
		}
		
		sc.close();

	}

}
