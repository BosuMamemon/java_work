package test03;

public class Hello {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
//		System.out.println(args[3]);
//		args = main 메소드에 문자열을 입력했을 때 사용하는 배열
//		System.out.println(args[3]); 의 경우 문법은 틀리지 않았지만
//		args 배열에 값이 없으므로 java.lang.ArrayIndexOutOfBoundsException라는 오류가 발생하고
//		이런 걸 "예외"라고 부름
	}

}
