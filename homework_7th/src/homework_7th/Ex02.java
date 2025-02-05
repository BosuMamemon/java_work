package homework_7th;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

//	Vector 컬렉션을 이용하여 강수량의 평균을 유지관리하는 프로그램을 작성하라.
//	강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량의 평균을 출력하라.
//	---------------------------------------------- 
//	강수량 입력(0 입력시 종료)>>5 
//	5
//	현재 평균 : 5
//	강수량 입력(0 입력시 종료)>>80 
//	5 80
//	현재 평균 : 42
//	강수량 입력(0 입력시 종료)>>53 
//	5 80 53 
//	현재 평균 46 
//	강수량 입력(0 입력시 종료)>>22 
//	5 80 53 22 
//	현재 평균 40 
//	강수량 입력(0 입력시 종료)>>0 
//	End
//	----------------------------------------------

public class Ex02 {

	public static void main(String[] args) {
		
//		객체 등 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> rainfalls = new Vector<>();
		
//		강수량 입력 반복문
		while(true) {
			System.out.print("강수량 입력(0 입력 시 종료) >> ");
			int rainfall = scanner.nextInt();
			if(rainfall == 0) break;
			rainfalls.add(rainfall);
			
//			역대 강수량 출력
			for(int i = 0; i < rainfalls.size(); i++) {
				System.out.print(rainfalls.get(i) + " ");
			}
//			평균 강수량 출력
			System.out.println();
			int sum = 0;
			for(int i = 0; i < rainfalls.size(); i++) {
				sum += rainfalls.get(i);
			}
			System.out.println("현재 평균 " + (sum / rainfalls.size()));
		}
			
		
		System.out.println("End");
		scanner.close();
		
	}
	
}
