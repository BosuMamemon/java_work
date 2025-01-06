package Chapter01;

public class ContunueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum += i;
			System.out.println("i = "+i);
			System.out.println("sum = "+sum);
		}
		
		System.out.println("1부터 100까지 홀수의 합 = "+sum);
		
		
		
		
		
		System.out.println();
		sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			sum += i;
			System.out.println("i = "+i);
			System.out.println("sum = "+sum);
		}
		
		System.out.println("1부터 100까지 짝수의 합 = "+sum);
	}

}
