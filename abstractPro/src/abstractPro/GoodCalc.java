package abstractPro;

abstract class Calculator {
//	추상 클래스
	
	//	추상 메소드
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	
}

public class GoodCalc extends Calculator {
	
	@Override
//	@ =  어노테이션. 컴파일에 참여가능한 주석.
//	추상 메소드 구현
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(1, 2));
		System.out.println(c.subtract(1, 2));
		System.out.println(c.average(new int[] {1, 2, 3, 4, 5}));
	}
	
}
