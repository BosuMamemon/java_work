package chapter02;

public class VarEx01 {

	public static void main(String[] args) {
		
		var num = 10;
		var dnum = 10.0;
		var str = "정현민";
//		var -> 자바 10.0 이상부터 사용가능한 지역 변수 자료형 추론. 컴파일러가 알잘딱하게 자료형 찾아 넣어줌.
//		int num = 10;
//		double dnum = 10.0;
//		string str = "정현민";
//		이랑 똑같은 코딩임!!
		
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(str);

	}

}
