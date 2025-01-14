package chapter03_5;

public class ArrayTest01 {

	public static void main(String[] args) {
		
//		int intArr[]; // 배열 선언: '스택'이라는 메모리 공간에 정수형 배열을 위한 4바이트 공간을 하나 만듬.
//		intArr = new int[10]; // 초기화
//		int[] intArr = new int[10]; // 배열 선언 및 초기화 한꺼번에 하는 코드 
//		char[] charArr = new char[20];
		double dArr[] = new double[10];
//		int testArr[] = {1, 2, 3, 4, 5}; // 배열 선언하고 값까지 한꺼번에 넣은 거임
		
//		intArr[0] = 10;
//		intArr[5] = 20;
//		intArr[9] = 60;
//		intArr[10] = 100; <- int[10]짜리 배열에선 안들어가는 인덱스
//		값을 안 넣은 int 배열 인덱스엔 디폴트 값이 0이 들어감
//		값을 안 넣은 char 배열 인덱스엔 디폴트 값이 " "가 들어감
//		값을 안 넣은 char 배열 인덱스엔 디폴트 값이 "0.0"이 들어감
		
//		char ch = 'A';
//		for(int i=0; i<26; i++) {
//			charArr[i] = ch++;
//			System.out.println(charArr[i]);
		
		for(int i=0; i<10; i++) {
			System.out.println(dArr[i]);
		}

	}

}
