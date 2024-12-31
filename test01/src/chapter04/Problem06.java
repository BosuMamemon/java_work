package chapter04;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 알아볼 달을 숫자로만 입력해주세요.");
		int month = sc.nextInt();
		
		if(month==12 || month<=2) {
			System.out.println(month + "월의 계절은 [ 겨울 ] 입니다.");
		} else if(month<6) {
			System.out.println(month + "월의 계절은 [ 봄 ] 입니다.");
		} else if(month<9) {
			System.out.println(month + "월의 계절은 [ 여름 ] 입니다.");
		} else if(month<12) {
			System.out.println(month + "월의 계절은 [ 가을 ] 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();

	}

}
