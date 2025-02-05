package Exam;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam01 {

	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 실수를 입력하세요.");
			v.add(sc.nextDouble());
		}
		
		Double max = 0.0;
		Iterator<Double> it = v.iterator();
		while(it.hasNext()) {
			Double next = it.next();
			if(next > max) max = next;
		}
		System.out.println("가장 큰 수는 " + max);
		sc.close();
		
	}
	
}
