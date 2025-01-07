package chapter03_5;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numArr[] = new int[7];
		
//		double num = Math.random();
//		Math.random -> Math 클래스의 random 함수.
//		Math 클래스란 수학과 관련된 함수, 연산자를 불러올 때 쓰는 클래스임
//		Math.random() -> 0~1사이의 실수를 랜덤하게 발생시키는 함수
//		1~100 사이의 정수를 만들고 싶으면 다음과 같이 하면 됨.
//		int num = (int)(Math.random() * 100) + 1;
//		0~99 까지의 랜덤한 정수에다 +1을 했음. 그래서 1~100임.
		
		System.out.print("금주 로또 번호 = ");
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(numArr[i]+" ");
		} // 1~100 사이 랜덤한 정수를 배열 안에 집어넣었음.

	}

}
