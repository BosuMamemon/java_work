package chapter03_4;

public class Homework02 {

	public static void main(String[] args) {
		
		for(int i=-5; i<=5; i++) {
			for(int j=-5; j<=5; j++) {
				if(Math.abs(j)<=5-Math.abs(i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
