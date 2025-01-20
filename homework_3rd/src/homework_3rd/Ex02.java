package homework_3rd;

// 다음 프로그램의 실행 결과는 무엇일까? 이유를 설명하라. 

//public class Hello {
//
//	public static void main(String[] args) { 
//		Object x = null; 
//		giveMeAString(x); 
//		System.out.println(x); 
//	}
//	static void giveMeAString(Object y) {
//		y = "This is a string";
//	}
//	
//}

public class Ex02 {

//	1. Object x의 정보형 Object는 생성자를 통해 생성되지 않았으므로, 참조형 데이터라고 볼 수 있음.
//	2. Object는 참조변수 x를 가지고 값은 null임.
//	3. 참조변수 x는 giveMeAString() 메소드의 인수가 됨.
//	4. giveMeAString() 메소드의 패러미터인 Object y가 참조변수 x를 복사함
//	5. 참조변수 y에 할당된 Object의 값이 "This is a String"이 됨.
//	6. 메소드가 종료되고 패러미터 y는 사라짐
//	7. 참조변수 x에 할당된 Object의 값은 "This is a String"이 됨.
	
}
