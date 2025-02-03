package test02;

public class WrapperEx {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(10);
//		int i = 10; 이랑 거의 비슷한 표현임
		System.out.println(i);
		
		String s1 = "100";
		int i1 = Integer.parseInt(s1);
//		정수형 Wrapper 클래스의 static 메소드인 parseInt()를 사용하였음
//		Wrapper 클래스에 parse 메소드가 많아서 자주 써야댐 ㅋ.ㅋ
		System.out.println(i1);
		int i2 = Integer.valueOf(s1);
//		valueOf에 String을 써도 먹힘 ㅋㅋ
		System.out.println(i2);
		
		String s2 = "3.14";
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		double d2 = Double.valueOf(s2);
		System.out.println(d2);
		
		String s3 = "true";
		Boolean b1 = Boolean.valueOf(s3);
		System.out.println(b1);
		
		int i3 = i;
//		객체형으로 선언된 i를 기본형으로 선언된 i3에 집어넣어도 걍 집어넣어짐 ㅋㅋ 
		
		String s4 = Integer.toBinaryString(i3);
//		10을 2진수 String으로 변환
		System.out.println(s4);
		String s5 = Integer.toHexString(i3);
		System.out.println(s5);
//		10을 16진수 String으로 변환
		String s6 = Integer.toString(i3);
		System.out.println(s6);
//		10을 String으로 변환
		String s7 = Boolean.toString(false);
		System.out.println(s7);
		
	}
	
}
