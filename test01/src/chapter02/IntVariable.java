package chapter02;

public class IntVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte b=-128;
//		short s=12;
//		int i=12345;
//		long l=10; // 아무 말없이 long으로 선언하면 그냥 int 타입으로 저장됨.
//		long ll=10L; // 이렇게 해야 long 타입으로 저장이 됨.
//		int ii=10L; // int 타입에다 L 집어넣으면 에러가 뜸.
		
		char c1='A';
		char c2='a';
		char c3='가';
		int num1=c1;
		int num2=c2;
		int num3=c3; // 문자형인 c1, c2, c3을 정수형으로 저장한 것.
		char c4=65;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(c4);

	}

}
