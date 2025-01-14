package chapter02;

import java.util.Scanner;
// JDK에서 스캐너 클래스를 델꼬 오는 거임.

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean single = sc.nextBoolean();
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);
//		콘솔에서 키보드로 적으면 스캐너로 인식해가지고 원하는 정보를 프린트 해줌.
		
		sc.close();

	}

}
