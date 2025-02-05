package test01;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(); // ctrl + shift + o 누르면 자동 import
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator<Integer> it = a.iterator(); // Iterator 선언 및 생성(생성자)
		while(it.hasNext()) // StringTokenizer의 hasMoreToken()이랑 비슷한 메소드인듯 
			System.out.println(it.next()); // 이것도 ㅇㅇ
		
	}

}
