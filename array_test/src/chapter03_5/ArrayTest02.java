package chapter03_5;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int intArr[] = new int[5];
		int myArr[] = intArr; // 같은 배열에 또다른 참조 변수를 만든거임
		
		intArr[0] = 10;
		System.out.println(myArr[0]);
		
		myArr[0] = 20;
		System.out.println(intArr[0]);
		

	}

}
