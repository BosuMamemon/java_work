package test01;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(1, 15);
		
		System.out.println(a.size());
//		System.out.println(a.capacity()); <- ArrayList는 capacity()가 없음
		System.out.println();
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		
		a.remove(1);
		
		System.out.println();
		for(int i = 0; i < a.size(); i++)
			System.out.print(a.get(i) + " ");
		
	}

}
