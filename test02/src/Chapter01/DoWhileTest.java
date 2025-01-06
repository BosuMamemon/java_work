package Chapter01;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 11;
		int sum = 0;
		
		do {
			sum += num;
			num ++;
			System.out.println("sum = "+sum);
			System.out.println("number = "+num);
		} while(num <= 10);
//		while문이랑 달리 do while문은 조건문 점검을 나중에 실행한다는 차이점이 있음.
//		조건문이 충족되지 않더라도 최초에 실행문을 1번은 꼭 실행함!!!
		
		System.out.println("final sum = "+sum);
		System.out.println("final number = "+num);

	}

}
