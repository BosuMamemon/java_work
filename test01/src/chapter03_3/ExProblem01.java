package chapter03_3;

import java.util.Scanner;

public class ExProblem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자, 연산자, 두번째 숫자를 스페이스바로 구분하여 값을 얻고자 하는 식을 적어주세요.");
		
		int num1 = sc.nextInt();
		char opr = sc.next().charAt(0);
		int num2 = sc.nextInt();
		int result = 0;
		
//		switch(opr) {
//			case '+': result = num1 + num2;
//				break;
//			case '-': result = num1 - num2;
//				break;
//			case '*': result = num1 * num2;
//				break;
//			case '/': result = num1 / num2;
//				break;
//			case '%': result = num1 % num2;
//				break;
//			default: System.out.println("산술 연산자만을 입력해주세요.");
//		}
//		switch 문은 ""를 통해 String 값을 그냥 바로 집어넣을 수 있어서 편하긴 함.
		
//		if문으로 위 코드 다시 짜기
		
		if(opr=='+') {
			result = num1 + num2;
		} else if(opr=='-') {
			result = num1 - num2;
		} else if(opr=='*') {
			result = num1 * num2;
		} else if(opr=='/') {
			result = num1 / num2;
		} else if(opr=='%') {
			result = num1 % num2;
		} else {
			System.out.println("산술 연산자만을 입력해주세요.");
		}
//		단, 변수 opr을 참조형 변수인 String 등으로 받았다면, == 연산자를 사용할 수 없음.
//		기본형 변수는 값을 선언된 메모리에 바로 저장하지만, 참조형 변수는 값을 heap 메모리에 저장했다가 그 메모리 주소만을 불러오기 때문!! 
//		이럴 땐 ~~.equals(변수명)등의 함수를 사용해서 String의 내용끼리 비교해야 함.
//		example)
//			if(opr.equals("+") {
//				result = num1 + num2;
//			} else if(opr.equals("-") {
//				result = num1 - num2;
//			} else if(opr.equals("*")) {
//				result = num1 * num2;
//			} else if(opr.equals("/")) {
//				result = num1 / num2;
//			} else if(opr.equals("%")) {
//				result = num1 % num2;
//			} else {
//				System.out.println("산술 연산자만을 입력해주세요.");
//			}
		
		System.out.println(result);
		
		sc.close();

	}

}
