package homework_3rd;

// 다음 프로그램의 실행 결과는 무엇일까? 이유를 설명하라. 

// public class Hello {
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

		
			public static void main(String[] args) { 
				Integer x = Integer.valueOf(10); 
				giveMeAString(x);
				System.out.println(x);
			}
			static void giveMeAString(Integer y) {
				y = y.valueOf(20);
			}
			
		
	
}
