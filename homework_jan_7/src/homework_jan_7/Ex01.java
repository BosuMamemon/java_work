package homework_jan_7;

import java.util.Scanner;

public class Ex01 {
	
	static int[] makeArray() {
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		return arr;
	}

	public static void main(String[] args) {
//		지불할 금액을 정수로 입력 받아 화폐단위가 각각 몇 개씩 필요한지 출력하는 프로그램을 작성하시오.
//		입력은 최소 10만원 단위로 입력,
//		화폐단위는 50000, 10000, 5000, 1000, 500, 100, 50, 10,  5, 1 10가지이며,
//		가능한 큰 화폐단위로 지불,
//		입력이 236,873이면
//		50000원권 4매, 10000원권 3매, 5000원권 1매, 1000원권 1매, 500원 1매, 100원권 3매, 50원권 1매, 10원권 2매, 5원권 0매, 1원권 3개로 출력하라. 
//		단 화폐단위는 배열에 저장한다.
		
		Scanner sc = new Scanner(System.in);
		int[] denom = makeArray();
		System.out.println("지불하실 화폐 권종을 출력하는 프로그램입니다.");
		System.out.println("지불하실 금액을 최소 100000 이상의 정수로 입력해주십시오.");
		System.out.println("프로그램 종료를 원하시면 '종료'라고 입력해주십시오.\n");
		
		while(true) {
			System.out.println("입력 = ");
			String input = sc.next();
			
			if(input.equals("종료")) {
				break;
			}
			
			try {
				int num = Integer.parseInt(input, 10);
				
				while(!(num >= 100000)) {
					System.out.println("\n값은 최소 100000 이상의 정수여야 합니다.");
					System.out.println("입력 = ");
					input = sc.next();
					num = Integer.parseInt(input, 10);
				}
					
				int cash = num;
				int quotient = 0;
				int remainder = 0;
				
				System.out.println();
				for(int i = 0; i < denom.length; i ++) {
					quotient = cash / denom[i];
					remainder = cash % denom[i];
					cash = remainder;
					
					System.out.println(denom[i] + "원권 [ " + quotient + " ]매");
				}
				System.out.println("\n또다른 금액을 입력하시거나, '종료'를 입력해주십시오.\n");	
			} catch(NumberFormatException e) {
				System.out.println("\n입력값은 정수여야만 합니다.");
			} finally {}
		}
		
		System.out.println("\n프로그램이 종료됩니다.");
		sc.close();
	}

}
