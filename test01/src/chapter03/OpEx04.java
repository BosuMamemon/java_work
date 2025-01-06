package chapter03;

public class OpEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 2;
		System.out.println(num1<<=3); // num1의 비트를 왼쪽으로 3칸 밈. 즉 num1 * 2의3승.
		System.out.println(num1>>=2); // num1의 비트를 오른쪽으로 2칸 밈. 즉 num1 / 2의2승.
		
		System.out.println();
		
		int num2 = -8;
		System.out.println(num2>>2); // 부호 비트는 남겨두고 오른쪽으로 밈.
		System.out.println(num2>>>2); // 부호 비트까지 0으로 만들어버림.
		
		System.out.println();
		
		int a = 5;
		int b = 4;
		
//		비트끼리 &, |, ^ 연산을 하는 연산자들.
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b); // 배타적 or(exclusive or) -> 두 비트가 서로 다를 때만 1.
		
//		비트 연산(<<, >>, >>>, &, |, ^)도 복합 연산 가능. (<<= 같은 것들...)
		
		System.out.println();
		
		int fatherAge = 45;
		int motherAge = 47;
		System.out.println((fatherAge>motherAge)?'T':'F');
		

	}

}
