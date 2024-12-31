package chapter02;

public class ConstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.14;
		final int MAX_NUM = 100;
		
//		PI = 3.141592; <- 이렇게 새로 값 지정하면 에러 뜸.
//		상수 이름은 전부 대문자로 적어주는 게 관례. (개발자들이 코드 보는 중에 MAX_NUM <- 요따구로 적힌 거 보면 상수인 줄 알아보고 긴장 탐)
		
		System.out.println(PI);
		System.out.println(MAX_NUM);

	}

}
