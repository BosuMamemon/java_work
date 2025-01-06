package Chapter01;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		아스테리크로 정사각형 찍기
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		아스테리크로 직각삼각형 찍기
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
				
//		아스테리크로 역 직각삼각형 찍기
		for(int i=10; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		아스테리크로 피라미드 찍기
		for(int i=0; i<10; i++) {
			for(int j=-10; j<=10; j++) {
				if(Math.abs(j)<=i) { // j의 절댓값(abs)이 i보다 작거나 같을 때~ 라는 조건식
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		아스테리크로 역 피라미드 찍기 (내가 할 것)
//		아스테리크로 다이아몬드 찍기 (내가 할 것)

	}

}
