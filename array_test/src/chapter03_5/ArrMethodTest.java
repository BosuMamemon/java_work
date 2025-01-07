package chapter03_5;

public class ArrMethodTest {
	
	static int[] makeArray() {
		int[] Arr = {1, 2, 3, 4, 5};
		return Arr;
	}
	
	static void showArray(int[] Arr) {
		for(int num: Arr) {
			System.out.println(num);
		}
	}
	
	static void changeArray(int[] Arr) {
		for(int i = 0; i < Arr.length; i ++) {
			Arr[i] += 10;
		}
	}
	
	static int sum(int a, int b) {
		a += 10;
		System.out.println("함수 안 a = "+a);
		return a + b;
	}

	public static void main(String[] args) {
		int[] intArr = makeArray();
		showArray(intArr);
		
		changeArray(intArr);
		showArray(intArr);
		
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		
		System.out.println("num1 = " + num1);
//		sum 메소드 안에서 받은 a의 값은 +=가 되었지만, main 메소드 안의 num1 값은 변하지 않는다는 것을 알 수 있음.
		System.out.println(result);
	}

}
