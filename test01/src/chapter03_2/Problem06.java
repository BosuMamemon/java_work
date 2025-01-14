package chapter03_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 알아볼 달을 숫자로만 입력해주세요.");
		int month = sc.nextInt();
		
//		if(month==12 || month<=2) {
//			System.out.println(month + "월의 계절은 [ 겨울 ] 입니다.");
//		} else if(month<6) {
//			System.out.println(month + "월의 계절은 [ 봄 ] 입니다.");
//		} else if(month<9) {
//			System.out.println(month + "월의 계절은 [ 여름 ] 입니다.");
//		} else if(month<12) {
//			System.out.println(month + "월의 계절은 [ 가을 ] 입니다.");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		
//		switch 구문으로 위의 코드 만들기. (범위 값을 넣을 수 없기 때문에 값을 나열해야 함)
		
		switch(month) {
			case 3, 4, 5:
				System.out.println(month + "월의 계절은 [ 봄 ] 입니다.");
				break;
			case 6, 7, 8:
				System.out.println(month + "월의 계절은 [ 여름 ] 입니다.");
				break;
			case 9, 10, 11:
				System.out.println(month + "월의 계절은 [ 가을 ] 입니다.");
				break;
			case 12, 1, 2:
				System.out.println(month + "월의 계절은 [ 겨울 ] 입니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();

	}

}
