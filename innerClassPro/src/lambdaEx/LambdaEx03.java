package lambdaEx;

interface Unit7 {
	
//	int getLength(String s);
//	void move(String s);
//	int sum(int x, int y);
	void move();
	
}

public class LambdaEx03 {
	
	public static void main(String[] args) {
		
////		Unit7 unit = (String s) -> { System.out.println(s); };
////		Unit7 unit = s -> { System.out.println(s); };
//		Unit7 unit = s -> System.out.println(s);
////		람다식.
////		패러미터 보내주고 출력문이 1줄 정도일때는 이렇게 간소화된 람다식을 잘 사용함
////		대신 인터페이스가 함수형 인터페이스(functional interface)여야함
////		심지어 자료형을 안적어줘도 상관없음
////		단, 패러미터가 2개 이상일 경우에는 자료형이랑 소괄호 적어줘야함
////		패러미터가 없을 때에도 소괄호 생략할 수 없음
////		심지어는 구현할 익명 내부 클래스에 중괄호조차 생략할 수 있음
////		단, 익명 내부 클래스에 return문이 있으면 중괄호 생략 불가능
//		unit.move("Lambda: Unit7");
		
//		Unit7 unit = s -> { return s.length(); };
////			return문이 포함되어 있어서 중괄호 생략 불가
//		int len  = unit.getLength("abcd");
//		System.out.println(len);
		
//		Unit7 unit = (int x, int y) -> { return x + y; };
////			패러미터가 2개 이상이고 return문을 포함하고 있으므로 소괄호 중괄호 둘다 생략 불가
//		System.out.println(unit.sum(10, 20));
		
		Unit7 unit = () -> { System.out.println("Hello, World!"); };
		unit.move();
		
	}

}
