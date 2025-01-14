package chapter02;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		byte b = 3;
		int num = b;
//		작은 byte에서 큰 int로 묵시적 형 변환해서 걍 스무스하게 변환됨.
		
//		b = num; <- 큰 형식에서 작은 형식으로 바꾸면 변환이 안 됨.
		b = (byte)num;
//		그래서 이렇게 명시적 형 변환을 해줘야 함.
		
//		int num1 = num + 3.5;
//		num은 정수 데이터인데 3.5라는 실수랑 연산을 할려고 하니까 묵시적 형 변환이 안되서 에러가 생김.
//		실수형이 정수형보다 더 크니까는...
		int num1 = (int)(num+3.5);
//		그래서 이렇게 정수로 형 변환을 해줘야 함.
		
		System.out.println(num1);

	}

}
