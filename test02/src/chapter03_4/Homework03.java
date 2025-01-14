package chapter03_4;

public class Homework03 {

	public static void main(String[] args) {
		
		for(int i=10; i>=5; i-- ) {
			for(int j=i; j>=i-5; j--) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
