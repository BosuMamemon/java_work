package chapter03;

public class OpEx {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.0; // 항 하나가 실수면 결과도 실수로 묵시적 형 변환이 됨. 
		
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1 / num2);
//		나눗셈 후 몫을 구함. (정수와 정수를 나누면 결과도 정수로 나옴.)
//		System.out.println(num1 % num2); // 나눗셈 후 나머지를 구함.
		
//		int result = num1++; // num1을 result에 대입한 후에, num1+1. num--도 마찬가지.(전위연산자)
//		int result = ++num1; // num1+1를 한 후에 result에 대입. --num도 마찬가지. (후위연산자)
		
//		System.out.println(num1);
//		System.out.println(result);
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2); // 크거나 같다.
		System.out.println(num1 <= num2); // 작거나 같다.
		System.out.println(num1 == num2); // 값이 같다. ('='는 대입 연산자.)
		System.out.println(num1 != num2); // 값이 같지 않다.
//		관계 연산자는 값이 무조건 true 아니면 false임.
		
	}

}
