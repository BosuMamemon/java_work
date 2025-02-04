package collectionPro;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("이름을 입력하세요 >>");
			String name = sc.next();
			a.add(name);
			System.out.println();
		}
		
		for(String i: a)
			System.out.print(i + " ");
		
		System.out.println();
		int longIdx= 0;
		for(String i: a)
			if(a.get(longIdx).length() < i.length())
				longIdx = a.indexOf(i);
		System.out.println(a.get(longIdx));
		
	}

}
