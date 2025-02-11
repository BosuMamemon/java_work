package lambdaEx;

public class LambdaEx01 {
	
	public static void main(String[] args) {
		
		Unit5 unit = new Human5();
//			업캐스팅. 클래스의 주소를 인터페이스 객체 변수에 부여할 수가 있음
		unit.move("Lambda: Unit5");
//			평범하게 인터페이스를 구현한 클래스를 사용하고 있음
		
	}

}
