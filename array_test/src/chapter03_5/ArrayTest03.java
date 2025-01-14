package chapter03_5;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int intArr[] = {10, 7, 8, 45, 52, 13, 25, 1, 103, 4, 232, 141};
		
		
//		배열 안에서 제일 큰 값 찾기!!
		
		int max = 0;
//		
//		for(int i=0; i<intArr.length; i++) {
//			if(intArr[i] > max) {
//				max = intArr[i];
//			}
//		}
//		
//		System.out.println("max = "+max);
		
		
//		위 코드를 for-each문으로 작성하기
		
		for(int i: intArr) {
			if(i > max) {
				max = intArr[i];
			}
		}
		
		System.out.println("max = "+max);
		
		
//		배열 원소의 평균값 찾기!!
		
		int sum = 0;
		
//		for(int i=0; i<intArr.length; i++) {
//			sum += intArr[i];
//		}
//		
//		double avr = (double)sum / (double)intArr.length;
//		
//		System.out.println("avr = "+avr);
		
		
		
//		위 코드를 for-each문으로 작성하기
		
		for(int i: intArr) {
			sum += i;
		}
		
		double avr = (double)sum / (double)intArr.length;
		
		System.out.println("avr = "+avr);
		
	}

}
