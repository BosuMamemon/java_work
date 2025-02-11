package lambdaEx;

interface Unit6 {
	
	void move(String s);
	
}

public class LambdaEx02 {
	
	public static void main(String[] args) {
		
		Unit6 unit = new Unit6() {
//			익명 내부 클래스를 사용하여 인터페이스를 구현한 클래스를 생성하고 있음
//			이때는 문장 끝에 세미콜론을 붙여줘야함. (당연함. 선언 및 생성 문장이니까....)
			@Override
			public void move(String s) {
				System.out.println(s);
			}
		};
		unit.move("Lambda: Unit6");
		
	}

}
