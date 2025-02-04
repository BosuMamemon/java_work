package stringPro;

import java.util.Random;

public class MathEx {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int n = (int)(Math.random() * 30) + 70;
//				70~99 사이의 난수 ((0~29) + 70 이라서)
			System.out.println(n);
		}
		
		System.out.println();
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			int n = r.nextInt(30) + 70;
//				70~99 사이의 난수 ((0~29) + 70 이라서) 
			System.out.println(n);
		}
		
	}

}
