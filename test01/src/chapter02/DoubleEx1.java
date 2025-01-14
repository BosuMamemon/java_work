package chapter02;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		double dnum1 = 3.14;
		float fnum = 3.14F; // float 타입은 뒤에 식별자 F를 적어줘야 인식함.
		double dnum2 = 1;
		
		System.out.println(dnum1);
		System.out.println(fnum);
		
		for(int i=0; i<10000; i++) { // for 반복문으로 정수 i(0부터 9999까지)번 더하는 것을 반복하라는 메소드.
			dnum2 = dnum2 + 0.1;
		}
		System.out.println(dnum2);
//		실수 형식은 부동소수점(floating point) 방식으로 값을 저장해서 0을 표현할 수 없기 때문에, 근사치만 저장할 수 있음.
		
		

		boolean isMarried = true;
		boolean isHungry = false;
		
		System.out.println(isMarried);
		System.out.println(isHungry);
		
	}

}
