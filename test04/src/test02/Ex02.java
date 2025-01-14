package test02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Rectangle phone = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("핸드폰의 너비>> ");
		phone.width = sc.nextInt();
		System.out.println("핸드폰의 높이>> ");
		phone.height = sc.nextInt();
		
		System.out.println("핸드폰의 면적은 "+phone.getArea());
		
		sc.close();
	}

}
