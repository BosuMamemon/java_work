package chapter04;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("음료수 종류 번호를 숫자로만 입력하십시오.\n\n"
				+ " -------------------\n"
				+ "| 1. 에스프레소: 2000원 |\n"
				+ "| 2. 아메리카노: 2500원 |\n"
				+ "| 3. 카푸치노: 3000원  |\n"
				+ "| 4. 카페 라떼: 3500원 |\n"
				+ " -------------------\n");
		System.out.println("'종료'라고 입력하시면 콘솔이 종료됩니다.\n");
		String in = sc.next();
		
		do {
			int drink = (int)in.charAt(0);
			int price = 0;
			String name = "name";
			
			do {
				if(drink == 1) {
					price = 2000;
					name = "에스프레소";
				} else if(drink == 2) {
					price = 2500;
					name = "아메리카노";
				} else if(drink == 3) {
					price = 3000;
					name = "카푸치노";
				} else if(drink == 4) {
					price = 3500;
					name = "카페 라떼";
				} else {
					System.out.println("잘못 선택하셨습니다. 다시 입력해주십시오.");
				}
				in = sc.next();
				drink = (int)in.charAt(0);
			} while(name.equals("name"));
			
			System.out.println("선택하신 음료는 [ "+name+" ]입니다.");
			System.out.println("\n주문하실 수량을 숫자로만 입력하십시오.\n");
		
			in = sc.next();
			int num = (int)in.charAt(0);
			int pay = price * num;
			
			
			
			if(num == 0) {
				System.out.println("\n올바른 수량을 입력해주십시오.\n");
			}
		
			System.out.println("\n지불하실 금액은 [ "+pay+" ]원입니다.\n"
					+"감사합니다!\n");
		
			System.out.println("새로운 음료를 주문해주십시오.");
			System.out.println("'종료'라고 입력하시면 콘솔이 종료됩니다.\n");
			in = sc.next();
		} while(!in.equals("종료"));
		
		System.out.println("콘솔이 종료됩니다.");
		
		sc.close();

	}

}
