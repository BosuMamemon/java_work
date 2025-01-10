package homework_jan_7;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		크기가 10인 배열을 작성하고
//		Math.random()함수를 사용하여 1~100사이의 숫자를 랜덤하게 생성하고
//		생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라.
//		(단 배열의 각 요소는 서로 다른 값만 저장되도록 한다.)
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 입력을 하면 3의 배수인 정수로 구성된 크기 10의 랜덤한 배열을 생성합니다.");
		System.out.println("'종료'를 입력하면 입력이 종료됩니다.");
		System.out.println("<< 입력 >>");
		String input = sc.nextLine();

		while (true) { 
			if(input.equals("종료")) {
				break;
			}
			
			System.out.print("랜덤 배열 arr = \n{ ");
//			이전 주소랑 지금 주소가 중복되는지를 검사를 못해 얘가
//			어떡하지?
//			죽여버리고 싶다
			for(int i = 0; i < arr.length;) {
				int num = (int)(Math.random() * 100) + 1;
				if(arr[i] == num) {
					continue;
				}
				else {
					if(num % 3 == 0) {
						arr[i] = num;
						System.out.print(arr[i] + " ");
					}
				}
				i++;
			}

			System.out.println("}");
			System.out.println("\n아무 입력을 하면 새로운 배열을 생성합니다.");
			System.out.println("'종료'를 입력하면 입력이 종료됩니다.");
			input = sc.nextLine();
		}

		System.out.println("\n입력이 종료됩니다.");
		sc.close();
	}
	
}
