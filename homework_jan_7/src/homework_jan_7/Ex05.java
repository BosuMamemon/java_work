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
			
			int num = (int)(Math.random() * 100) + 1;
			System.out.print("랜덤 배열 arr = \n{ ");
			if((num % 3) == 0) {
				for(int i = 0; i < arr.length;) {
					for(int j = 0; j <= i; j++) {
						if(arr[i] == num) {
							break;
						}
						else {
							arr[i] = num;
							i++;
							System.out.print(num + ", ");
							break;
						}
					}
					num = (int)(Math.random() * 100) + 1;
				}
			}
			System.out.println(" }");
			
			for(int k: arr) {
				System.out.println(arr[k]);
			}
			
			System.out.println("\n아무 입력을 하면 새로운 배열을 생성합니다.");
			System.out.println("'종료'를 입력하면 입력이 종료됩니다.");
			input = sc.nextLine();

//			int k = 0;
//			while(true) {
//				int num = (int)(Math.random() * 100) + 1;
//				if((num % 3) == 0) {
//					boolean dup = false;
//					for(int i = 0; i < k; i++) {
//						if(arr[i] == num) {
//							dup = true;
//						}
//						else {
//							arr[k++] = num;
//							break;
//						}
//					}
//				}
//				if(k >= arr.length) {
//					break;
//				}
//			}
		}

		System.out.println("\n입력이 종료됩니다.");
		sc.close();
	}
	
}
