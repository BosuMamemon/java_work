package test03;

import test01.Person;

public class MethodTest {

//	static void increase(int m) {
//		m = m + 1;
//	}
	
	static int increase(int m) {
		return m + 1;
	}
	
	static void arrayIncrease(int[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i] += 10;
		}
	}
	
	static void objMethod(Person p) {
		p.age = 30;
		p.name = "kkkk";
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int[] arr = {1, 2, 3, 4, 5};
		Person p = new Person("aaa", 20);
		p.display();
		
		increase(a);
		System.out.println(a);
		
		arrayIncrease(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
		objMethod(p);
		System.out.println();
		p.display();
		
	}
	
}
