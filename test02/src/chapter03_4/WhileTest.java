package chapter03_4;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num ++;
			System.out.println("sum = "+sum);
			System.out.println("number = "+num);
		}
		
		System.out.println("final sum = "+sum);
		System.out.println("final number = "+num);

	}

}
