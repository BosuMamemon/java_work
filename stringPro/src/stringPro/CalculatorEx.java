package stringPro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculatorEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1, 연산자, 숫자2를 입력하세요 >>");
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, "+-*/%", true);
		int sum = 0;
		
		int num1 = Integer.parseInt(st.nextToken().trim());
		String op = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken().trim());
		
		switch(op) {
		case "+":
			sum = num1 + num2; break;
		case "-":
			sum = num1 - num2; break;
		case "*":
			sum = num1 * num2; break;
		case "/":
			sum = num1 / num2; break;
		case "%":
			sum = num1 % num2; break;
		}
		
		System.out.println(sum);
		
	}

}
