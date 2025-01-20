package packagepro;

import java.util.Scanner;

class CurrencyConverter {
	
	private static double rate;
	public static void setRate(double r) { rate = r; }
	public static double toDollar(double won) { return won / rate; }
	public static double toWon(double dollar) { return dollar * rate; }
	
}

public class StaticMember {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환율(1달러) >>");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("100$는 " + CurrencyConverter.toWon(100) + "입니다.");
		sc.close();
	}

}
